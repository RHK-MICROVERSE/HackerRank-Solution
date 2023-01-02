package Methods.MethodOverLoading;

public class TypePromo2 {
    
    public void display(int n, float b){
        System.out.println("Function A");
    }
    public void display(int n, double b, double c){
        System.out.println("Function B");
    }
    public static void main(String[] args) {
        TypePromo2 obj = new TypePromo2();
        obj.display(200, 26.14159f);
       
    }
}