
// Recursion function to find x power nth.
public class D_Xnth {
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
        if (x == 0){
            return 0;
        }
        int xnthPowerMinusOne = calcXnthPower(x, n-1);
        int xnthPower = x * xnthPowerMinusOne;
        return xnthPower;
    }
    
}
