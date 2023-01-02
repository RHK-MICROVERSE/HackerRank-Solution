

/*HackerRank: BIGDECIMAl
How to compare the numeric value inside a string using
comparator nad Arrays.sort
 Problem no:27
 */

import java.io.*;
import java.math.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        BigInteger addBig = aBig.add(bBig);
        BigInteger multBig = aBig.multiply(bBig) ;
        System.out.println(addBig);
        System.out.println(multBig);

    }
}
