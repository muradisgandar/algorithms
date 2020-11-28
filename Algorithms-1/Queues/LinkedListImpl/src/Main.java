import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedQueueOfStrings stack = new LinkedQueueOfStrings();
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        while (!s.isEmpty()) {
            if (s.equals("-")) {
                System.out.println(stack.dequeue());
            } else stack.enqueue(s);
        }
    }
}
