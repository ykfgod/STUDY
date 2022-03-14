package ZaurStart.Lesson26;

public class Referens_DataType {

    public static void main(String[] args) {

        // Мы можем задать тип переменной суппер класса и ссылать ее на дочерний класс
        // НО тогда, методы и поля саб класса нам не доступны
        Animal a = new Mouse();
        a.eat();
        // a.norka(); метод не доступен
    }

}
class Animal {
    String name;
    void eat() {
        System.out.println("Kyshaet");
    };
}
class Mouse extends Animal {
    int tail;

    void norka() {
        System.out.println("Kopay norky");
    }
}

/*
       Method Overriding (Перезаписывание методов) - это изменение non-static, non-final методов
       в дочернем классе, который унаследовал от parent класса
       Метод overriding, если:
       1. Имя в дочернем классе, такое же, что и в классе родителе
       2. Список аргументов, такой же, что и в классе родителе
       3. Return type в дочернем такой же, что и в классе родителе ЛИБО return type
          - это дочерний класс return type
       4. Модификатор доступа такой же, что и в классе родителя, ЛИБО менее строгий
       5. Метод в дочернем классе должен быть NON-static // Если static, то это
            Method Hiding

       // Оличие от overriding и hiding  в том, что overriading (run time buiding)
       перезаписывает, а hiding (compile time buiding)скрывает все это просиходит из за

       //final методы нельзя переписать, в отличии от private (Не наследуется другим классом)
 */
class A {

    String name;
    protected String abc (String a) {
        this.name = a;
        return a;
    }

}

class B extends A {
    @Override
    public String abc (String a) {
        a += "!!!!!";
        this.name = a;
        return a;
    }
}
