import java.util.Scanner;

public class NSaydaEdedeOrtaqEBOB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        int temp = 0;

        int arr[] = new int[count];


        for(int i = 0;i<count;i++){
            int number = sc.nextInt();
            arr[i] = number;

        }

        for(int i = 0;i< arr.length;i++){
            for(int j = 1;j< arr.length;j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(ortaqEbob(arr));





    }


    

    public static int ortaqEbob(int[] arr){
            int num = ebob(arr[0],arr[1]);

            for(int i = 2;i<arr.length;i++){
                if(arr[i] % num != 0){
                    return 1;
                }
            }


        return num;
    }

    public static int ebob(int a,int b){
        if(a%b == 0){
            return b;
        }

        return ebob(b,a%b);


    }

}




