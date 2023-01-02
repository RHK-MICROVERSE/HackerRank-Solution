

/*
 * HackerRank: BIGINTEGER MULTIPLY AND ADDITION

 * Problem no:26
 */

import java.io.*;
import java.math.*;

public class BigIntegerMultiAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger aBig = new BigInteger(a);
        BigInteger bBig = new BigInteger(b);
        BigInteger addBig = aBig.add(bBig);
        BigInteger multBig = aBig.multiply(bBig);
        System.out.println(addBig);
        System.out.println(multBig);

    }
}
