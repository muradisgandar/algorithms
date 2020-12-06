package aziidatastructuredersi.mellimeninexamplellari;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static boolean is_palindrome(String input){
        Queue<Character> q = new LinkedList<Character>( );
        Stack<Character> s = new Stack<Character>( );
        Character letter;
        int mismatches = 0;
        int i;
        for (i = 0; i < input.length( ); i++) {
            letter = input.charAt(i);
            if (Character.isLetter(letter)) {
                q.add(letter);
                s.push(letter); }
        }
        while (!q.isEmpty( )) {
            if (q.remove( ) != s.pop( )) mismatches++;
        }
        return (mismatches == 0);
    }
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String line;

        do{
            System.out.print("Your expression (or return to end): ");
            line = stdin.nextLine( );
            if (is_palindrome(line))
                System.out.println("That is a palindrome.");
            else
                System.out.println("That is not a palindrome.");
        }
        while (line.length()!= 0);
    }

}
