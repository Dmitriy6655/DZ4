
// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class Task2 {
              
           
        public static void main(String[] args) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            
            for (int i = 2; i < 10; i++) {
                
                linkedList.add(i);

            }

            int element = 777;
            System.out.println("Очередь: " + linkedList);
            System.out.println("Очередь после добавления элемента: " + enqueue(linkedList, element) + "\n"
                    + "Добавляемый элемент: " + element);
            System.out.println("Удаляемый элемент равен: " + dequeue(linkedList));
            System.out.println("Первый элемент после удаления: " + first(linkedList));
        }

        public static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList, int element) {
            linkedList.addLast(element);
    
            return linkedList;
        }
        
        public static int dequeue(LinkedList<Integer> linkedList) {
            int firstElement = linkedList.getFirst();
            linkedList.pollFirst();
            System.out.println("Очередь после удаления элемента: " + linkedList);
    
            return firstElement;
        }

        public static int first(LinkedList<Integer> linkedList) {
            return linkedList.getFirst();
        }
        
        
    }
