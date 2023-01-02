
/*HackerRank:DATATYPES
 Problem no:8
 */

 /*
 * Java has 8 primitive data types; char, boolean, byte, short,
 * int, long, float, and double. For this exercise, we'll
 * work with the primitives used to hold integer values (byte,
 * short, int, and long):
 * 
 * A byte is an 8-bit signed integer.
 * A short is a 16-bit signed integer.
 * An int is a 32-bit signed integer.
 * A long is a 64-bit signed integer.
 * Given an input integer, you must determine which primitive
 * data types are capable of properly storing that input.
 * 
 * To get you started, a portion of the solution is provided for you in the
 * editor.
 * 
 * Input Format
 * The first line contains an integer, , denoting the number
 * of test cases.
 * 
 * Each test case, , is comprised of a single line with an
 * integer, , which can be arbitrarily large or small.
 * 
 * Output Format
 * 
 * For each input variable and appropriate primitive , you must determine if the
 * given primitives are capable of storing it. If yes, then print:
 * 
 * Sample Input
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000

Sample Output
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long

 */

import java.util.*;
//import java.io.*;
//import java.math.BigInteger;

class DataTypes {
    public static void main(String[] argh) {

        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = reader.nextLong();

                System.out.println(x + " can be fitted in:");
                if (x >= (Byte.MIN_VALUE) && x <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (x >= (Short.MIN_VALUE) && x <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (x >= (Integer.MIN_VALUE) && x <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (x >= (Long.MIN_VALUE) && x <= Long.MAX_VALUE)
                    System.out.println("* long");

                // Another way. Be careful to take the interval of numbers. They are signed char
                // so you should mines 1. for example byte is not in range of 2^8 and -2^8. it
                // is signed char so it should be between 2^7 and 2^7-1.
                // BigInteger y = BigInteger.valueOf(x);
                // System.out.println(x+" can be fitted in:");
                // if(y.longValue()>=-128 && x<=127)System.out.println("* byte");
                // if(y.longValue()>=-(Math.pow(2,15)) &&
                // y.longValue()<=(Math.pow(2,15)-1))System.out.println("* short");
                // if(y.longValue()>=-(Math.pow(2,31)) &&
                // y.longValue()<=Math.pow(2,31)-1)System.out.println("* int");
                // if(y.longValue()>=-(Math.pow(2,63)) &&
                // y.longValue()<=Math.pow(2,63)-1)System.out.println("* long");

                } catch (Exception e) {
                System.out.println(reader.next() + " can't be fitted anywhere.");
                }

            }
            reader.close();
    }
}