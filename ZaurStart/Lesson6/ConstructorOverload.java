package ZaurStart.Lesson6;

/*
    Перегрузка (Overloading) конструкторов позвалет использовать их
    разными по типу параметрами, по их количеству или с одинаковыми параметрами
    НО в разном порядке

    Модификаторы доступа могут быть разные или одинаковые

    Простой пример новый работник не имеет зарплату, департамент и id, но
    у него есть имя и возраст, для обработки такого сотрудника используется перегрузка конструкторов
    это достигается тем что Java сначала ищет конструктор по названию, а потом по типу параметров

    Можно вызывать конструктор в другом конструкторе, чтобы экономить время и не писать лишний код,
    вызвается он с помощью ключевого слова this ВЫЗОВ ВСЕГДА ИДЕТ ПЕРВЫЙ в конструкторе
    НО лучше объявлять самы длинный конструктор, а более маленьким передавать параметры по дефолту
 */

public class ConstructorOverload {

    int id;
    String surname;
    int age;
    double salary;
    String deportament;

    // Перегруженный конструктор
    ConstructorOverload(int id2, String surname2, int age2) {

        //вызов второго конструктора, а пустые значения ставим дефолтные для типов данных соответсвено
        this(id2 , surname2, age2, 0.0, null);

    }

    // Основной конструктор
    ConstructorOverload(int id3, String surname3, int age3, double salary3, String deportament3) {

        id = id3;
        surname = surname3;
        age = age3;
        salary = salary3;
        deportament = deportament3;

    }

    // Перегруженный конструктор
    ConstructorOverload(String surname4, int age4) {

        //вызов второго конструктора, а пустые значения ставим дефолтные для типов данных соответсвено
        this(0,surname4, age4, 0.0, null);

    }
}

class ConstructorOverloadTest {

    public static void main(String[] args) {

        //Создание объекта с помощью перевого конструктора
        ConstructorOverload emp = new ConstructorOverload(1, "Shangin", 24);
        System.out.println(emp.surname);

        //Создание объекта с помощью второго конструктора
        ConstructorOverload emp1 = new ConstructorOverload(2, "Sidorov", 32,
                                                            45021.31, "Zavod");
        System.out.println(emp1.deportament);

        //Создание объекта с помощью третьего конструктора
        ConstructorOverload emp2 = new ConstructorOverload("Lavrov", 51);
        System.out.println(emp2.age);

    }

}
