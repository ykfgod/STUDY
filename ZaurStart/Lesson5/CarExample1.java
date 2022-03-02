package ZaurStart.Lesson5;

public class CarExample1 {

    // обявление полей класса
    String color;
    String engine;
    int speed;

    // Метод 1 увеличивает скорость на принимаемое значение типа int и возвращает int
    int gaz(int skorost) {

        speed+=skorost;
        return speed;

    }

    // Метод 2 уменьшает скорость на принимаемое значение типа int и возвращает int
    int tormoz(int skorost) {

        speed-=skorost;
        return speed;

    }

    // Метод 3 просто выводит на экран информацию о машине и ничего не принимает и не возврощает
    // Если метод НИЧЕГО не возвращает вместо типа данных пишется void
    void showInfo () {

        System.out.println("Цвет "  + color + " мотор " + engine+ " скорость " +speed);

    }

}

class CarTest {

    public static void main(String[] args) {

        CarExample1 c1 = new CarExample1();
        c1.color = "blue";
        c1.engine = "V8";
        c1.speed = 230;

        // Вывод метода shoInfo()
        c1.showInfo();
        // Выозв метода gaz()
        c1.gaz(20);
        c1.showInfo();
        // Выозв метода тормоз()
        c1.tormoz(80);
        c1.showInfo();

    }

}
