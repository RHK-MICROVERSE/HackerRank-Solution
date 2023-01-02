/*
 * HackerRank: BigInteger Prime number Detection 
 * Problem no:25
 */

import java.io.*;
import java.math.*;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger bBig = new BigInteger(n);
        System.out.println(bBig.isProbablePrime(80) ? "prime" : "not prime");
    }
}
