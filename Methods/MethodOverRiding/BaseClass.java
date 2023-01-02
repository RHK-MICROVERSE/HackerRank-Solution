package Methods.MethodOverRiding;

public class BaseClass {
    // public void disp()
    protected void disp(){
        System.out.println("Parent Class method");
    }
}
class ChildClass extends BaseClass{
    // protected void disp(){
        public void disp(){
            System.out.println("Child class method");
        }
        public static void main(String[] args) {
            ChildClass obj = new ChildClass();
            obj.disp();
        }
}
