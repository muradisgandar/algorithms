package aziidatastructuredersi.mellimeninexamplellari;

import java.util.Stack;

public class MyStackExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        // using Generics
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push(4);
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        // Priniting the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);

        // #2-------------------------
        Stack<String> stack = new Stack<String>();

        // Use push() to add elements into the Stack
        stack.push("Welcome");
        stack.push("To");
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack);

        // Fetching the element at the head of the Stack
        System.out.println("The element at the top of the"
                + " stack is: " + stack.peek());

        // Displaying the Stack after the Operation
        System.out.println("Final Stack: " + stack);

        //#3-----------------------------
        // Creating an empty Stack
        Stack<Integer> stack3 = new Stack<Integer>();

        // Use add() method to add elements
        stack3.push(10);
        stack3.push(15);
        stack3.push(30);
        stack3.push(20);
        stack3.push(5);

        // Displaying the Stack
        System.out.println("Initial Stack: " + stack3);

        // Removing elements using pop() method
        System.out.println("Popped element: "
                + stack3.pop());
        System.out.println("Popped element: "
                + stack3.pop());

        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation "
                + stack3);
        int element=stack3.peek();
        System.out.println(element);
        System.out.println(stack3.search((element)));
        System.out.println(stack3.search((10)));


    }
}
