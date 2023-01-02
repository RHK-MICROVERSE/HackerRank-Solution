import java.io.IOException;
import java.util.Scanner;

/*  HackerRank: ELSE IF STATEMENT
    JAVA 15
    Problem no: 4B
 */
/*
 Given an integer, n, perform the following conditional actions:
->  If n  is odd, print Weird
->  If n is even and in the inclusive range of 2 to 5,
    print Not Weird
->  If n is even and in the inclusive range of 6 to 20,
    print Weird
->  If n is even and greater than 20, print Not Weird
->  Complete the stub code provided in your editor to 
    print whether or not n is weird.

Input Format
A single line containing a positive n integer, .
 */

public class ElifScanner {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        // HankerRank dont need these following line
        System.out.println("Enter your integer: ");
        //-----------------------------------------

        int aInt = scanner.nextInt();
        String answer ="";
        scanner.close();
        
        // Processing the n integer as per conditions:
        if (aInt % 2 == 1) {
            answer = "Wired";
        }
        else{
            if(aInt>=6 || aInt<=20){
            answer = "Wired";
            }
            else{
                answer = "Not Wired";
            }
        }
         System.out.println(answer);

    }
    
}

