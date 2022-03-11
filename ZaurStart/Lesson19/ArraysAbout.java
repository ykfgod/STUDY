package ZaurStart.Lesson19;
/*
     Массивы
     Методы этого класса нужно ипортировать чтобы использовать находятся по адресу
     import java.util.Arrays;
 */

import java.util.Arrays;

public class ArraysAbout {

    public static void main(String[] args) {

        String [] array; // объявление переменной ссылки массива
        int [][] array2; // объявление переменной ссылки двумерного массива (одномерные массивы элементы
                         // другого одномерного)

        array = new String[5]; // создание массива и присваивание ссылке
        array2 = new int[5][4]; // создание двумерного массива и присваивание ссылке

        int [][] array3;
        array3 = new int[3][]; // Мы можем объявить двумерный массив, с неизвестным количеством элементов
                                // в под массиве но не наоборот например [][4]

        System.out.println(array2[2][1]); // Пример вывода элемента массива, дефолтные значения для
                                          // для каждого типа данных, если элемент не задан

        System.out.println(array2.length); // Вывод длины массива ОНА В КЛАССЕ Array НЕ МЕТОД а ПЕРЕМЕННАЯ

        // ПРИМЕРЫ СТАНДАРТНЫХ ОБЪЯВЛЕНИЙ МАССИВОВ
        int [] a = {1, 2,312, -3, 0 , 3211};
        int [] b = new int [17];

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // Метод класса Arrays (Массивы) sort сортирует элементы по возрастанию
        Arrays.sort(a);

        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        String [] s = {"privet", "slon", "ok"};
        Arrays.sort(s);
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }

        // Метод класса Arrays (Массивы) binarySearch возвращает индекс искомого элемента в массиве
        // НО ТОЛЬКО В УЖЕ ОТСАРТИРОВАНОМ МАССИВЕ

        System.out.println();
        System.out.println(Arrays.binarySearch(a, 2));

        int [] x = {1, 2,312, -3, 0 , 3211};
        int [] y = {1, 2,312, -3, 0 , 3211};

        // Метод equals также не переопредлен для массивов и равен ==
        System.out.println();
        System.out.println(x == y);
        System.out.println(x.equals(y));

        // Еще конструкторы для String и StringBuilder с помощью массива char

        char [] c = {'p', 'r','i','v','e','t'};

        String str = new String(c);
        System.out.println(str);

        // Перегруженные методы StringBuilder с массивами в парметре
        StringBuilder str2 = new StringBuilder("Hello World");
        str2.append(c, 0 , 6 ); // из массива c добавить с 0 элеметна
                                          // 6 символов к STringBuilder
        System.out.println(str2);

        str2.insert(2, c, 1, 3); //со 2 индекса добавить элементы массива с
                                                 // с 1 индекса 3 элемента
        System.out.println(str2);


    }

}
