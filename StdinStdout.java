/*  HeckerRank: STDIN AND STDOUT 
        JAVA 15
    Problem no: 2
*/

import java.util.*;

/**
 * StdinStdout
 */

public class StdinStdout {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //Only required to test in our pc
        // HankerRank dont need these following three lines
        System.out.println("Enter your integer: ");
        System.out.println("Enter your integer: ");
        System.out.println("Enter your integer: ");
        //------------------------------------------

        //String myString = scanner.next();
        int aInt = scanner.nextInt();
        int bInt = scanner.nextInt();
        int cInt = scanner.nextInt();
        scanner.close();

        System.out.println(aInt);
        System.out.println(bInt);
        System.out.println(cInt);
    }
}