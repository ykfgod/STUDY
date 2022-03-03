package ZaurStart.Lesson7;

public class Test1Glavni {
    public static void main(String[] args) {

        Glavni g = new Glavni(500);
        g.DvoinayaZP();

        Glavni g1 = new Glavni(500);
        g1.c = 444;
        System.out.println(g1.c);
    }
}
