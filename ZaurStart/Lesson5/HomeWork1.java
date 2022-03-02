package ZaurStart.Lesson5;

public class HomeWork1 {

    public static void main(String[] args) {

        BankAccount bA1 = new BankAccount(1, "Yaroslav Shangin", 300.23);
        bA1.info();
        bA1.popolnenie(200);
        bA1.info();
        bA1.snatye(10);
        bA1.info();

        System.out.println();

        Student st1 = new Student("Yaroslav", 3, 6.4, 8.2, 9.3, 5.6);
        st1.info();
        System.out.println(st1.name + " имеет среднюю оценку " + st1.srednOcenka(st1.Algebra
                , st1.Fizika, st1.Eng, st1.Math));
    }

}

class BankAccount {

    int id;
    String name;
    double balance;

    BankAccount (int i, String n, double b) {
        id = i;
        name = n;
        balance = b;
    }

    double popolnenie(double a) {
        balance +=a;
        return balance;
    }

    double snatye(double a) {
        balance -=a;
        return balance;
    }

    void info() {
        System.out.println("ID счета " + id
                            + " имя " + name + " баланс " + balance);
    }
}

class Student {
    String name;
    int course;
    double Math;
    double Algebra;
    double Fizika;
    double Eng;

    Student (String n, int c, double m, double a, double f, double e){

        name = n;
        course = c;
        Math = m;
        Algebra = a;
        Fizika = f;
        Eng = e;

    }

    double srednOcenka (double m, double a,double f, double e) {
        double result = (m+a+f+e) / 4;
        return result;
    }

    void info() {
        System.out.println("Имя " + name + " курс " + course);
    }

}
