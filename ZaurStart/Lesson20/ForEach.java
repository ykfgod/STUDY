package ZaurStart.Lesson20;
/*
    ForEach тот же самый цикл for, только чаще всего используется с массивами и коллекциями
 */
public class ForEach {

    public static void main(String[] args) {
        String [] students = {"Ivanov", "Petrov", "Sidorov"};
        String [] exams = {"Math", "Russian", "Philosophy"};
        int [] a = {3, 5, 3, 7, 2, 5};
        int [][] dvym = {{3,5,7}, {8, 5, 3, 6,4}, {3}};

        for (int i : a ) {
            System.out.print(i + " ");
        }

        // Пример nasted(вложенных forech)

        for (String st : students) {
            for(String ex : exams) {
                System.out.println(st+ " " + ex);
            }
        }

        // Пример с двумерными массивами

        for (int[] s : dvym) { // Для каждого внутренего массива s в двумерном массиве dvym
            for (int b : s) { // Для каждого числа во внутреннем массиве s
                System.out.print(b + " ");
            }
            System.out.print("///");
        }

        // Отличие от простого for, в котором это возможно
        // С помощью foreach мы  не можем заменить данные, только изменить с помощью методов
        // в StringBuilder  // например append и т.д

        /*
         Значение массива не изменилось на 3
         */
        System.out.println();
        for (int i : a ) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i : a ) {
            i = 3;
        }

        System.out.println();
        for (int i : a ) {
            System.out.print(i + " ");
        }

        // Из за прошлого пункта не возможно объявить динамическиую инициализацию массива
        // с помощью foreach, так как туда сразу станавливаются дефолтные значения
        // помимо этого нельзя обрабатывать сразу несколько массивов в одном foreach

    }

}
