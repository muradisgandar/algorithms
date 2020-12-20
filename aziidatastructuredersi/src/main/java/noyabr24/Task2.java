package noyabr24;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // new syntax java 8 lambda expressions,streams
        List<Integer> collect = list.stream()
                .map(l -> l * 2)
                .collect(Collectors.toList());

        collect.forEach(System.out::println);
    }
}
