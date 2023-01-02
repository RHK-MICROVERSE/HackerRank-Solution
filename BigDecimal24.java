
/*
 * HackerRank: BIGDECIMAl
 * How to compare the numeric value inside a string using
 * comparator nad Arrays.sort
 * Problem no:23
 */

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigDecimal24 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        // System.out.println(num);
        String[] input = new String[num + 2];
        for (int i = 0; i < num; i++) {
            input[i] = reader.next();
        }
        reader.close();
        // Processing
        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                BigDecimal aBig = new BigDecimal(o1);
                BigDecimal bBig = new BigDecimal(o2);

                return bBig.compareTo(aBig);
            }
        };

        Arrays.sort(input, 0, num, myComparator);

        // Output
        for (int j = 0; j < num; j++) {
            System.out.println(input[j]);
        }
    }
}
