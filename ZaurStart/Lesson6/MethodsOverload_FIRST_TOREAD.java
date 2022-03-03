package ZaurStart.Lesson6;

/*
    Перегрузка (Overloading) методов позвалет использовать одинаковые название методов
    но с разными по типу параметрами, по их количеству или с одинаковыми параметрами
    НО в разном порядке

    Модификаторы доступа могут быть разные или одинаковые

    Очень удобно чтобы не путаться
    это достигается тем что Java сначалаищет метод по названию, а потом по типу параметров

 */

public class MethodsOverload_FIRST_TOREAD {

    //  3 перегруженых с разными параметрами

    void show(int a) {
        System.out.println(a);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String s, int a) {
        System.out.println(s+ " " +a);
    }

    void show(int a, String s) {
        System.out.println("Тут мы меняем возраст и Имя");
        System.out.print(a+ " " +s);
    }

}

class Methods_Test {

    public static void main(String[] args) {

        MethodsOverload_FIRST_TOREAD mO = new MethodsOverload_FIRST_TOREAD();
        int a = 500;
        mO.show(a);

        boolean b1 = true;
        mO.show(b1);

        String s = "Yaroslav" ;
        int b = 24;
        mO.show(s, b); //первый метод с одинаковыми параметрами
        mO.show(b, s); //второй метод с одинаковыми параметрами но в разном порядке в их принятии
    }
}