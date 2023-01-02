
/*
 * HackerRank: JAVA REGEX IP MATCHING WITH PATTERN
 * Problem no:19
 */
/*
 * Using Regex, we can easily match or search for patterns in
 * a text. Before searching for a pattern, we have to specify
 * one using some well-defined syntax.
 * 
 * In this problem, you are given a pattern. You have to check
 * whether the syntax of the given pattern is valid.
 * 
 * Note: In this problem, a regex is only valid if you can
 * compile it using the Pattern.compile method.
 * 
 * Input Format
 * The first line of input contains an integer N, denoting the
 * number of test cases. The next N lines contain a string of
 * any printable characters representing the pattern of a regex.
 * 
 * Output Format
 * For each test case, print Valid if the syntax of the given
 * pattern is correct. Otherwise, print Invalid. Do not print
 * the quotes.
 * 
 * Sample Input
 * 3
 * ([A-Z])(.+)
 * [AZ[a-z](a-z)
 * batcatpat(nat
 * 
 * Sample Output
 * Valid
 * Invalid
 * Invalid
 */

import java.util.Scanner;

public class JavaRegEx {

    public static void main(String[] args) {
        Scanner reader;
        reader = new Scanner(System.in);
        while (reader.hasNext()) {
            String IP = reader.next();
            System.out.println(IP.matches(new MyRegex().pattern));

        }
        reader.close();
    }
}

class MyRegex {
    String zeroTo255 = "(\\d{1,2}|(0|1)\\"
            + "d{2}|2[0-4]\\d|25[0-5])";
    /*
     * \d represents digits in regular expressions, same as [0-9]
     * \\d{1, 2} catches any one or two-digit number
     * (0|1)\\d{2} catches any three-digit number starting with 0 or 1.
     * 2[0-4]\\d catches numbers between 200 and 249.
     * 25[0-5] catches numbers between 250 and 255.
     */
    // Creating the Regular Expression for IP
    String pattern = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255;

}
