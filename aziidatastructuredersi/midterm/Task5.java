package aziidatastructuredersi.midterm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        List<Integer> seats = new ArrayList<>();

        Scanner sc = new Scanner(System.in);


        for(int i = 1;i<=30;i++){
            seats.add(i); // 30 yer set olunur
        }

        while(!seats.isEmpty()){
            Integer seat = sc.nextInt(); // yerler varsa sifarsih alinir

            if(seats.size() > 0 && seats.contains(seat) ){  // yer qalibsa onu remove edirik
                seats.remove(seat);
                System.out.println(seat + " is sold out");
            }
            else if(!seats.contains(seat)){ // yer yoxdusa artiq satilib chapa verirk
                System.out.println( seat + " is already sold out");
            }

        }



    }
}
