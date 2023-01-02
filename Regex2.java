
/*
 * HackerRank: JAVA REGEX IP MATCHING WITH PATTERN
 * Problem no:21
 */
/*
 * In this challenge, we use regular expressions (RegEx) to
 * remove instances of words that are repeated more than once,
 * but retain the first occurrence of any case-insensitive
 * repeated word. For example, the words love and to are
 * repeated in the sentence "I love Love to To tO code". Can you
 * complete the code in the editor so it will turn "I love Love
 * to To tO code" into "I love to code"?
 * 
 * To solve this challenge, complete the following three
 * lines:
 * 1. Write a RegEx that will match any repeated word.
 * 2. Complete the second compile argument so that the
 * compiled RegEx is case-insensitive.
 * 3. Write the two necessary arguments for replaceAll such
 * that each repeated word is replaced with the very first
 * instance the word found in the sentence. It must be the
 * exact first occurrence of the word, as the expected
 * output is case-sensitive.
 * 
 * Note: This challenge uses a custom checker; you will fail
 * the challenge if you modify anything other than the
 * three locations that the comments direct you to
 * complete. To restore the editor's original stub
 * code, create a new buffer by clicking on the
 * branch icon in the top left of the editor.
 * 
 * Input Format
 * The following input is handled for you the given stub code:
 * The first line contains an integer, n, denoting the number
 * of sentences.
 * Each of the n subsequent lines contains a single sentence
 * consisting of English alphabetic letters and whitespace
 * characters.
 * 
 * Constraints
 * Each sentence consists of at most 10^4 English alphabetic
 * letters and whitespaces.
 * 1<= n <= 100
 * 
 * Output Format
 * Stub code in the editor prints the sentence modified by
 * the replaceAll line to stdout. The modified string must
 * be a modified version of the initial sentence where
 * all repeat occurrences of each word are removed.
 * 
 * Sample Input
 * 5
 * Goodbye bye bye world world world
 * Sam went went to to to his business
 * Reya is is the the best player in eye eye game
 * in inthe
 * Hello hello Ab aB
 * 
 * Sample Output
 * 
 * Goodbye bye world
 * Sam went to his business
 * Reya is the best player in eye game
 * in inthe
 * Hello Ab
 * Explanation
 * 
 * 1. We remove the second occurrence of bye and the second
 * and third occurrences of world from "Goodbye bye bye world
 * world world" to get "Goodbye bye world".
 * 
 * 2. We remove the second occurrence of went and the second
 * and third occurrences of to from "Sam went went to to to
 * his business" to get "Sam went to his business".
 * 
 * 3. We remove the second occurrence of is, the second
 * occurrence of the, and the second occurrence of eye
 * from "Reya is is the the best player in eye eye game" to
 * get "Reya is the best player in eye game".
 * 
 * 4. The sentence in inthe has no repeated words, so we do
 * not modify it.
 * 
 * 5. We remove the second occurrence of hello and ab from
 * "Hello hello Ab aB" to get "Hello Ab".
 * 
 * It's important to note that our matching is case-insensitive,
 * and we specifically retained the first occurrence of the
 * matched word in our final string.
 * 
 * 
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

    public static void main(String[] args) {
        // String regex ="(\\b\\w+)(?:\\W\\b)+"
        String regex = "(\\b\\w+)(\\s\\1\\b)+";
        Pattern pt = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner reader = new Scanner(System.in);
        int numSentences = Integer.parseInt(reader.nextLine());

        while (numSentences-- > 0) {
            String input = reader.nextLine();

            Matcher mt = pt.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (mt.find()) {
                input = input.replaceAll(mt.group(), mt.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

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
 * alphabets, only one digit allwed in between
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
 * by any alphabet, any digit from 0 to 9,
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
