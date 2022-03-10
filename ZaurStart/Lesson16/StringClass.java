package ZaurStart.Lesson16;

import java.util.Locale;

public class StringClass {
    final static String s = "Yaroslav Shangin";
    final static String ss = "  dasda   ";
    public static void main(String[] args) {
        String st1 = new String("Hi"); // создание НОВОГО объекта класса String

        String st2 = "Hello"; // создание строки "Hello"
        String st3 = "Hello"; // Java видит что в String пуле уже есть Hello
                              // и теперь ничего не создает и st2 и st3 ссылаются на один объект

        String st4 = new String ("Yarik");
        String st5 = new String ("Yarik");
        System.out.println(st4 == st5); // false ссылаются на разные объекты
        System.out.println(st2 == st3); // true ссылаются на одинаковые объекты в String pool

        // method equals() уже перепопределен Java разработчиками и он проверяет СОДЕРЖИМОЕ
        // на что ссылаются ссылки, поэтому st4.equals(st5) будет True
        System.out.println("equals method");
        System.out.println(st4.equals(st5));

        // method equalsIgnoreCase() сравнивает СОДЕРЖИМОЕ не смотря на то заглавные или пропеисные символы
        String st6 = "Kak Dela?";
        String st7 = "kak dela?";
        System.out.println("equalsIgnoreCase method");
        System.out.println(st6.equalsIgnoreCase(st7)); // true не смотря на Заглавные буквы в st6

        System.out.println();
        System.out.println(s);

        // method lenth() выводит длину строки
        System.out.println();
        System.out.println(s.length());

        // method charAt() выводит символ по индексу в строке
        System.out.println();
        System.out.println(s.charAt(3));

        // methods indexOf()
        System.out.println();
        System.out.println(s.indexOf('Y')); // выводит индекс символа
        System.out.println(s.indexOf("Shanin")); // выводит индекс строки
        System.out.println(s.indexOf('a', 4)); // выводит индекс сивола, начиная с указаного
                                                            // индекса
        System.out.println(s.indexOf("lav", 2)); // выводит индекс сивола, начиная с указаного
                                                            // индекса

        // methods startWith() начинается ли строка с указаной строки в параметре
        // и возвращает boolean
        System.out.println();
        System.out.println(s.startsWith("Yaroslav"));
        System.out.println(s.startsWith("Putin", 9)); //начинается ли строка с указаного индекса

        // method endWith заканчивается ли строка на строку укзанную в параметре
        // и возвращает boolean
        System.out.println();
        System.out.println(s.endsWith("Shangin"));

        //method substring() возвращает строку с индекса
        System.out.println();
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 9)); // с начала и по какой индекс не включительно

        //method trim() убирает пробелы в начале и конце строки, но не внутри
        System.out.println();
        System.out.println(ss);
        System.out.println(ss.trim());

        // method replace() заменяет в строке символы или сабстроки
        // символ меняется только на символ, а строка только на строк!!!
        System.out.println();
        System.out.println(s.replace('S','T'));
        System.out.println(s.replace("Shangin","Putin"));

        // method toLowerCase(); делает все символы маленькими в строке
        System.out.println();
        System.out.println(s.toLowerCase());

        // method toUpperCase(); делает все символы заглавными в строке
        System.out.println();
        System.out.println(s.toUpperCase());

        // method contains(); выводет boolean значение существует ли такая строка в строке
        System.out.println();
        System.out.println(s.contains("Shangin"));

        // Methods chaining цепь методов для строки
        System.out.println();
        System.out.println(s.replace("Shangin", "Putin").trim().substring(9,14));
    }
}
