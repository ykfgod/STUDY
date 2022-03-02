package ZaurStart.Lesson5;

/**
 * Описание метода. Метод или иначе функция показывает свойства класса:
 * Например в классе Car (int id, String name, double speed) - это поля(параметры)
 * А скорость, торможение и т.д. это свойства машины - это и есть методы
 */

public class About_Methods_FIRST_TOREAD {

    //Главный метод psvm для запуска программы
    public static void main(String[] args) {

        summa3chisel sum = new summa3chisel(); // создание ссылки и объекта класса summa3chisel

        //Создание переменной типа инт и вызов метода summa, класса summa3chisel с передаными параметрами
        int result = summa3chisel.summa(3,4,312);

        System.out.println(result);
        System.out.println(summa3chisel.summa(321,12,314)); // вывод без создания переменной

        // Вызов метода , который в себе использует другой метод
        System.out.println(summa3chisel.sredneeArifm(325,12,321));

    }

}

class summa3chisel {

    // Метод для подсчета суммы 3 чисел
    // тут указаны все обязательные обазночения для создания метода
    // int - тип ВОЗВРОЩАЕМОГО значения, summ - название метода
    // в () тип ПРИНИМАЕМЫХ значений, но метод может не принимать их вовсе
    // return возврощает результат, который должен совпадать с типом ВОЗВРАЩЕНОГО значения

    static int summa(int a, int b, int c) {

        int result = a + b +c;
        return result; // всегда последняя строка в методе !!!

    }

    /*
           Метод в методе. Методы могут использовать другие методы
           в данном примере метод считает среднее арифиметическое и использует метод
           summ для сложения 3 чисел
     */
    static int sredneeArifm(int a1, int b1, int c1) {

        int result1 = summa(a1,b1,c1)/3;
        return result1;

    }

}
