package aziidatastructuredersi.dekabr1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        queue.add(12);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int element = sc.nextInt();
        int index = 0;
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == element) {
                System.out.println(element + " is in " + index + " position");
            }
            index++;
        }

        boolean contains = queue.contains(element);
        if (!contains) {
            System.out.println(element + " is not found");
        }

    }


}
