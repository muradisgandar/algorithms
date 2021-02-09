package sortalgorithms;

public class Recursion {

    public static void main(String[] args) {

    }

    public static int iterativeFactorial(int num){
        if(num == 1){
            return 0;
        }

        int factorial = 1;
        for (int i = 0;i <= num;i++){
            factorial *= i;
        }

        return factorial;
    }

    public static int recursiveFactorial(int num){
        if(num == 0){
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
