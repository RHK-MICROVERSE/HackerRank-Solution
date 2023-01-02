


// Defining a Class
public class Z_Class {
  // Class can have two types of variables 
  // A. Instance Variable any type and as many we want
  int level = 5;
  String name;

  void attack() {
    System.out.println(name + "attack!");
  }

  // We can have methods. zero to as many as we want and can return
  // nothing or can return something
  void method1(/*parameters */){
    // body of the method1
  }
  int method2(/* parameters */){
    // body of the method2
    return 0;
  }


  public static void main(String[] args) {
    Z_Class myObj1 = new Z_Class();  // Object 1
    Z_Class myObj2 = new Z_Class();  // Object 2
    System.out.println(myObj1.level);
    System.out.println(myObj2.level);
  }
}
