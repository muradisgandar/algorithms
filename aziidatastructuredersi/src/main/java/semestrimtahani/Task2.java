package semestrimtahani;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(2);
        numbers.add(-5);
        numbers.add(7);
        numbers.add(-12);
        numbers.add(13);

        convert(numbers);

    }

    private static void convert(List<Integer> numbers) {
        ArrayList<Integer> negativeList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 0){
                negativeList.add(-numbers.get(i));
            }
            else{
                negativeList.add(numbers.get(i));
            }
        }

        negativeList.forEach(System.out::println);
    }
}
