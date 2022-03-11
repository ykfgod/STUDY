package ZaurStart.Lesson18;
/*
    String всегда immutable, тоесть не изменяемы так как имеет final в своем классе и все мтоды void
    В отличии от String, StringBuilder mutable, тоесть меняет строку не создавая новый объект в памяти
    Поэтому StringBuilder использщуется для экономии памяти в том числе
    StringBuilder также находится в подпакет java.lang.* поэтому не нужно импортировать так как станадарт

    StringBuffer имеет те же ствойства, что и StringBuilder, НО используется там, где есть многопоточность
 */
public class StringBilder_class {

    public static void main(String[] args) {
        // Примеры создания StringBuilder
        StringBuilder s = new StringBuilder();
        StringBuilder s1 = new StringBuilder("Privet");
        StringBuilder s2 = new StringBuilder(50); //Указываем вместимость 50, но строка пустая
        StringBuilder s3 = new StringBuilder(s1); // Присваивание значения другого StringBuilder

        // Методы StringBuilder есть похожие со String, а есть свои которые МЕНЯЮТ строку, а не создают
        // объект

        // method lenth() выводит длину строки
        System.out.println();
        System.out.println(s1.length());

        // method charAt() выводит символ по индексу в строке
        System.out.println();
        System.out.println(s1.charAt(3));

        // methods indexOf() выводит индекс строки
        System.out.println();
        // System.out.println(s.indexOf('Y')); в отличии от String параметр только СТРОКА
        System.out.println(s1.indexOf("riv"));
        System.out.println(s1.indexOf("vet", 2)); // выводит индекс сивола, начиная с указаного

        //method substring() возвращает строку с индекса
        System.out.println();
        System.out.println(s1.substring(5)); // с какого индекса
        System.out.println(s1.substring(2, 5)); // с начала и по какой индекс не включительно

        StringBuilder prakt = new StringBuilder("Dlinaya Stroka !!!!!!!!!");

        // Эти методы есть только в StringBuilder, но нет в String, Так как они меняют сам StringBuilder
        // А не создают новый объект

        // method append() добавляет в конец строки любой тип данных преобразуя их в строку
        System.out.println();
        prakt.append("???");
        prakt.append(true);
        System.out.println(prakt);

        // method insert() добавляет по индексу к строке  любой тип данных преобразуя их в строку
        System.out.println();
        prakt.insert(7, " Ewe Slovo");
        System.out.println(prakt);

        // method delete() удоляет строке с индекса начала по индекс конца
        System.out.println();
        prakt.delete(24, 40);
        System.out.println(prakt);

        // method deleteCharAt() удоляет символ из строки по индексу
        System.out.println();
        prakt.deleteCharAt(24);
        System.out.println(prakt);

        // method reverse() переворачивает строку задом на перед
        System.out.println();
        prakt.reverse();
        System.out.println(prakt);

        prakt.reverse();

        // method replace() заменяет строку с начального индекса по конечный другой строкой в параметре
        System.out.println();
        prakt.replace(0, 7, "Zamenil na Yarik");
        System.out.println(prakt);

        // method capacity() показывает ВМЕСТИМОСТЬ строки, не путать с длиной
        System.out.println();
        System.out.println(prakt.capacity());

        // Methods chaining цепь методов для строки
        System.out.println();
        System.out.println(prakt.append(8923).append("SDJSDAJKLd").substring(9,31));

        // method equals() не переопределен для StringBuilder, и работает как ==
        StringBuilder a = new StringBuilder("Privet");
        StringBuilder b = new StringBuilder("Privet");

        System.out.println(a == b);
        System.out.println(a.equals(b)); // Тоже false
    }

}
