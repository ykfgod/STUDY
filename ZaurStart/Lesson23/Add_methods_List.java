package ZaurStart.Lesson23;
import java.util.ArrayList;
import java.util.List;

/*
    Еще методы класса ArrayList и List
 */
public class Add_methods_List {

    public static void main(String[] args) {

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("one");
        l1.add("two");
        l1.add("three");
        l1.add("four");
        l1.add("five");

        ArrayList<String> l2 = new ArrayList<>();
        l2.add("one");
        l2.add("two");
        l2.add("three");

        // Method removeAll(List) удалеяет ArrayList в другом ArrayList по совпадениям
        l1.removeAll(l2);
        System.out.println("l1 = " + l1);

        // Method retainAll(List) замещаяет ArrayList в другом ArrayList по совпадениям (только те
        // элементы которые есть)
        l2.add("four");
        l2.add("five");
        l1.retainAll(l2);
        System.out.println("l1 = " + l1);

        // Method containsAll(List) проверяет есть ли все элементы листа в листе2 и возвращает boolean

        System.out.println(l1.containsAll(l2));

        // Method subList возвращает представление ArrayList в виде List с начального индекса
        // по конечный не включительно и эти коллекции взаимосвязаны, придобавлении в subList
        // элемент также добавится в ArrayList, НО НЕ НАОБОРОТ при добавлении в ArrayList
        // БУДУЕТ ОШИБКА

        ArrayList<String> l3 = new ArrayList<>();
        l3.add("one");
        l3.add("two");
        l3.add("three");
        l3.add("four");
        l3.add("five");

        List<String> sublist = l3.subList(0, 4); // с 0 по 4 индекс не включительно
        System.out.println(l3);
        System.out.println(sublist);

        // добавление в subList добавило элемент и в ArrayList
        sublist.add("Yarik");
        System.out.println(l3);
        System.out.println(sublist);

        // А при добавлении в ArrayList и вывод на экран subList выходит ошибка
//        l3.add("Shangin");
//        System.out.println(l3);
//        System.out.println(sublist);

        // List.of() и List.of(ArrayList) создает List с переданными в него объектами
        // либо коллекцей, ИХ МЕНЯТЬ УЖЕ НЕЛЬЗЯ используется после Java 8 (посмотреть, скачав JDK)
        // выше 8 версии

    }

}
