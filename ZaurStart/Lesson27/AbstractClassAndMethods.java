package ZaurStart.Lesson27;
/*
    Абстрактные классы описывают абстрактный объект, который мы описать не можем, НО
    можем описать его потомков, например просто Фигуру мы описать не можем, а класс прямоугольник
    спокойно, также абстактные методы например перимитр просто у Фигуры мы описать не можем,
    а в дочернем классе Прямоугольник можем, поэтому overriding метода

    1. У abstract method не бывает тела
    2. Не возможно создать объект abstract класса
    3. Если в классе есть abstract method, то и класс долже быть abstract
    4. Abstract класс может содержать, а может и НЕ содержать abstract methods
    5. Дочерний класс долже перезаписать все abstract methods родителя или тоже быть abstract
    6. Abstract class can't be final
    7. Преременные не могут быть abstract
    8. У abstract class есть конструкторы
    9. Не допустимо сочетание abstract final, abstract private, abstract static
    10. Abstract class может быть наследником от любого класса
 */

public class AbstractClassAndMethods {

    public static void main(String[] args) {

        // Можно использовать reference variable типа abstract класса, чтобы ссылаться на дочерний
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvostoron); // переменная абстрактного класса = 0 compile time
                                                  // biding
        f1.ploshad(); // площадь квадрата run time biding

    }

}

abstract class Figura {
    int kolichestvostoron = 0;
    abstract void perimetr();
    abstract void ploshad();
}
class Kvadrat extends Figura {
    int kolichestvostoron = 4;
    int dlinastoron = 10;
    void perimetr() {
        System.out.println("Perimetr kvadrata = " + 4 * dlinastoron);
    }
    void ploshad() {
        System.out.println("Ploshad kvadrata = " + dlinastoron*dlinastoron);
    }
}

class Okryjnost extends Figura {
    int kolichestvostoron = 0;
    int radius = 10;
    void perimetr() {
        System.out.println("Perimetr kvadrata = " + 2 * 3.14 * radius);
    }
    void ploshad() {
        System.out.println("Ploshad kvadrata = " + 3.14 * radius *radius);
    }
}

class Pramoygolnik extends Figura {
    int kolichestvostoron = 4;
    int dlinastoron = 10;
    void perimetr() {
        System.out.println("Perimetr pramoygolnika = " + 2 * (dlinastoron+dlinastoron));
    }
    void ploshad() {
        System.out.println("Ploshad kvadrata = " + dlinastoron*dlinastoron);
    }
}
