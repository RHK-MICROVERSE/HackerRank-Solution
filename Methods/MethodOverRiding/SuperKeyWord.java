package Methods.MethodOverRiding;

public class SuperKeyWord { 
    public void myMethod(){
        System.out.println("Parent class Method");
    }
}
class superEx extends SuperKeyWord{
    public void myMethod(){
        super.myMethod();
        System.out.println("Child class method");
    }
    public static void main(String[] args) {
        superEx obj = new superEx();
        obj.myMethod();
    }
}
