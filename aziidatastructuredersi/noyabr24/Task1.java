package aziidatastructuredersi.noyabr24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(9);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);


        List<Integer> intersection = new ArrayList<>();
        List<Integer> union;


        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i).equals(list2.get(j))) {
                    intersection.add(list1.get(i));
                }
            }
        }

        for (int i = 0; i < list1.size(); i++) {

            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i));

            }
        }

        union = list2;

        // java 8 method reference sign ::
        intersection.forEach(System.out::println);

        System.out.println("-------------------------");
        union.forEach(System.out::println);


    }

}



