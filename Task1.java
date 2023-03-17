import java.util.Iterator;
import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернёт «перевёрнутый» список.

public class Task1 {

    public static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();

        int length = 10;

        for (int i = 0; i < length; i++) {

            String n = Integer.toString(i);

            list1.add(n);

        }

        printList(list1);
        LinkedList<String> listFlip = reversList(list1, length);
        printList(listFlip);

    }

    public static void printList(LinkedList<String> list) {

        for (String state : list) {

            System.out.print(state + " ");
        }
        System.out.println();
    }

    public static LinkedList<String> reversList(LinkedList<String> list, int length) {

        // Метод ИТЕРАТОР.Он возвращает итератор - то есть объект, реализующий интерфейс
        // Iterator.

        Iterator<String> iter = list.iterator();

        LinkedList<String> listRevers = new LinkedList<>();
        // Метод hasNext() .при помощи этого метода можно узнать есть ли следующий
        // элемент
        while (iter.hasNext()) {

            listRevers.add(list.removeLast());
        }

        return listRevers;
    }

}
