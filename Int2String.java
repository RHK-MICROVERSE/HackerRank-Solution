/*
 * HackerRank: INT TO STRING
 * JAVA 15
 * Problem no: 11
 */
/*
 * You are given an integer n, you have to convert it into a
 * string.
 * Please complete the partially completed code in the editor.
 * If your code successfully converts n into a string s the
 * code will print "Good job". Otherwise it will print
 * "Wrong answer".
 * 
 * n can range between -100 to 100 inclusive.
 * 
 * Sample Input 0
 * 100
 * 
 * Sample Output 0
 * Good job
 */

import java.util.Scanner;
import java.io.*;

public class Int2String {
    // Declaring Static Initialization blocks
    static int Nint;
    static boolean flag = true;
    static {
        Scanner reader;
        reader = new Scanner(System.in);
        Nint = reader.nextInt();
        reader.close();
        try {
            if (Nint < -100 && Nint > 100) {
                flag = false;
                throw new Exception("Wrong answer");
            }

        } catch (Exception e) {
            // Catching the above new Exception
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {
        if (flag) {
            String sString = Integer.toString(Nint);
            if (Nint == Integer.parseInt(sString)) {
                System.out.print("Good job ");
            }

        }
    }
}
