

//eded verilib. verilen eded m  
// shert beledirki , 1<n<m<100000   ve EBOB(m,n) =1   olan butun hallarin sayi ne qederdir?

public class VerilenEdedeQederOlanEdedlerleEBOBSayi {
    public static void main(String[] args) {

        int number = 123456;
        int count = 0;

        for(int i = 1;i<number;i++){
            int ebob = ebob(number, i);
            if(ebob == 1){
                count++;
            }
        }
        System.out.println(count);


    }


    
    public static int ebob(int a,int b){
        if(a%b == 0){
            return b;
        }

        return ebob(b,a%b);


    }

}




