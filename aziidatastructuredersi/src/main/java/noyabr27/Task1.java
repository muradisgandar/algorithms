package noyabr27;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Task1 {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
        Stack<Integer> stack3 = new Stack<>();

        stack3.addAll(stack1);
        stack3.addAll(stack2);
        stack3.stream().forEach(s -> System.out.println(s));

    }
}



