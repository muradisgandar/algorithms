package midterm;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int element = sc.nextInt();

        Queue<Integer> numbers = new LinkedList<>();
        numbers.add(45);
        numbers.add(768);
        numbers.add(346);
        for (int i = 0; i < numbers.size(); i++) {
            if (!numbers.contains(element)) { // yoxluyuram ki element var yoxsa yox
                numbers.add(element);  // yoxdusa add edirem
                System.out.println("element added " + numbers);
                break;  // tapmadisa add edib chixir loopdan
            } else if (numbers.contains(element)) {
                System.out.println(element + " is found");
                break;  // tapdisa deyir tapdim , ve break edir loopu
            }
        }


    }

}
