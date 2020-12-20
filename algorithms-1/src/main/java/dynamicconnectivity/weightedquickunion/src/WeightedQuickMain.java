package dynamicconnectivity.weightedquickunion.src;


import dynamicconnectivity.quickunion.src.QuickUnionUF;

import java.util.Scanner;

public class WeightedQuickMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        QuickUnionUF uf = new QuickUnionUF(n);
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
