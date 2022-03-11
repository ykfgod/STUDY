package ZaurStart.Lesson20;
/*
    Переменные аргументы (Variable Arguments)
 */

/*
     int ... a После компелации превращается в массив, мы не знаем количество элементов в массиве
     называется  varags
 */
public class Varags_Variable_arguments {
    static void abc (int ... a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ+=a[i];
        }
        System.out.println(summ);
    }

    // Помимо varags могуты быть еще аргументы
    static void abc (String b, int ... a) {
        int summ = 0;
        for (int i = 0; i < a.length; i++) {
            summ+=a[i];
        }
        System.out.println(b +" "+summ);
    }

    // Varags может быть только 1
//    static void abc (int ... a, int ... b) {
//        int summ = 0;
//        for (int i = 0; i < a.length; i++) {
//            summ+=a[i];
//        }
//    }

    // Varags всегда должен стоять последним
//    static void abc (String b, int ... a) {
//        int summ = 0;
//        for (int i = 0; i < a.length; i++) {
//            summ+=a[i];
//        }
//    }
}

class Varags_Variable_arguments_Test {
    public static void main(String[] args) {

        Varags_Variable_arguments.abc("Vasha summa: ",1, 3, 5 ,1);

    }
}
