

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * HackerRank: ELSE IF STATEMENT
 * JAVA 15
 * Problem no: 4A
 */
/*
 * Given an integer, n, perform the following conditional actions:
 * ->   If n is odd, print Weird
 * ->   If n is even and in the inclusive range of 2 to 5,
 *      print Not Weird
 * ->   If n is even and in the inclusive range of 6 to 20,
 *      print Weird
 * ->   If n is even and greater than 20, print Not Weird
 * ->   Complete the stub code provided in your editor to
 *      print whether or not n is weird.
 * 
 * Input Format
 * A single line containing a positive n integer, .
 */

public class ElifBReader {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        String answer = "";
        // Processing the n integer as per conditions:
        if (N % 2 == 1) {
            answer = "Weird";
        } else {
            if (N >= 6 && N <= 20) {
                answer = "Weird";
            } else {
                answer = "Not Weird";
            }
        }
        System.out.println(answer);

    }

}