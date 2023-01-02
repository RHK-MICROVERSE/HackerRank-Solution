

// Fibonacci Sequence till nth terms

public class D_Fibonacci {
    public static void main(String[] args){
        // We will print the 7th term of the Fibonacci Sequence
        int n = 7;
        int aFTerm = 0;
        int bSTerm = 1;
        System.out.println(aFTerm);
        System.out.println(bSTerm);
        // as the first two terms has been already added here we will
        // pass on the value of n after subtracting the above two terms
        printFibonacci(aFTerm, bSTerm, n-2);

    }
    public static void printFibonacci(int aFTerm, int bSTerm, int n){
        if(n == 0){
            return;
        }
        int cTTerm = aFTerm + bSTerm;
        System.out.println(cTTerm);
        printFibonacci(bSTerm, cTTerm, n-1);



    }
    
}
