package ZaurStart.Lesson7;
/*
    Модификатор доступа public дает доступ в самом классе Glacni
    В другом классе описанном в этом же коде class ATest
    В другом классе в этом же пакете Test1Glavni
    В других пакетах ZaurStart.Lesson7.Test2Glavni.Test2GlavniIN

    private виден ТОЛЬКО внутри класса где используется например
    переменная int a в классе Glavni

    (default) модификатор дает доступ только к самому классу и всем классам в пакете
    где находится главный класс пример переменная int b // В таком случае ничего не пишется

    protected модификатор дает доступ только к самому классу и всем классам в пакете
    где находится главный класс так же как и (default), НО также виден классам которые
    наследуются от этого класса и НЕ ВАЖНО где они находятся, хоть в другом пакете
    пример int c
 */
public class Glavni {
    //
    private int a;
    int b;
    protected int c;

    double salary;

    public void DvoinayaZP() {
        System.out.println("Dvoyna  Z/P = " + salary*2);
    }

    public Glavni(double salary1){
        salary = salary1;
    }

    public static void main(String[] args) {

        Glavni g = new Glavni(500);
        g.DvoinayaZP();

        Glavni g2 = new Glavni(500);
        g2.a = 777;
        System.out.println(g2.a);
    }

}


class ATest {
    public static void main(String[] args) {

        Glavni g = new Glavni(500);
        g.DvoinayaZP();

        Glavni g1 = new Glavni(500);
        g1.c = 444;
        System.out.println(g1.c);

    }
}