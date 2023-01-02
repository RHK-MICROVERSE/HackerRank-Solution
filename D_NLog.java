


// Recursion function to find x power nth through log(n)
public class D_NLog {
    public static void main(String[] args) {
        int n = 3;
        int x = 5;
        // Inner Circle we are passing the value of x and n
        // And when return we are printing it out
        System.out.println(calcXnthPower(x, n));
    }

    public static int calcXnthPower(int x, int n) {
        // base case 1
        if (n == 0) {
            return 1;
        }
        // base case 2
        if (x == 0) {
            return 0;
        }
        // When n is EVEN
        if(n % 2 == 0){
            return calcXnthPower(x, n/2) * calcXnthPower(x, n/2);
        }
        // When n is ODD
        else{
            return calcXnthPower(x, n/2) * calcXnthPower(x, n/2) * x;
        }

    }

}