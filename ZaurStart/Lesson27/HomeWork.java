package ZaurStart.Lesson27;

public class HomeWork {
    public static void main(String[] args) {
        Mechenosec mech = new Mechenosec("Gerald");
        System.out.println(mech.name);
        mech.eat();
        mech.swim();
        mech.sleep();

        Speakable ping = new Pinguin("Valera");
        ping.speak();

        Animal lev = new Lev("Scar");
        System.out.println(lev.name);
        lev.eat();
        lev.sleep();

        Mammal lev2 = new Lev("Korol");
        System.out.println(lev.name);
        lev2.speak();
        lev2.run();
        lev2.eat();
        lev2.sleep();

    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    String name;

    Fish(String name) {
        super(name);
        this.name = name;
    }

    void sleep() {
        System.out.println("Vsegda interestno nablydat, kak spyat ribi");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    String name;

    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

abstract class Mammal extends Animal implements Speakable {
    String name;

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speak");
    }

}

class Mechenosec extends Fish {
    String name;

    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void swim() {
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec ne hishnaya riba, i ona est obi4ni korm");
    }
}

class Pinguin extends Bird implements Speakable {
    String name;

    public Pinguin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Pinguin lybit est riby!");
    }

    @Override
    void sleep() {
        System.out.println("Pingvini spat prijavshis dryg k drygy!");
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne ymeyt letat");
    }

    @Override
    public void speak() {
        System.out.println("Pingvini ne poyt kak solovy!");
    }
}

class Lev extends Mammal {
    String name;

    public Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Lev kak lyboi hishnik lybit MYASO");
    }

    @Override
    void sleep() {
        System.out.println("Bolshyy chast vremeni lev spit!");
    }

    @Override
    void run() {
        System.out.println("Lev ne smaya bistrayaa koshka!");
    }
}
