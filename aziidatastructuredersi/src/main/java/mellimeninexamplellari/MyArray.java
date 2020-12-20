package mellimeninexamplellari;

import java.util.Arrays;

public class MyArray implements Cloneable {

    /**
     * @param data
     */

    public static void put42s(int [] data){
        int i;
        for (i=0;i<data.length;i++){
            data[i]=42;
        }
    }
    public  static void put(int amount, int[] data){
        int i;
        for (i=0;i<data.length;i++){
            data[i]=amount;

        }
    }
    public static int sum(int[ ] a) {
        int answer, i;

        answer = 0;
        for (i = 0; i < a.length; i++)
            answer += a[i];
        return answer;
    }
    public static void main(String[] args) {
        int[ ] scores = new int[] {0,1,0,0};
        int [] position = new int [] {2,0,1,3};
        int[ ] exams = new int [7];
        int[] cloneOfscores;
        cloneOfscores = scores.clone();
        exams=scores;


        System.out.println(Arrays.toString(cloneOfscores));

        exams=Arrays.copyOf(scores,6);



        System.out.println(Arrays.toString(scores));

        exams= Arrays.copyOfRange(scores, 1,3);  // array den verilmish subhisse qeder copy array yaradir yeni
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(exams));
        scores [2]=3;
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(exams));

        Arrays.fill(exams,100); // arrayin her elementin verilmish elementle evezleyir
        System.out.println(Arrays.toString(exams));
        put42s(exams);
        System.out.println(Arrays.toString(exams));
        int[ ] example = new int[7];
        int[ ] exa = new int[7];

        put42s(example);
        put(50, exams);
         System.out.println(Arrays.toString(exams));
        int total;
        total=sum(exams);

         System.out.println(Arrays.toString(exa));
        System.out.println(total);




    }

}
