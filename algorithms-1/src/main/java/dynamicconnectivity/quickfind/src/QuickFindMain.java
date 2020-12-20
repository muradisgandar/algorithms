package dynamicconnectivity.quickfind.src;

import java.util.Scanner;

public class QuickFindMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QuickFindUF uf = new QuickFindUF(n);
        while (n > 0) {
            int p = sc.nextInt();
            int q = sc.nextInt();
            if (!uf.connected(p, q)) {
                uf.union(p, q);
                System.out.println(p + " " + q);
            }
        }
    }
}
