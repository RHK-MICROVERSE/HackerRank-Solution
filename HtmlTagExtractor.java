
/*
 * HackerRank: HTML TAG EXTRACTOR
 * Problem no:23
 */
/*

*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTagExtractor {

    public static void main(String[] args) {
        // "<(.+)>(([^<>]+))</\\1>"
        // "<([a-zA-Z-0-9]+\\s?[a-zA-Z=\"\\s?]*\\/?)>(\\n?.*\\n?)(<\\/\\1>)?"
        String regex = "<(.+)>(([^<>]+))</\\1>";
        Pattern pt = Pattern.compile(regex);

        Scanner reader = new Scanner(System.in);
        int numSentences = Integer.parseInt(reader.nextLine());
        // System.out.println(numSentences);

        while (numSentences-- > 0) {
            String input = reader.nextLine();
            // System.out.println(input);
            Matcher mt = pt.matcher(input);
            // Boolean result = mt.matches();
            if (mt.find() == false) {
                System.out.println("None");
                continue;
            }
            // Reseeting the matcher
            mt.reset();
            // Repeating steps until mt finds data
            while (mt.find() == true) {
                System.out.println(mt.group(2));
            }

        }
        // Closing the scanner
        reader.close();
    }
}

/*
 * class MyRegex{
 * String zeroTo255 = "(\\d{1,2}|(0|1)\\"
 * + "d{2}|2[0-4]\\d|25[0-5])";
 * // Creating the Regular Expression for IP address
 * String pattern = zeroTo255 + "\\."
 * + zeroTo255 + "\\."
 * + zeroTo255 + "\\."
 * + zeroTo255;
 * 
 * }
 */
/*
 * REGULAR EXPRESSION
 * \d represents digits in regular expressions, same as [0-9]
 * \\d{1, 2} catches any one or two-digit number
 * (0|1)\\d{2} catches any three-digit number starting with 0 or 1.
 * 2[0-4]\\d catches numbers between 200 and 249.
 * 25[0-5] catches numbers between 250 and 255.
 * 
 * [abc] means a, b, or c
 * [^abc] means any character except a,b,c
 * [a-z] means a to z
 * [A-Z] means A to Z
 * [a-zA-Z] means a to z, A to Z
 * [^a-zA-Z]+ means any other character except a to z, A to Z
 * occurse more than 1 or more times
 * [0-9] means any digit 0 to 9 occurs 1
 * []? means occurs 0 to 1 time
 * []+ means occurs 1 to more times
 * []* means occurs 0 to more time
 * []{n} means occurs 0 to n times
 * [][n,] means occurs n or more times
 * [][y,z] means atleast y time but less than z times
 * REGULAR EXPRESSION METACHARACTERS
 * 
 * \d means [0-9]
 * \D means [^0-9] (any character except 0-9)
 * \w means [a-zA-Z_0-9]
 * \W means [^a-zA-Z_0-9] any character except a to z, A
 * to Z, and 1 to 9
 * 
 * \+ means serach for any + sign
 * \. means serach for any . sign
 * \- means serach for any - sign
 * \\ means search for any \ sign
 * \s means the single space (blank space in between words)
 * \b means beginning of the word and end of the words
 * 
 * 
 * 
 * 
 * 
 * EXAMPLE 1:
 * Mobile number -> starts with 8 or 9 and total digits=10
 * [8 9][0-9]{9}
 * [8 9] means starts with 8 or 9
 * [0-9] means followed by any digit of 0 to 9
 * {9} indicates can have 9 digits aftet the first 8 or 9
 * 
 * EXAMPLE 2:
 * First alphabet must be uppercase, contains lower case
 * alphabets, only one digit allowed in between
 * [A-Z][a-z]*[0-9][a-z]*
 * [A-Z] meanse first alphabets must be uppercase
 * [a-z]* means any alphabets occurse 0 to more times
 * [0-9] means any digit from 0 to 9 occures 1
 * [a-z]* means any alphabets occurse 0 to more times
 * 
 * 
 * EXAMPLE 3:
 * Email ID
 * [a-zA-Z0-9_\-\.]+ means start with an alphabet either
 * lowercase or uppercase than followed
 * by any alphabet, any digit from 0
 * to 9, underscore. dot or dash sign
 * characters like _(underscroe),
 * -(dash), .(stop) sign coccuring 0 to
 * n times
 * [@] means must have a single time @ sign
 * [a-z]+ means any alphabet from a to z occuring 0 to n times
 * [\.] means the . (fullstop) sighn once
 * [a-z]{2,3} means can have any alphabet range from a to z
 * from 0 to n times but total cannot exit 2 or
 * 3 times (com, biz, uk, in etc)
 * 
 * EXAMPLE 4:
 * This is is some text text with some some double words.
 * \b(w+)\s\1\b
 * \b = start of the word and end of the word boundaries
 * (w+) means [a-zA-Z_0-9]
 * \\s = blank space
 * \\1 matching duplicate pattern of (w+)\s
 * 
 * 
 * 
 * 
 * 
 * 
 */
