package aziidatastructuredersi.mellimeninexamplellari;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        Queue<Integer> count = new LinkedList<>();


        // enqueue
        // insert element at the rear of the queue
        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        count.add(1);
        count.add(2);
        count.add(3);

        System.out.println("Queue: " + numbers);
        System.out.println("Queue: " + count);


        // dequeue
        // delete element from the front of the queue
        int removedNumber = numbers.poll();  // retrieve but doesnot remove
        System.out.println("Removed Element: " + removedNumber);

        System.out.println("Queue after deletion: " + numbers);
    }
}
