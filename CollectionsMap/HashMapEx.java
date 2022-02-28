package CollectionsMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        // Map могут быть разные значения например <String, String>
        // <String, Integer>, <String, Class>
        // Map<Integer, String> map = new HashMap<>();

        Map<Integer, String> map = new HashMap<>();

        //Метод put аналог метода add в коллекциях типа ArrayList
        // и LinkedList, добавляет элемент в Карту
        map.put(1000, "Yaroslav Shangin");
        map.put(321, "Ivan Ivanov");
        map.put(712, "Irina Gubanova");

        // Ключи должны быть уникальными и могут содержать null (только 1 соответсвтенно)
        // Значения могут повторяться и могут содержать null (много значений может быть)
        map.put(387, "Regina Sheveleva");
        map.put(123, "Regina Sheveleva");

        //При одинаковых ключах последнее добовление с таким же ключем
        //Меняет прошлое зачение с сохранением ключа
        map.put(777, "Regina Sheveleva");
        map.put(777, "Valemtrin Strikalo");

        // null примеры
        map.put(null, "Regina Sheveleva");
        map.put(981, null);
        map.put(543, null);

        // Метод putIfAbsent добовляет элемент, если такого еще нет (смотрит по ключу)
        // Если есть как в примере ниже, то код просто игнорируется.
        map.putIfAbsent(1000, "Yaroslav Shangin");

        System.out.println(map);

        // Метод get() выводит элемент только по ключу, если такого элемента нет
        // выводится null
        System.out.println(map.get(1000));
        System.out.println(map.get(1001));

        // Метод remove() удалет элемент из Map по ключу
        map.remove(123);
        System.out.println(map);

        // Метод constainsValue возвращает true/false есть ли такое значение
        // элемента в Map. (принимает значение, а не ключ)
        System.out.println(map.containsValue("Yaroslav Shangin"));

        // Метод constainsKey возвращает true/false есть ли такой ключ
        // в Map. (принимает ключ, а не значение)
        System.out.println(map.containsKey(1000));

        // Метод keySet() возвращает все множество ключей из Map
        System.out.println(map.keySet());

        // Метод values() возвращает все множество значений из Map
        System.out.println(map.values());
    }

}
