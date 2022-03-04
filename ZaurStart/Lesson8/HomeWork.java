package ZaurStart.Lesson8;

class HomeWork {

    static int multi (int b, int c, int d) {

        int result = b*c*d;
        return result;

    }

    static double del (double a, double b) {

        double result = a/b;
        return result;

    }
}

class Zadanie2 {

    static final double pi = 3.14;

    double Radius(double radius) {

        double result = pi * radius * radius;
        return result;

    }

    static double DlinaOkryj (double raduis) {

       double result = pi * raduis * 2;
        return result;
    }

    //+ " Dlina okryjnosti = " + DlinaOkryj(radius)
    // +   Radius(radius)
    void Info(double r) {

        System.out.println("Radius = " + r + " Ploshad kryga = " +   Radius(r)
                + " Dlina okryjnosti = " + DlinaOkryj(r));

    }


}

class HomeWorkTest {

    public static void main(String[] args) {

        System.out.println(HomeWork.multi(3,6,3));
        System.out.println(HomeWork.multi(9,3,11));

        System.out.println(HomeWork.del(831,18));
        System.out.println(HomeWork.del(772,31));

        Zadanie2 z = new Zadanie2();
        z.Info(9);
    }

}
