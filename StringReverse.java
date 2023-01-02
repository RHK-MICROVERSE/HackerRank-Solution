/*HackerRank: JAVA STRING REVERSE PALINDROME
 Problem no:18
 */

/*
A palindrome is a word, phrase, number, or other sequence 
of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, 
print No otherwise.

Constraints
A will consist at most 50 lower case english letters.
Sample Input
madam

Sample Output
Yes
*/

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner reader;
        reader = new Scanner(System.in);
        String S = reader.next();
        reader.close();
        String sTest = "";
        for (int i = 0; i < S.length(); i++) {
            // char aLetter = S.charAt(i);
            char tLetter = S.charAt(S.length() - 1 - i);
            // System.out.println("Start to End: " + aLetter);
            // System.out.println("End to Start: " + tLetter);
            sTest = sTest + tLetter;

        }
        // System.out.println(stest);
        int result = sTest.compareTo(S);
        if (result == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}