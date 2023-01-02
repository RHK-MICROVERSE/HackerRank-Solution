/*HackerRank: JAVA SUB STRING
 Problem no:15
 */

/*


*/

import java.util.Scanner;

public class JavaSubString {

    public static void main(String[] args) {
        Scanner reader;
        reader = new Scanner(System.in);
        String S = reader.next();
        int start = reader.nextInt();
        int end = reader.nextInt() - 1;
        reader.close();
        System.out.println(S.substring(start, end));
    }
}
