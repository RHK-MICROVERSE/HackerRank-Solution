package Methods.MethodOverLoading;

public class Overload {
    public void display(char a){
        System.out.println(a);
    }
    public void display(char a, int x){
        System.out.println(a + " " + x);
    }
}

class load {
    public static void main(String[] args) {
        Overload obj = new Overload();
        obj.display('E');
        obj.display('E', 10);
        
    }
}