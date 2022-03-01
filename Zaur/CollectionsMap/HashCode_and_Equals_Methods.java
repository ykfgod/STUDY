package Zaur.CollectionsMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *  ПРИ ПЕРЕОПРЕДЕЛЕНИИ ОДНОГО ИЗ МЕТОДОВ НАПРИМЕР EQUALS
 *  ЛУЧШЕ ПЕРЕОПРЕДЕЛИТЬ И ВТОРОЙ МЕТОД HASHCODE, ДАЖЕ ЕСЛИ ОН НЕ НУЖЕН
 *  ДЛЯ ИЗБЕЖАНИЯ ОШИБОК В БУДУЮЩЕМ ЕСЛИ ЭТОТ МЕТОД ПОНАДОБИТСЯ
 */

public class HashCode_and_Equals_Methods {

    public static void main(String[] args) {

        Map<Student, Double> student = new HashMap<>();
        Student st1 = new Student("Yaroslav", "Shangin", 3);
        Student st2 = new Student("Anton", "Veltov", 1);
        Student st3 = new Student("Marina", "Kravec", 2);

        student.put(st1, 8.6);
        student.put(st2, 6.2);
        student.put(st3, 7.8);

        System.out.println(student);

        // В данном примере при создании нового студента идентичного одному
        // из элементов в Map метод containsKey
        // возвращет false, если не переопределить метод hashCode
        // хотя equals переопределенный метод возвращает true
        // ВАЖНО! сначало метод hashCode используется, а потом за ним equals
        Student st4 = new Student("Ivan", "Talkovec", 2);
        boolean result = student.containsKey(st4);
        System.out.println("result = " + result);
        System.out.println(st3.equals(st4));

        // Метод hashCode который переопределили в классе Student
        // возвращает int пример c 1 закомментированым  hashCode
//        System.out.println(st1.hashCode());
//        System.out.println(st2.hashCode());
//        System.out.println(st4.hashCode());

        // Метод 2 hashCode который переопределили в классе Student
        // одинаковые значения 14 Map разных студентов, это называется
        // коллизии и этого нужно избегать
//            System.out.println(st3.hashCode());
//            System.out.println(st4.hashCode());

        // Метод 3 hashCode который переопределили в классе Student
        // испровляет частично эту проблему посредством умножения
        // всех полей на числа
        System.out.println(st3.hashCode());
        System.out.println(st4.hashCode());

        /*
        ВАЖНО! ЕСЛИ СОГЛАСНО МЕТОДО EQUALS ОБЪЕКТЫ РАВНЫ ТО HASHCODE
        ЭТИХ ОБЪЕКТОВ ДОЛЖНЫ БЫТЬ РАВНЫ ТАК КАК СНАЧАЛА ИСПОЛЬЗУЕТСЯ
        HASHCODE А ЗА НИМ МЕТОД EQUALS.

        А ЕСЛИ СОГЛАСНО МЕТОДУ EQUALS ОБЪЕКТЫ НЕ РАВНЫ, ТО HASHCODE ЭТИХ
        ОБЪЕКТОВ НЕ ОБЯЗАТЕЛЬНО ДОЛЖНЫ БЫТЬ РАВНЫ "КОЛЛИЗИИ" - ЭТО КОГДА
        HASHCODE РАВНЫ, ЧЕМ ИХ МЕНЬШЕ ТЕМ ЛУЧШЕ
         */

        // Реализация интерфейса Map также позволяет получить наборы как ключей,
        // так и значений. А метод entrySet() возвращает набор всех элементов в виде ОБЪЕКТОВ
        // Map.Entry<K, V>. getKey() - для получения ключа, entry.getValue - для получения значения
        // ОСНОВНОЕ ОТЛИЧЕ ЧТО ОН ПРОХОДИТ ПО КЛЮЧ-ЗНАЧЕНИЕ, а не только по 1 как я понял
        for (Map.Entry<Student, Double> entry: student.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}

class Student {

    String name;
    String surname;
    int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    // Переопределение метода equals для возможности сравнения 2 студетов
    // потому что метод equals не знает как их сравнивать
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surname, course);
//    }

//    @Override
//    public int hashCode() {
//        return name.length() + surname.length() + course;
//    }

    @Override
    public int hashCode() {
        return name.length()*7 + surname.length()*4 + course*93;
    }
}
