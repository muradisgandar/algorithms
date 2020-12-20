package stacks.linkedlistimpl.src;


import java.util.Scanner;

public class LinkedListImplMain {

    public static void main(String[] args) {
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        while (!s.isEmpty()) {
            if (s.equals("-")) {
                System.out.println(stack.pop());
            } else stack.push(s);
        }
    }
}
