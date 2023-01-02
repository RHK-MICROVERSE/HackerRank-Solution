


// Creating a Class named Pokamon
public class Pokamon {
    // Class can have two types of variables
    // A. Instance Variable any type and as many we want
    int level;
    String name;
    int age;

    // When we want to intialize the LOCAL VARAIBLES "level" and
    // "name" with a define value, we need to use the CLASS constructor.
    // We will define the level by default in the class constructor
    // Here the class name Pokamon will be used as the constructor name
    // WHen using the class name in consturctor these will be 
    // automatically invoke as soon as the object is created under the class
    
    // Constructor/Special method with defined local variable value
    // All OBJECTS under the class will be defined with a level =1
    // Also knows as Default constuctor
    Pokamon(){
        level = 1;
    }

    // But how about we want the user to give the name and the level
    // In that case we need to create another constructor with the
    // class name but allowing the user to provide input
    Pokamon(String pName, int pLevel, int age){
        // It is calling the above Default Constructor and
        // always will be on the top before defining any other.
        this(); 
        // Now setting the actual variables in the class (name and level
        // instance variables) equals to this constructors variables
        // (name, level local variables) which will get the value
        // from the user
        name = pName;
        level = pLevel;
        this.age = age; 
        // this.age refers to the top AGE which is instance variable age
        // same way we can use to call a method here too
        this.attack();
         

    }



    // Creating A method will not give anything in return
    void attack() {
        System.out.println(name + " attack!");
    }
}
// This is a BLUE print of any object created under this class
// To define an object we go to Main.java
