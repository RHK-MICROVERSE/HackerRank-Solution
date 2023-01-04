package Reflection;

// Getter and Setter

public class GetSet {
    //Creating two Private Static instance variables
    String name;
    int age;
    // Creating a constructor
    public void Customer(String name, int age){
        this.name = name;
        this.age =age;
        
    }
    // Creating Setter for the instance variables
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age =age;
    }
    // Creating Setter for the instance variable
    public String getName(){
        return this.name;
    }
    // Creating Setter for the instance variable
    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        // Creating an object of the class
        GetSet obj = new GetSet();
        obj.setName("Rassel");
        obj.setAge(42);
        System.out.println(obj.getName() + " " +obj.getAge());
        obj.printDetails();
        
    }
    public void printDetails(){
        System.out.println(getName() + " " + getAge());
    }

    
}
