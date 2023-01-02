

// Find the sum of the natural numbers (1,2,3,4,5,6,7.......n)


public class D_Sum {

    public static void main(String[] args) {
        // The n is the length of natural number like to sum here it is n = 5
        // That is 1,2,3,4,5
        int n = 5;
        // i is the adding value as natural number increases by 1 so i = 1
        int i = 1;
        int sum = 0;
        printSum(i, n, sum); // We are passing the value n=5
    }

    public static void printSum (int i, int n, int sum) {
        // Base case
        if (i == n+1) {
            System.out.println(sum);
            return;
        }
        sum +=i;
        printSum(i+1, n, sum); // recurssion

    }
}
