import java.util.ArrayList;

// Creating Different Arraylist and then creating a 2D (two Dimensional
// Arraylist) from different Arraylist. So it will be a Arraylists of 
// Arraylist. It is to be noted that the ArrayList is always be the list
// of the objects not any primitive type variables such as Integer
// String etc.


public class C_ArrayList {

    public static void main(String[] args){
        // Creating an ArrayList of three diffrent items
        ArrayList<String> bakeryList = new ArrayList<String>();
        bakeryList.add("Pasta");
        bakeryList.add("Garlic Bread");
        bakeryList.add("Donuts");

        ArrayList<String> produceList = new ArrayList<String>();
        produceList.add("Tomatoes");
        produceList.add("Rice");
        produceList.add("Onion");

        ArrayList<String> drinksList = new ArrayList<String>();
        drinksList.add("Soda");
        drinksList.add("Coffee");
        drinksList.add("Juice");

        // Creating am ArrayLists of the above ArrayList

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        // Print the groceryList
        System.out.println(groceryList);
        // Printing the drinksList inside the Grocerylist (index = 2)
        System.out.println(groceryList.get(2));
        // Printing the drinksList inside the Grocerylist (index = 2) and
        // then print the second item (Coffee index =1) inside the drinksList
        System.out.println(groceryList.get(2).get(1));

        // How to add an element in 2nd (index 1) position of the produceList 
        produceList.add(1, "Garlic");
        System.out.println(groceryList);
    }
    
}
