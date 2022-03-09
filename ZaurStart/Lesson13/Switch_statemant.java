package ZaurStart.Lesson13;

/*
    Switch statemant выборка выполняется пока не найдется ключевое слово break;
    иначе выполнятся все операции

    Switch в вырожении может иметь только эти типы данных byte, short, int, char, String
 */
public class Switch_statemant {
    int course;

    public Switch_statemant(int course) {
        this.course = course;
    }

    public static void main(String[] args) {
        Switch_statemant st1 = new Switch_statemant(3);

        switch (st1.course) {
            case 2:
                System.out.println("Student dvoe4nik");
                break;
            case 3:
                System.out.println("Student troe4nik");
                break;
            case 4:
                System.out.println("Student horoshist");
                break;
            case 5:
                System.out.println("Student otli4nik");
                break;
            default: // сробатывает, когда не выполняется ни 1 кейс или нет слова break
                // можно использовать в любом месте, но после него также нужно писать break
                System.out.println("ocenka ne verna");
        }

        // Пример когда break не пишется для сокращеня копипаста вывода на экран с
        // понедельника по пятницу
        switch ("sreda") {
            case "ponedlnik":
            case "vtornik":
            case "sreda":
            case "chetverg":
            case "patnica":
                System.out.println("Rabochi den do 18:00");
                break;
            case "sybota":
                System.out.println("Rabochi den do 14:00");
                break;
            case "voskresenie":
                System.out.println("Vihodnoi");
                break;
            default:
                System.out.println("Net takogo dnya");
        }
    }
}
