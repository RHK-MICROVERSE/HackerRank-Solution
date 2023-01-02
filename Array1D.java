/*HackerRank: 1D Array

 Problem no:28
 */


import java.util.*;

public class Array1D {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a;
        a = new int[n];
        for (int j = 0; j < n; j++) {
            int k = scan.nextInt();
            a[j] = k;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
















