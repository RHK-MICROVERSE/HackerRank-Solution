package Reflection;



    
public class Cat {

    // Declaring two private instance variables where one is final that is
    // variable declared as final cannot be changed under any circustances
    private final String name;
    private int age;

    // Creating a consturctor
    public Cat(String name, int age) {
        this.name = name; // Refererring to above private instance variable naem
        this.age = age; // Refererring to above private instance variable age
    }

    // Creatting a getter only for name as its is Final cannot be changed
    public String getName() {
        return this.name;
    }

    // Creating getter and setter for the age
    public void setAge(int age) {
        this.age = age;
    } 

    public int getAge() {
        return age;
    }



    public void meowPublicVoidMethod() {
        System.out.println("MEOW is a public void Method");
    }

    private void heyThisIsPrivateVoidMethod() {
        System.out.println("How did you call Private void Method??");
    }

    public static void thisIsPublicStaticMethod() {
        System.out.println("I am pbulic and static Method!");
    }

    private static void thisIsPrivateStaticMethod() {
        System.out.println("Hey, I am private Static Method");
    }
}