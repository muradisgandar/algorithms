package aziidatastructuredersi.sentyabr18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task {

    public static void main(String[] args) throws IOException {

        List<Double> moneys = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        double money;

        for(int i=0;i<count;i++){
            money = sc.nextDouble();
            moneys.add(money);
        }


        usdToAzn(moneys);

    }


    private static void usdToAzn(List<Double> moneys){

        for(Double m : moneys){
            System.out.println(m * 1.7);
        }
    }
}
