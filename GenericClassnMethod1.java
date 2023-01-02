
// REMEMBER GENERIC CAN ONLY HANDLE NON PRIMITIVE ARRAYS
// ANY PRIMITVE ARRAY SUCH AS INT, FLOAT, DOUBLE WILL FAIL HERE
public class  GenericClassnMethod1 {

    public <Generic> void printArray(Generic [] sArra) {
        for (Generic x:sArra) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        // To Call a NonStatic Method such as printArray as mentioned
        // above within a static class or fundtion as the main we
        // need to creat an object the calls to work otherwise
        // it will not work. So we are creating an object of the class
        // GenericClassnMethod to call the non static method printArray
        // inside the main fucntion/method
        GenericClassnMethod gnm = new GenericClassnMethod();
        String name[] = new String[] { "India", "Pakistan", "Bangladesh" };
        Integer num[] = new Integer[] { 1, 2, 3 };

        // To print the array
        gnm.printArray(name);
        gnm.printArray(num);
    }
}