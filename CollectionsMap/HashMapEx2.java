package CollectionsMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ВАЖНО HASHMAP NOSYNHTONIZED И НЕ ИСПОЛЬЗУЕТСЯ В МНОГОПОТОЧНОСТИ
 */
public class HashMapEx2 {

    public static void main(String[] args) {

        // Для HashMap мы можем задать размер 1 параметр initialCapasity
        // который говорит о начальном размере массива в Map и 2 параметр
        // который редко меняется и говорит на каком элементе массив будет
        // увеличиваться initialCapasity 16 * 0.75 = 12, в данном сулачае на
        // 12 элементе
        Map<Integer, String> map = new HashMap<>(16, 0.75f);

        /*
            Еще важно знать, что при большом количестве элементов LinkedList в нодах
            Map, LinkedList заменяется на сбалансированные деревья, которые используют
            по сути бинарный поиск.
         */

        Map<Student1, Double> map1 = new HashMap<>();
        Student1 st1 = new Student1("Yaroslav", "Shangin", 3);
        map1.put(st1, 7.6);

        System.out.println(map1.containsKey(st1));

        // Если бы мы не поставили final для класса Student1 и его полей
        // и заменили курс у студента выдало бы false, потому что изменился
        // hashCode студента. Поэтому класс и все его поля должны быть immutable
        // (не изменяемые), для этого мы ставим final
//        System.out.println(map1.containsKey(st1));
//        st1.course = 4;

    }
}

final class Student1 {
    final String name;
    final String surname;
    final int course;

    public Student1(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return course == student1.course && Objects.equals(name, student1.name) && Objects.equals(surname, student1.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }
}
