package ZaurStart.Lesson29;

import javax.print.Doc;

public class Polymorfizm {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Help_able emp4 = new Teacher();
        emp4.help();
        emp1.work();
        emp2.work();
        emp3.work();

        // instanceof проверяет принадлежность объекта к классу и выводит boolean
        System.out.println(emp1 instanceof Teacher);
        System.out.println(emp1 instanceof Driver);

        //Cast (Кастинг) заставляет объект вести себя как определенный тип
        // System.out.println(emp3.specialization); так мы не можем написать, но можем закастить
//        Doctor d1 = (Doctor)emp3;
//        System.out.println(d1.specialization);
        // или так
        System.out.println(((Doctor)emp3).specialization);
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleep");
    }
    abstract void work ();
}

class Teacher extends Employee implements Help_able{
    void work () {
        System.out.println("Teacher works");
    }
    public void help() {
        System.out.println("Teacher help");
    }
}
class Driver extends Employee {
    void work () {
        System.out.println("Driver works");
    }
}
class Doctor extends Employee {
    String specialization = "Xiryrg";
    void work () {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help ();
}
