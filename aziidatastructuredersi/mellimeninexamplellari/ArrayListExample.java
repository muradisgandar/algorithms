package aziidatastructuredersi.mellimeninexamplellari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list=new ArrayList<>();  //Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);

        list.add(3,"Nut"); // add
        System.out.println(list);

        list.add(4,"Carrot"); // add for position
        System.out.println(list);
        System.out.println(list.size());
        String element = list.get(list.size() -1);  //get element from position
        System.out.println(element);

        list.set(0,"Cabbage");// set new element for position
        System.out.println(list);

        list.remove(2);  // remove element  at the position
        System.out.println(list);

        System.out.println("7. Search an element in an array list.Apple");   // contain methods.
         if (list.contains("Apple")) {
         System.out.println("Found the element");}
         else {

         System.out.println("There is no such element");}


        System.out.println("List before sort: "+list); // sort
        Collections.sort(list);
        System.out.println("List after sort: "+list);

        System.out.println("List before shuffling:\n" + list);  //shuffle
        Collections.shuffle(list);
        System.out.println("List after shuffling:\n" + list);
        Collections.shuffle(list);
        System.out.println("List after shuffling:\n" + list);


        System.out.println("List before reversing :\n" + list);  // reverse
        Collections.reverse(list);
        System.out.println("List after reversing :\n" + list);


        System.out.println("11. Swap two elements in an array list.");
//        Swapping 1st(index 0) element with the 3rd(index 2) element
        Collections.swap(list, 0, 2);
        System.out.println("Array list after swap:"+ list);

        for(String b: list){
        System.out.println(b);
         }

        System.out.println("12. Extract a portion of an array list. ");
        System.out.println("Original list: " + list);
        List<String> sub_List = list.subList(1, 3);
        System.out.println("List of first three elements: " + sub_List);

        System.out.println("13. Replace the second element of a ArrayList with the specified element.");
        System.out.println("Original array list: " + list);
        String new_fruit = "Pomegrant";
        list.set(1,new_fruit);
        System.out.println("Replace second element with 'Pomegrant'.");
        for(int i=0;i<list.size();i++){
        System.out.println(list.get(i));
        }

        System.out.println("14. Empty an array list.");
        System.out.println("Original array list: " + list);
        list.removeAll(list);
        System.out.println("Array list after remove all elements "+ list);

        System.out.println("15. Test an array list is empty or not.");
        System.out.println("Checking the above array list is empty or not! " + list.isEmpty());
        System.out.println( list);


        System.out.println("16. Copy one array list into another.");
        list.add("Apple");
        list.add("Banan");
        System.out.println("List: " + list);

        List<String> list2 = new ArrayList<String>();
        list2.add("Carrot");
        list2.add("Potato");
        System.out.println("List2: " + list2);

//        list2=list;

        // Copy List2 to List1
        Collections.copy(list, list2);
        System.out.println("Copy List2 to List,\nAfter Collections.copy:");
        System.out.println("List: " + list);
        System.out.println("List2: " + list2);
        list2.add("oinon");
        System.out.println("List2: " + list2);
        System.out.println("List " + list);

    }
}
