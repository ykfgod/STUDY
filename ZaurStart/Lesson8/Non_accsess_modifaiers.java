package ZaurStart.Lesson8;

/*
    Существует 3 non-accsess-modifaiers:  final , static, abstract
    Для переменых final задает константоное значение, которое нельзя изменить (int a)
    они должгы бить определены зарание либо читай ниже
    Для каждого конструктора мы можем определить свое константное значение (int b)
    final для ссылочных типов данных не позволяет менять ССЫЛКУ, но поля менять можно
    как в примере объект Car в классе Human

    static дает переменной принадлежность к самому классу, а не созданому объекту
    этим классом, поэтому она может меняться в методах этого класса, ведь создается не
    новое поле этого класса, а меняется общая переменная как например int course в классе Student
    их можно использовать НЕ создавая объекта

    static МЕТОДЫ можно использовать без создания объекта, а вот без static, мы должны СОЗДАТЬ объект
    которому этот медтод принадлежит и вызвать его у объекта
 */

public class  Non_accsess_modifaiers {

    public final int a = 10;
    public final int b;

    Non_accsess_modifaiers(){
        b = 17;
    }

    Non_accsess_modifaiers(boolean c) {
        b = 30;
    }

    public static void main(String[] args) {

    }
}

class Car {

    String color = "blue";
    String engine = "V8";

}

class Human {

    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {

        Human h1 = new Human();
        // h1.c = new Car(); нельзя менять ссылку на объект, т.к она final

        h1.c.color = "red"; // А вот поля менять можно
        System.out.println(h1.c.color);

    }

}

class Student {

    String name;
    int course;
    static int count; // создание общего счетчика для количества студентов

    Student(String name1, int course1) {
        name = name1;
        course = course1;
        count++;
        System.out.println("Student # " + count + " sozdan");
    }
}

class StudentTest {

    public static void main(String[] args) {

        Student st1 = new Student("Anton", 2);
        Student st2 = new Student("Masha", 1);
        Student st3 = new Student("Valera", 4);

        System.out.println(Student.count); //Вызов переменной класса

    }

}
