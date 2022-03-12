package ZaurStart.Lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class HomeWork {
    static ArrayList<String> abc(String ... a) {
        ArrayList<String> list = new ArrayList<>();
        for(String d : a) {
            list.add(d);
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }
}

class HomeWork_Test {
    public static void main(String[] args) {
        ArrayList<String> TEST = new ArrayList<>();

        String B = "B";
        String D = "D";
        String A = "A";
        String C = "C";
        String Z = "Z";

        TEST = HomeWork.abc(B, D, A, C, Z);
        System.out.println(TEST);
    }
}