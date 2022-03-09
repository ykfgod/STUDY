package ZaurStart.Lesson12;
/*
        Виды if оператора выбора
        Метод equals() у String
        Тенарный оператор
 */
public class If_statment {

    public static void main(String[] args) {

        int salary = 500;

        if (salary >= 500)
            System.out.println("Norm");

        //if else
        if (salary < 500) {
            System.out.println("Norm");
        } else {
            System.out.println("Ne norm");
        }

        // if / else if
        if (salary < 200) {
            System.out.println("Norm");
        } else if (salary < 350) {
            System.out.println("Super");
        } else if (salary <= 500) {
            System.out.println("MegaHorow");
        }

        Car c1 = new Car(4,5 );
        Car c2 = new Car(3,9 );

        //вложеные if
        if(c1.engine > c2.engine) {

            if(c1.doors> c2.doors) {
                System.out.println("Мощьность мотора больше, деверей больше");
            } else {
                System.out.println("Мощьность мотора больше, деверей меньше");
            }

        } else
            System.out.println("Мощьность у машины меньше");

        String st1 = new String("Privet");
        String st2 = new String("Privet");

        // == Сравнивает ссылки, для сравнивания ссылочных типов данных используют
        // метод equals() чтобы сравнить объекты на которые они ссылаются
        // оба объекта содержат "Privet
        if (st1.equals(st2)) {
            System.out.println("Ravni");
        } else {
            System.out.println("Ne ravni");
        }

        // Тенарный оператор иноогда полезен для скоращения if
        // в () задается логическое выдаржение, после знака ? ставиться выражение если true то ставится
        // оно, после знака : ставится false
        int a = 10;
        int b = 30;

        int maximum = (a>b) ? a : b;
        System.out.println(maximum);
    }
}

class Car {

    int engine;
    int doors;

    public Car(int engine, int doors) {
        this.engine = engine;
        this.doors = doors;
    }

}
