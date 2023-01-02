




public class D_Recursion1 {

    public static void main(String[] args){
        int n = 5;
        printNumber(n); // We are passing the value n=5
    }
    

    public static void printNumber(int x){
        //Base case
        if(x == 0){
            return;
        }
        System.out.println(x);  // Inital function done of Recursion
        printNumber(x-1);       // recurssion
    

    }
}
