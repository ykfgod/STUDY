package ZaurStart.Lesson25.HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        Dog d = new Dog("Mops");
        System.out.println(d.paw);
        Cat c = new Cat("Akira");
        c.sleep();
    }
}

class Animal {
    int eyes;

    Animal() {
        System.out.println("I am animal");
    }

    void eat() {
        System.out.println("Animal eat");
    }

    void drink() {
        System.out.println("Animal drink");
    }
}

class Pet extends Animal {
    String name;
    final int tail = 1;
    final int paw = 4;

    Pet () {}
    Pet(int eyes) {
        this.eyes = eyes;
        System.out.println("I am Pet");
    }

    void run() {
        System.out.println("Pet run");
    }
    void jump() {
        System.out.println("Pet jump");
    }
}

class Dog extends Pet {
    Dog (String name) {
        super.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    void play () {
        System.out.println("Dog play");
    }
}

class Cat extends Pet {
    Cat (String name) {
        super.name = name;
        System.out.println("I am cat and my name is " + name);
    }

    void sleep () {
        System.out.println("Cat sleep");
    }
}
