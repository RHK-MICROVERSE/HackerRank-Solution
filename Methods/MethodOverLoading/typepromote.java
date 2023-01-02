package Methods.MethodOverLoading;

public class typepromote {
        public void display(int n, double b){
        System.out.println("First Function with two numbers");
    }
    public void display(int n, double b, double c){
        System.out.println("Function Two with three numbers");
    }
    public static void main(String[] args) {
        typepromote obj = new typepromote();
        obj.display(200, 3.14159f);
       
    }
}
