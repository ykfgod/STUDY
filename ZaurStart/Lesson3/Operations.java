package ZaurStart.Lesson3;

public class Operations {

    public static void main(String[] args) {

        // Существует 4 типа операторов: Арифметические (arithmetic), Привсваивания (Assigment)
        // Сравнения (relation), Логические (logical)

                // Арифметические (arithmetic) +, -, *, /, %, ++, --

        int a = 7;
        int b = 8;

        int c = a+b; // + все просто
            System.out.println(c);

        c = a-b; // - все просто
        System.out.println(c);

        c = a*b; // * все просто
        System.out.println(c);

        double d = 5.5; // при делении отбрасывается дробная часть, а не округляется
        double d1 = 3.5;
        c = 53 / 9 ; //
        System.out.println(c); // 5 а должно быть 5.888888...
        System.out.println(d/d1); // Показывает остаток так как double число с дробной частью

        c = 53 % 9 ; //  % при делении показывает остаток от деления
        System.out.println(c); // 45 /9 +  остаток 8
        System.out.println(d%d1); // 3.5 +  остаток 2.0

        int z = 5, z1 = 3, z3;
        System.out.println(z-z1); // = 2
        System.out.println(z - z1++); // ++ после добовляет +1 НО после z-z1 и равно будет так же 2
        System.out.println(z1--); // -- после уменьшает -1 НО после z1 будет так же 4
                                      // так как увеличели в прошлом выражение на +1
        System.out.println(z1);       // уже z1 3


                    //Привсваивания (Assigment) =, +=, -=, *=, /=
        int o = 4;
        o += 6; // =10
        o -= 6; // =4
        o *= 5; // =20
        o /= 2; // =10
        System.out.println(o);

                    // Сравнения (relation) >, >=, <, <=, ==, !=
                    // выводится true или false при сравнении

        int q =6, q1 =5;
        System.out.println(q>q1); //true
        System.out.println(q<q1); //false
        System.out.println(q>=q1); //true
        System.out.println(q<=q1); //false
        System.out.println(q==q1); //false
        System.out.println(q!=q1); //true

                    // Логические (logical) && (И), || (ИЛИ), ! (ОТРИЦАНИЕ)
                    // всегда работают только с boolean значениями и возвращают их же
                    // &(МОГУТ РАБОТАТЬ С ЧИСЛАМИ), |(МОГУТ РАБОТАТЬ С ЧИСЛАМИ)
                    // ^ (ВОЗВРАЩАЕТ TRUE ТОЛЬКО КОГДА ХОТЯБЫ 1 ВЫРАЖЕНИЕ TRUE)

        System.out.println();
        boolean t = true, t1 = false;

        System.out.println(t && t1); // Все должны быть true или false для равенства тут false

        System.out.println(t || t1); // Хотя бы одно значение для  true для равенства тут true

        System.out.println(!t); // Отрицает true и выводит false

        System.out.println(t ^ t1); // true ЕСТЬ 1 выражение true это t

    }

}
