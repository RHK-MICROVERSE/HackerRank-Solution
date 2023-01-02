
/*
 * HackerRank: JAVA STRING INTRODUCTION
 * Problem no:14
 */

/*
 * This exercise is to test your understanding of Java Strings.
 * A sample String declaration:
 * 
 * String myString = "Hello World!"
 * The elements of a String are called characters. The number
 * of characters in a String is called the length, and it can
 * be retrieved with the String.length() method.
 * 
 * Given two strings of lowercase English letters, A and B,
 * perform the following operations:
 * 
 * Sum the lengths of A and B.
 * Determine if A is lexicographically larger than B (i.e.:
 * does come before B in the dictionary?).
 * Capitalize the first letter in A and B and print them on a
 * single line, separated by a space.
 * 
 * Input Format
 * The first line contains a string A. The second line contains
 * another string B. The strings are comprised of only
 * lowercase English letters.
 * 
 * 
 * There are three lines of output:
 * For the first line, sum the lengths of A and B.
 * For the second line, write Yes if A is lexicographically
 * greater than B otherwise print No instead.
 * For the third line, capitalize the first letter in both
 * A and B and print them on a single line, separated by
 * a space.
 * 
 * Sample Input 0
 * hello
 * java
 * 
 * Sample Output 0
 * 9
 * No
 * Hello Java
 * 
 * Explanation 0
 * String Ais "hello" and B is "java".
 * 
 * A has a length of 5, and B has a length of 4; the sum of
 * their lengths is 9.
 * When sorted alphabetically/lexicographically, "hello"
 * precedes "java"; therefore, A is not greater than B and
 * the answer is No.
 * 
 * When you capitalize the first letter of both A and B and
 * then print them separated by a space, you get "Hello Java".
 * 
 */

import java.util.Scanner;

public class JavaStringIntro {
    public static String capitalize(String inputString) {

        // get the first character of the inputString
        char firstLetter = inputString.charAt(0);

        // convert it to an UpperCase letter
        char capitalFirstLetter = Character.toUpperCase(firstLetter);

        // return the output string by updating
        // the first char of the input string
        return inputString.replace(inputString.charAt(0), capitalFirstLetter);
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        String AString = reader.next();
        String BString = reader.next();
        reader.close();
        int ALength = AString.length();
        int BLength = BString.length();
        System.out.println(ALength + BLength);
        int result = AString.compareTo(BString);
        if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println(capitalize(AString) + " " + capitalize(BString));
    }
}
