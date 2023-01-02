

public class Main{

  public static void main(String []args) {
    // To create an Object of any class we need to do as follows
    //  classname var = new classname();
    // Creating an OBJECT of Pokamon class
    Pokamon objPokamon1 = new Pokamon();

    // Assisging Attributes allowed under Pokamon Class
    // We have two attributes one is name and another is level
    objPokamon1.name = "Chonky";
    objPokamon1.level = 10;
    System.out.println(objPokamon1.name + " " + objPokamon1.level); // Output: Chonky 10

    // To create an Object of any class we need to do as follows
    // classname var = new classname();
    // Creating an OBJECT of Pokamon class  
    Pokamon objPokamon2 = new Pokamon();

    // Assisging Attributes allowed under Pokamon Class
    // We have two attributes one is name and another is level
    objPokamon2.name = "Cheow";
    objPokamon2.level = 12;

    // We have defined a method inside the class Pokamon
    // We will call that method which will print the name
    // of the object and the word "Attack"
    objPokamon2.attack();  // Output: Cheow attack!

    // Using the Constructor with defined value
    // To create an Object of any class we need to do as follows
    // classname var = new classname();
    // Creating an OBJECT of Pokamon class
    Pokamon objPokamon3 = new Pokamon();
    // We have not defined the level here for obj3
    System.out.println(objPokamon3.level); // Output: 1

    // Using the Constructor with defined value
    // To create an Object of any class we need to do as follows
    // classname var = new classname();
    // Creating an OBJECT of Pokamon class with defined name
    // and level in the OBJECT and using the Constructor
    // in the Pokamon class allowing user to define the name and level
    Pokamon objPokamon4 = new Pokamon("Ruka", 20, 2);
    // We have not defined the level here for obj3
    System.out.println(objPokamon4.name);  // Output: Ruka
    System.out.println(objPokamon4.level); // Output: 1
    System.out.println(objPokamon4.age);   // Output: 2
    objPokamon4.attack(); // Output: Ruka attack!


  }
}