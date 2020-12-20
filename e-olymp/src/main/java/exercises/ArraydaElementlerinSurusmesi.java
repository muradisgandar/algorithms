package exercises;

import java.util.Scanner;


//arrey ve ya list daxil et input kimi,
//daha sonra icinde movcud olan 1 elementi daxil et.
//Ve output kimi bize ele bir arrey versin ki daxil etdiyimiz
//element ne qeder varsa hamisi arreyin sonuna surussun.
//Meselen: Input: [2,3,5,2,6,1] and 2 Output:[3,5,6,1,2,2]
//ne qeder varsa daxil etdiyimiz element hamisini axrin
//a atsin priint etsin bize yeni arreyi


public class ArraydaElementlerinSurusmesi {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int[] numArr = new int[arraySize];
        for(int i = 0;i< numArr.length;i++){
            numArr[i] = sc.nextInt();
        }

        System.out.println("Enter any element which is in array: ");
        int element = sc.nextInt();

        int swap = 0;
        int i;
        int j;
        for(i = 0;i< numArr.length;i++){
            if(numArr[i] == element){
                swap = numArr[i];
                for(j = i;j< numArr.length-1;j++){
                    numArr[j] = numArr[j+1];


                }

                numArr[j] = swap;

            }
        }


        for(i = 0;i< numArr.length;i++){
            System.out.print(numArr[i] + " ");
        }



    }





}




