package mellimeninexamplellari;

import java.util.Stack;

public class MyStackBalancing {
    public static boolean isBalanced(String expression){
        final char Left_Normal='(';
        final char Right_Normal=')';
        final char Left_Curly='{';
        final char Right_Curly='}';
        final char Left_Square='[';
        final char Right_Square=']';
        Stack<Character> store = new Stack<Character> ();
        int i;
        boolean failed = false;
        for (i = 0; !failed && (i < expression.length( )); i++) {
            switch (expression.charAt(i)) {
                case Left_Normal:
                case Left_Curly:
                case Left_Square:
                    store.push(expression.charAt(i));
                    break;
                case Right_Normal:
                    if (store.isEmpty( ) || (store.pop( ) != Left_Normal)) failed = true;
                    break;
                case Right_Curly:
                    if (store.isEmpty( ) || (store.pop( ) != Left_Curly)) failed = true;
                    break;
                case Right_Square:
                    if (store.isEmpty( ) || (store.pop( ) != Left_Square)) failed = true;
                    break;
            }
        }
        return (store.isEmpty( ) && !failed);
    }


    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<Character> ();
        //stack1.push(')');
        //stack1.push('(');
        String elem= "((6+5)*(4+6))";
        System.out.println(MyStackBalancing.isBalanced(elem));



    }

}
