package ZaurStart.Lesson11;

/*
        Аргумены метода
        Примитивные типы данных в аргументе метода используются только их значения а не они сами
        Ссылочные типы данных в аргементе передают их копии, а не свои значения
 */

public class Methods_Arguments {

    String name;
    int course;

    public Methods_Arguments(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static int courseChange (int a) {
        a = a * 2;
        return a;
    }

    // Метод должен менять ссылки на объекты студентов
    public static void swapStudents (Methods_Arguments s1, Methods_Arguments s2) {

        Methods_Arguments s3 = s1;
        s1= s2;
        s2 = s3;

    }
}

class Methods_Arguments_Test {

    public static void main(String[] args) {

        Methods_Arguments st1 = new Methods_Arguments("Ivan", 4);
        Methods_Arguments st2 = new Methods_Arguments("Artem", 1);

        // Курс объекта st2 не изменилось метод просто взял его значение и вернул его умножение
        System.out.println(st2.courseChange(st2.course));
        System.out.println(st2.course);

        //Ссылки не поменялись местами, так как передеются их копии в метод и они перестают жить
        //после работы метода
        Methods_Arguments.swapStudents(st1, st2);
        System.out.println(st1.name);
        System.out.println(st2.name);

    }

}
