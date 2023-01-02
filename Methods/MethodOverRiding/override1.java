package Methods.MethodOverRiding;

public class override1 {
    public void display(){
        System.out.println("display() method fm Parent Class");
    }
}

class child extends override1{
    public void display(){
        System.out.println("display() method fm Child Class");
    }
    public void newMethod(){
        System.out.println("new method of Child Class");
    }
    // This is a run time overriding also known as
    // Run Time Polymorphism
    public static void main(String[] args) {
        override1 obj = new override1();
        obj.display();
        override1 obj2 = new child();
        obj2.display();
    }
}
