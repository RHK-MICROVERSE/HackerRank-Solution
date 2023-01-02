







    


// Find the factorial of any number

public class D_Factorial {
    /*
     * OPTION 1
     * public static void main(String[] args) {
     * 
     * int n = 5;
     * int i = 1;
     * int factorial = 1;
     * printFactorial(i, n, factorial); // We are passing the value n=5
     * }
     * 
     * public static void printFactorial(int i, int n, int factorial) {
     * // Base case
     * if (i == n+1) {
     * System.out.println(factorial);
     * return;
     * }
     * factorial *= i;
     * printFactorial(i+1, n, factorial); // recurssion
     * }
     * 
     * OPTION 2
     * public static void main(String[] args) {
     * int n = 5;
     * int factorial = 1;
     * printFactorial(n, factorial); // We are passing the value n=5
     * }
     * 
     * public static void printFactorial(int n, int factorial) {
     * // Base case
     * if (n == 0) {
     * System.out.println(factorial);
     * return;
     * }
     * factorial *= n;
     * printFactorial(n-1, factorial); // recurssion
     * }
     */
    // OPTION 3
    public static void main(String[] args) {
     int n = 5;
     // Inner Circle we are passing the value of n
     // And when return we are printing it out
     System.out.println(calcFactorial(n)); 
     }
     public static int calcFactorial(int n){
        if(n==1 || n == 0){
            return 1;
        }
        int factorialNMinusOne = calcFactorial(n-1);
        int factorialN = n * factorialNMinusOne;
        return factorialN;
     }

}
