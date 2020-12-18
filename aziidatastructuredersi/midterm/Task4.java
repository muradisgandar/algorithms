package aziidatastructuredersi.midterm;


import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String polynom = sc.next();   // inputdan polinom aliriq


        String[] array = polynom.split("\\+|-");  // polinomda + , - isharelsri olduna gore burda split edirik


        for (int i = 0; i < array.length; i++) {
            String checkElement = array[i];
            if (isNumeric(checkElement)) {
                System.out.println( "constant of  polynomial "  + checkElement);
            }
        }

    }


    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);   // parse edirk numeric olmagini yoxlamaq uchun , serbest hed tekce integer yox hemde double ola biler ona gore Double ile parse edirik
            return true;
        } catch (NumberFormatException e) { // numberik deyilse exception atacaq , onu tutub booleani false edirik
            return false;
        }
    }
}