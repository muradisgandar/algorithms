package aziidatastructuredersi.midterm;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<String> listName = new ArrayList<>();
        listName.add("Ali");
        listName.add("Azer");
        listName.add("Gulnar");

        List<String> listSurname = new ArrayList<>();
        listSurname.add("Aliyev");
        listSurname.add("Memmedov");
        listSurname.add("Qarayeva");

        List<String> nameAndSurname = new ArrayList<>();
        for (int i = 0; i < listSurname.size(); i++) {
            nameAndSurname.add(listSurname.get(i) + " " + listName.get(i));
            // get edib add edirem yeni liste
        }

        System.out.println(nameAndSurname);

// [Aliyev Ali, Memmedov Azer, Qarayeva Gulnar]   result

    }
}
