package ZaurStart.Lesson5;

/**
    Конструктор всегда существует по дефолту в классе
    Конструктор отличается от метода тем, что 1. никогда не имеет return type
                                              2. конструктор всегда имеет имя как у класса
 */

public class AboutCounstructor {

    String color;
    String engine;

    // Дефольный конструктор не имеет параметров и не имеет тела, удаляется если создать другой
    // конструктор но его можно объявить если нужно
    AboutCounstructor() {
    }

    AboutCounstructor(String cvet, String motor) {
        color = cvet;
        engine = motor;
    }

}

class Car {

    public static void main(String[] args) {

        // Создание объекта по типу 2 конструткора и вывод на экран
        AboutCounstructor car = new AboutCounstructor("yellow", "V12");
        System.out.println(car.color +" "+ car.engine);

        // Создание объекта по типу defoult конструткора и вывод на экран
        AboutCounstructor car1 = new AboutCounstructor();
        System.out.println(car1.color +" "+ car.engine);

    }
}
