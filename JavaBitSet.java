/*HackerRank: BITSET

 Problem no:40
 */


import java.util.*;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        Scanner reader;
        reader = new Scanner(System.in);
        int N = reader.nextInt();
        int M = reader.nextInt();
        // Creating two bitsets
        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);
        // Performing operaiton of M times
        for (int i = 0; i < M; i++) {
            String sString = reader.next();
            switch (sString.charAt(0)) {
                case 'A': {
                    if (reader.nextInt() == 1) {
                        B1.and(B2);
                    } else {
                        B2.and(B1);
                    }
                    break;
                }
                case 'O': {
                    if (reader.nextInt() == 1) {
                        B1.or(B2);
                    } else {
                        B2.or(B1);
                    }
                    break;
                }
                case 'X': {
                    if (reader.nextInt() == 1) {
                        B1.xor(B2);
                    } else {
                        B2.xor(B1);
                    }
                    break;
                }
                case 'F': {
                    if (reader.nextInt() == 1) {
                        B1.flip(reader.nextInt());
                    } else {
                        B2.flip(reader.nextInt());
                    }
                    break;
                }
                case 'S': {
                    if (reader.nextInt() == 1) {
                        B1.set(reader.nextInt());
                    } else {
                        B2.set(reader.nextInt());
                    }
                    break;
                }
            }
            System.out.println(B1.cardinality() + " " + B2.cardinality());
            if (reader.hasNextLine()) {
                reader.nextLine();
            }

        }
        reader.close();
    }
}