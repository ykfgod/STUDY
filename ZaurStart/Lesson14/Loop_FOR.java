package ZaurStart.Lesson14;

public class Loop_FOR {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("14 урок");
        }

        // Пример объявления нескольких переменных в инициализации
        // А также несоклько выражений в updete вызов метода abc
        // в данном случае цикл корректен
        for (int i = 1, b = 6; i <= 10; i++, abc(10)) {
            System.out.println("14 урок");
        }

        // Пример где condition просто нет, пустое поле между 2 ;
        // цикл в этом смысле тоже корректен и будет бесконечен
        //for (int i = 1; ; i++) {
        //    System.out.println("14 урок");
        //}

        // unreachable codnition всегда false поэтому будет ошибка компеляции
        //for (int i = 1; false ; i++) {
        //    System.out.println("14 урок");
        //}
        System.out.println();

        // Можно использовать break; в цикле for
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }

        // Можно использовать continue в цикле for, тогда после ключевого слова
        // цикл прервется и начнется следующая итерация
        // В примере цикл не выведет цифру 7

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }

        // Label названия для вложенных циклов позволяют управлять ими и дают
        // возможность не путаться
        // Выход из циклов с помощью лейблов, будут выводится числа только до 5
        System.out.println();

        OUTER:
        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                break OUTER;
            }
            INNER:
            for (int j = 1; j <= 10; j++) {
                if (j == 5) {
                    break INNER;
                } // выход из внутренего цикла
                System.out.println(j);
            }
        }
    }

    static void abc(int a) {
        System.out.println(a);
    }
}

