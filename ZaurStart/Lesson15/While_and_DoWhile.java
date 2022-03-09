package ZaurStart.Lesson15;

/*
    while и do while отличаются только тем, что выполнятся точно 1 раз в отличии от while
    Оба этих цикла используются когда, нам не известно зарание количество иттераций, как
    в цикле for

    А так они имеют такие же свойства как и цикл for:
    break; и continue; ключевые слова
    Лейблый по типу OUTER и INNER (хотя назвать их можно как угодно), смотри 14 урок если что
    Также они могут быть вложенные (nasted) друг в друга
    и иметь ошибку unreachable( УСЛОВИЕ НИКОГДА НЕ ВЫПОЛНИТСЯ, например a == b и нет увеличителся)
 */
public class While_and_DoWhile {
    public static void main(String[] args) {
        int a = 0, b = 0;

        // Пример цикла while с лейблом
        OUTER:
        while (a < 10) {
            System.out.println(a);
            a++;
        }

        // Пример do while с оператором break;
        do {
            if (b == 5) {
                break;
            }
            System.out.println(b);
            b++;
        } while (b < 10);
    }

}
