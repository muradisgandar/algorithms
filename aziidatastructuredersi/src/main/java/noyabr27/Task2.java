package noyabr27;

import java.util.Stack;

public class Task2 {

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
        while (!stack2.isEmpty()){
            stack3.push(stack2.pop());
        }
        while (!stack1.isEmpty()){
            stack3.push(stack1.pop());
        }

        stack3.stream().forEach(s -> System.out.println(s));

    }

}
