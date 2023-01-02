/*HackerRank: JAVA SUB STRING COMPARISION
 Problem no:17
 */

/*
We define the following terms:
Lexicographical Order, also known as alphabetic or 
dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo <
ball.

A substring of a string is a contiguous block of characters
in the string. For example, the substrings of abc are a, 
b, c, ab, bc, and abc.

Given a string, s, and an integer, k, complete the function
so that it finds the lexicographically smallest and largest
substrings of length k.

Function Description
Complete the getSmallestAndLargest function in the editor
below.
getSmallestAndLargest has the following parameters:
string s: a string
int k: the length of the substrings to find

Returns

string: the string ' + "\n" + ' where and are the two substrings
Input Format

The first line contains a string denoting s .
The second line contains an integer denoting k .

Constraints
1<=|s|<=1000
 consists of English alphabetic letters only (i.e., [a-zA-Z]).

 Sample Input 0
welcometojava
3

Sample Output 0
ava
wel
Explanation 0

String s = "welcometojava" has the following 
lexicographically-ordered substrings of length :
["ava", "com", "elc", "eto", "jav", "lco", "met"]

We then return the first (lexicographically smallest) 
substring and the last (lexicographically largest) 
substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first 
line of output and wel as our second line of output.


*/

import java.util.Scanner;

public class SubStringCompa {

    public static void main(String[] args) {
        Scanner reader;
        reader = new Scanner(System.in);
        String s = reader.next();
        int k = reader.nextInt();
        reader.close();
        String currentSubstring = s.substring(0, k);

        String smallest = currentSubstring;
        String largest = currentSubstring;
        for (int i = 1; i <= s.length() - k; i++) {
            currentSubstring = s.substring(i, i + k);
            if (currentSubstring.compareTo(largest) > 0) {
                largest = currentSubstring;
            }
            if (currentSubstring.compareTo(smallest) < 0) {
                smallest = currentSubstring;
            }

            // Complete the function
            // 'smallest' must be the lexicographically smallest substring of length 'k'
            // 'largest' must be the lexicographically largest substring of length 'k'

            // return smallest + "\n" + largest;

        }
        System.out.println(smallest + "\n" + largest);
    }
}
