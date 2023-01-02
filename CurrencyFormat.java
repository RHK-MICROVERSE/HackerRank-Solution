/*  HackerRank: CURRENCY FORMATING
 *  Problem no: 12
 *  THIS PROBLEM HAS NO SOLUTION IN JAVA 15. ONLY CAN BE
 * SOLVED IN JAVA 7 AND JAVA 8
*/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * HackerRank: INT TO STRING
 * JAVA 15
 * Problem no: 12
 */

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat cn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + in.format(payment));
        System.out.println("China: " + cn.format(payment));
        System.out.println("France: " + fr.format(payment));
    }
}
