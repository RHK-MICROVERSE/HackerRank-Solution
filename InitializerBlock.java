/*  HackerRank: INITIALIZER BLOCK
    JAVA 15
    Problem no: 10
 */
/*
 * Static initialization blocks are executed when the
 * class is loaded, and you can initialize static variables
 * in those blocks.
It's time to test your knowledge of Static initialization
blocks. You can read about it here.

You are given a class Solution with a main method. Complete
the given code so that it outputs the area of a parallelogram
with breadth B  and H height . You should read the variables
from the standard input.

If B<=0 or H<=0 , the output should be java.lang.Exception:
"Breadth and height must be positive" without quotes.

Input Format
There are two lines of input. The first line contains B: 
the breadth of the parallelogram. The next line contains H:
the height of the parallelogram.
 * 
Constraints
-100<=B<=100
-100<=H<=100
Output Format
If both values are greater than zero, then the main method
must output the area of the parallelogram. Otherwise, 
print java.lang.Exception: "Breadth and height must be 
positive" without quotes.

Sample input 1
1
3
Sample output 1
3
 */

import java.util.Scanner;
import java.io.*;

public class InitializerBlock {
    // Declaring Static Initialization blocks
    static int Bint;
    static int Hint;
    static boolean flag = true;
    static {
        Scanner reader;
        reader = new Scanner(System.in);
        Bint = reader.nextInt();
        Hint = reader.nextInt();
        reader.close();
        try {
            if (Bint <= 0 || Hint <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }

        } catch (Exception e) {
            // Catching the above new Exception
            System.out.println(e);
            System.exit(0);
        }
    }

    public static void main(String[] args) throws IOException {
        if (flag) {
            int area = Bint * Hint;
            System.out.print(area);
        }
    }
}
