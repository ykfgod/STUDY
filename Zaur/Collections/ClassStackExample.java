package Zaur.Collections;

import java.util.Stack;

public class ClassStackExample {

    //Пример работы LIFO (Последний вошел, первый вышел) принцип работы
    //устаревшего класса Stack
//    static void abc1() {
//        System.out.println("abc1 starts");
//        System.out.println("abc1 ends");
//    }
//
//    static void abc2() {
//        System.out.println("abc2 starts");
//        abc1();
//        System.out.println("abc2 ends");
//    }
//
//    static void abc3() {
//        System.out.println("abc3 starts");
//        abc2();
//        System.out.println("abc3 ends");
//    }

    public static void main(String[] args) {
//        System.out.println("main starts");
//        abc3();
//        System.out.println("main end");

        Stack<String> stack = new Stack<>();
        stack.push("Anton");
        stack.push("Yarik");
        stack.push("Valera");
        stack.push("Grisha");

        System.out.println(stack);

        //Метод pop вытаскивет ПОСЛЕДНИЙ ЭЛЕМЕНТ и сразу же его удоляет
        System.out.println(stack.pop());
        System.out.println(stack);


        //Метод isEmpty() проверяет пуст ли массив типа Stack
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }

        //Метода peek() в отличии от метода pop() просто возраящет последний (верхний)
        //объект, но НЕ удаляет его
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
