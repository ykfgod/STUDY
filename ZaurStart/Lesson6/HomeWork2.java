package ZaurStart.Lesson6;

public class HomeWork2 {

    static int summ(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    static int summ(int a, int b, int c) {
        return a+b+c;
    }

    static int summ(int a, int b) {
        return a+b;
    }

    static int summ(int a) {
        return a;
    }

    static int summ() {
        return 0;
    }

}

class HomeWorkTest {

    public static void main(String[] args) {

        int result = 0;
        result = HomeWork2.summ(3,8,2,1);
        System.out.println(result);

        result = HomeWork2.summ(3,8,2);
        System.out.println(result);

        result = HomeWork2.summ(3,8);
        System.out.println(result);

        result = HomeWork2.summ(3);
        System.out.println(result);

        result = HomeWork2.summ();
        System.out.println(result);

        Student st1 = new Student(1, "Yaroslav", "Shangin", 4, 9.8);
        Student st2= new Student(2, "Dmitri", "Lavrov", 3);
        Student st3= new Student();

        System.out.println(st1.sredOcenka); // 9.8
        System.out.println(st2.name); // Dmitri
        System.out.println(st3.surname); // null


    }

}

class Student {

    int id;
    String name;
    String surname;
    int course;
    double sredOcenka;

    Student(int id2, String name2, String surname2, int course2, double sredOcenka2){

        id = id2;
        name = name2;
        surname = surname2;
        course = course2;
        sredOcenka = sredOcenka2;

    }

    Student(int id3, String name3, String surname3, int course3){

        this(id3, name3, surname3, course3, 0.0);

    }

    Student(){

        this(0, null, null, 0, 0.0);

    }

}
