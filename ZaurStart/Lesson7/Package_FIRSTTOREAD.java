package ZaurStart.Lesson7;

import ZaurStart.Lesson5.About_Methods_FIRST_TOREAD;

/*
    В одном пакете нельзя создать два класса с одинаковым именем

    Мы можем обратиться к классу если они в одном пакете без помощи модифиакторов доступа
    Как например тут мы содали объект класса A (object_

    Либо к публичным классам с модифиактором public и указанием полного адреса
    как например object1

 */
public class Package_FIRSTTOREAD {
    public static void main(String[] args) {

        A object = new A();
        ZaurStart.Lesson4.BankAccountEx1 object1 = new ZaurStart.Lesson4.BankAccountEx1();

    }
}
