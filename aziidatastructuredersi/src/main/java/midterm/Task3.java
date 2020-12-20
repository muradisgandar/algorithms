package midterm;

import java.util.Collections;
import java.util.Stack;

public class Task3 {

    public static void main(String[] args) {

        Stack<Integer> ids = new Stack<Integer>(); // id stack i
        ids.add(1);
        ids.add(2);
        ids.add(3);

        Stack<Integer> grades = new Stack<Integer>();  // grades stack i
        grades.add(20);
        grades.add(10);
        grades.add(18);

        calculate(ids, grades);

    }


    private static void calculate(Stack<Integer> ids, Stack<Integer> grades) {

        Stack<String> gradesAndIds = new Stack<String>();

        for (int i = 0; i < ids.size(); i++) {

            gradesAndIds.add(grades.get(i) + " is a grade of student number : " + ids.get(i));
        }

        Collections.sort(gradesAndIds, Collections.reverseOrder()); // start with high degree to low


        for (int i = 0; i < gradesAndIds.size(); i++) {
            System.out.println(gradesAndIds.get(i));  // chap edirik
        }


        int total = 0;
        int size = grades.size();
        for (int i = 0; i < grades.size(); i++) {
            total = total + grades.get(i);
        }

        int avarage = total / size; // avarage tapiriq

        System.out.println("avarage grade" + avarage);

    }


}
