/*  HackerRank: HELLO WORLD
    JAVA 15
    Problem no: 36
 */



import java.lang.reflect.Method;

class Printer {
    // Write your code here
    public void printArray(String[] sArra) {
        for (int i = 0; i < sArra.length; i++) {
            System.out.println(sArra[i]);
        }
    }

    public void printArray(Integer[] iArra) {
        for (int i = 0; i < iArra.length; i++) {
            System.out.println(iArra[i]);
        }

    }
}

public class GenericMethod {

    public static void main(String args[]) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if (name.equals("printArray"))
                count++;
        }

        if (count > 1)
            System.out.println("Method overloading is not allowed!");

    }
}
