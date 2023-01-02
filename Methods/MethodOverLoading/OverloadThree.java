package Methods.MethodOverLoading;

public class OverloadThree {
    public void display(char c, int n){
        System.out.println("Function One with Char and Int");
    }
    public void display(int n, char c){
        System.out.println("Function Two with Int and Char");
    }
}

class Overloaded {
    public static void main(String[] args) {
        OverloadThree obj = new OverloadThree();
        obj.display('A', 15);
        obj.display(10, 'B');
        
    }
}