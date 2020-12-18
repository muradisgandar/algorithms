package aziidatastructuredersi.dekabr1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Task1 {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);
        while (!queue.isEmpty()) {
            stack.add(queue.peek());
            queue.remove();
        }
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();
        }

    }
}
