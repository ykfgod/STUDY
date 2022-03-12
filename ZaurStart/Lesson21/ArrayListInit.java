package ZaurStart.Lesson21;

import java.util.ArrayList;

/*
    ArrayList - Это список внутрик которого лежит массив типа Object
    В отличии от простого массива ArrayList динамический и может изменять длину
    ArrayList находится в библиотеке по адресу import java.util.ArrayList;
 */
public class ArrayListInit {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(); // Объявление ArrayList
        list1.add(3); // Метод add() добавляет элементы в список
        list1.add(8);
        list1.add(31);
        System.out.println(list1);

        // Объявление ArrayList который содержит определенный тип данных в данном случае
        // только String
        ArrayList <String> list2 = new ArrayList <String> ();
        ArrayList <String> list3 = new ArrayList <>(); // тоже самое только короче
        list2.add("privet");
        list2.add("poka");
        System.out.println(list2);

        // Создание ArrayList с вместимотью 30, default capacity = 10
        ArrayList <String> list4 = new ArrayList <>(30);

        // Создание ArrayList с параметром другого ArrayList, ссылаться они будут на разные объекты
        ArrayList <String> list5 = new ArrayList <>(list2);
        System.out.println(list2 == list5); //false
    }

}
