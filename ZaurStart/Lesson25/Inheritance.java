package ZaurStart.Lesson25;
/*
    Наследование классов
    Зачем нужно:
    1. Более короткое написание классов
    2. Легкость добавления общих элементов
    3. Extensibility
    4. Легкость тестирования классов
    5. Группировка классов под общим типов

    // protected access modifier видны также как и default  в томже пакете всем классам И
    // наследникам класса в других пакетах

    // Конструкторы не наследуются
    // Super обращаетс к конструткору РОДИТЕЛЯ, а this имеет отношение к конструктору этого класса
 */

public class Inheritance {


}

// Отношение между объектами is-a каждый доктор, учитель и водитель есть РАБОТНИК

class Employee {
    protected String name;
    int age;
    int experience;
    void eat () {
        System.out.println("Kushaet");
    }
    void sleep () {
        System.out.println("Spit");
    }

}
class Doctor extends Employee {

    String specialization;

    void lechit () {
        System.out.println("Lechit");
    }
}

class Teacher extends Employee {

    int koli4y4enikov;
    void Ychit () {
        System.out.println("Ychit");
    }
}

class Driver {
    int staj;
    void Voidt () {
        System.out.println("Vodit");
    }
}

// has-a отношение между объектами Класс дом ИМЕЕТ класс окно
class Windows {}
class House {
    Windows a = new Windows();
}

class Human {
    String name;
    String surname;

    Human (String n, String s) {
        this.name = n;
        this.surname = s;
    }

    Human (String n) {
        this(n, null); // Обращение к перегруженному конструктору, конструткора только с именем
    }
}
class Student2 extends  Human{

    Student2(String n, String s) {
        super(n, s); // Super обращаетс к конструткору РОДИТЕЛЯ
    }

    public static void main(String[] args) {
        Student2 st = new Student2("Vasya", "Shangin");
        System.out.println("Imya studenta: " + st.name + " " + "Familya studenta: " + st.surname);
    }
}
