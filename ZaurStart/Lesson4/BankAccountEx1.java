package ZaurStart.Lesson4;
/**
    Первый пример создания объекта класса
    ЭТО ССЫЛОЧНЫЙ ТИП ДАННЫХ, В ОТЛИЧИИ ОТ ПРИМИТИВНЫХ ПО ТИПУ  int, char ....
 */
public class BankAccountEx1 {

    int id;
    String name;
    double balance;

    public static void main(String[] args) {

        BankAccountEx1 bA = new BankAccountEx1(); // создание объекта и присвание переменной bA
                                                  // ссылки на этот объект

        // присваивание значений для объекта по его ссылке bA
        bA.id = 1;
        bA.name = "Ярослав";
        bA.balance = 3000;

        System.out.println(bA.balance); // вывод поля balance объекта bA

        // присваивание bA2 ссылки на тот же объект, что ссылается bA
        BankAccountEx1 bA2 = bA;
        System.out.println(bA2.name);

        // просто создание ссылки, которая ни на что не ссылается;
        BankAccountEx1 bA3;
        // System.out.println(bA3.balance); не смрожем вывести так как нет объекта на который она
        // ссылается

        // просто создание ОБЪЕКТА, без ссылки. Сразу удаляется после использования;
        System.out.println(new BankAccountEx1().balance);

        // Тип данных String тоже ссылочный поэтому можно создавать его объекты так
        String name; // создание ссылки
        name = "Yarik"; // присвивание значения

        String name2 = "Yarik"; // будет ссылаться на name, для экономии памяти
        String name3 = new String(); // создание ссылки и нового объекта по дефолту пустая строка
        String name4 = new String("Anton"); // создание ссылки и нового объекта с прараметром

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }

}
