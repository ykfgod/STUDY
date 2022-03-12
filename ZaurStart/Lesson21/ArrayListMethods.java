package ZaurStart.Lesson21;
import java.util.*;

/*
    Методы класса ArrayList
 */
public class ArrayListMethods {

    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();

        // Method add() добовляет элементы в ArrayList
        list.add("privet");
        list.add("poka");
        list.add("ok");
        for(String s : list) {
            System.out.print(s+ " ");
        }

        System.out.println();
        // Method add(index, DataType) добовляет элемент на определеный индекс в ArrayList
        list.add(1, "Hello");
        System.out.println(list);

        // Method get(index) возвращает элемент по индексу в ArrayList
        System.out.println(list.get(3));

        // Method set(index, Data) ЗАМЕНЯЕТ элемент по индексу в ArrayList
        list.set(3, "!!!!");
        System.out.println(list);

        // Method remove(index) (Date) удоляет элемент по индексу или сам объект в ArrayList
        list.remove(3); // по индексу
        System.out.println(list);

        list.remove("Hello"); // по элементу, так как для String метод equals переопределен
        System.out.println(list);

        // А вот для StringBuilder equals не переопределен и равен ==, поэтому так мы удалить не можем
        // и нужно обрщаться к ссылке
        ArrayList<StringBuilder> list2 = new ArrayList<>();
        StringBuilder st1 = new StringBuilder("Privet");
        StringBuilder st2 = new StringBuilder("Poka");
        StringBuilder st3 = new StringBuilder("Ok");
        list2.add(st1);        list2.add(st2);        list2.add(st3);
        System.out.println(list2);

        list2.remove("Poka");
        System.out.println(list2);
        list2.remove(st2);
        System.out.println(list2);

        // Method addAll(Data) (index, Data) добовляет ArrayList к дургому ArrayList
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Yaroslav");
        list3.add("Shangin");
        list3.add("Ewe slovo");

        list.addAll(list3); // добавляет в конец другой лист
        System.out.println(list);

        list.addAll(0, list3); // добовляет лист на определеный индекс
        System.out.println(list);

        // Method clear() очищает ArrayList полностью
        System.out.println();
        list3.clear();
        System.out.println(list3);

        // Method indexOf(Data) возвращает индекс элемента ArrayList до первого совпадения
        // по equals, поэтому для StringBuilder и других классов нужно переопределять его
        // В String он переопределен
        System.out.println(list.indexOf("Shangin"));

        // Method lastIndexOf(Data) возвращает индекс элемента ArrayList до последнего совпадения
        System.out.println(list.lastIndexOf("Shangin"));

        // Method size() возвращает количество элементов ArrayList
        System.out.println(list.size());

        // Method isEmpty() возвращает true или false эсли пуст ArrayList
        System.out.println(list.isEmpty());

        // Method contains() возвращает true или false есть ли такой элемент в ArrayList
        // также работает с equals
        System.out.println(list.contains("poka"));

        // Method toString() ArrayList в строковом значении можно переопределить
        System.out.println(list.toString());

        // Методы связные с ArrayList
        // Метод clone() создает клона ArrayList и все его элементы также ссылаются на теже объекты
        // этот метод из класса Object, и он возвращает тип Object
        ArrayList <String> list4 = new ArrayList<>();
        list4 = (ArrayList<String>)list.clone(); // Приведение к типу ArrayList<String> перед клонированием

        System.out.println(list4);

        // Метод toArray() переводит ArrayList в обычный массив типа Object
        Object [] arrayObj = list.toArray();
        System.out.println();
        for (Object o : arrayObj) {
            System.out.print(o + " ");
        }
        // Метод toArray(параметр) переводит ArrayList в обычный массив указаного типа
        String [] array = list.toArray(new String[10]);
        System.out.println();
        for (String s : array) {
            System.out.print(s + " ");
        }

        // Arrays.asList() Переводит массив в List, но он с ним связан и также не может изменяться
        // как и обычный массив по длине + при изменении элементов массива, лист также меняется
        System.out.println();
        System.out.println();
        String[] s = {"black", "red", "blue", "white"};
        List<String> arrayToList = Arrays.asList(s);
        System.out.println(arrayToList);
        s[2] = "yellow"; // пример изменения элемента в массиве, List также меняется
        System.out.println(arrayToList);

        //Collections.sort(ArrayList<DataType>) сортирует ArrayList
        Collections.sort(list);
        System.out.println(list);

        //equals() Два ArrayList  Равны если содержат одинаковые элементы и порядок
        ArrayList<String> a = new ArrayList<>();
        ArrayList<String> b = new ArrayList<>();
        a.add("privet");
        a.add("poka");
        a.add("ok");
        b.addAll(a);

        System.out.println(a.equals(b)); //true

        //Iterator - это переборщик рабоатет по типу цикла и обращается к элементам листа
        Iterator<String> it = list.iterator();
        while (it.hasNext()) { //Пока есть следующий элемент
            System.out.println(it.next()); // выводит следующий элемент в итераторе
        }
    }

}
