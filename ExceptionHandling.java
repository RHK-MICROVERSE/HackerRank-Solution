/*  HackerRank: EXCEPTION HANDLING
    JAVA 8
    Problem no: 50
 */







import java.util.*;


public class ExceptionHandling {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner reader;
        reader = new Scanner(System.in);
        try {
            int x = reader.nextInt();
            int y = reader.nextInt();
            int z = x/y;
            System.out.println(z);   
        }
        catch(InputMismatchException e){
            System.out.println(e.getClass().getName());
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        reader.close();
    }
}