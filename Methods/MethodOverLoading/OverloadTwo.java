package Methods.MethodOverLoading;

public class OverloadTwo {
    public void display(char c){
        System.out.println(c);
    }
    public void display(int c){
        System.out.println(c);
    }
}

class OverLoadDemo {
    public static void main(String[] args) {
        OverloadTwo obj = new OverloadTwo();
        obj.display('E');
        obj.display(10);
        
    }
}
