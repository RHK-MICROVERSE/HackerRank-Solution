




public class GenericClassnMethod {
    
    public void printArray(String[] sArra){
        for(int i=0; i<sArra.length; i++ ){
            System.out.println(sArra[i]);
        }
    }
    
    public void printArray(Integer [] iArra) {
        for (int i = 0; i < iArra.length; i++) {
            System.out.println(iArra[i]);
        }   
    }
    public static void main(String[]args){
        // To Call a NonStatic Method such as printArray as mentioned
        // above within a static class or fundtion as the main we 
        // need to creat an object the calls to work otherwise
        // it will not work. So we are creating an object of the class
        // GenericClassnMethod to call the non static method printArray
        // inside the main fucntion/method
        GenericClassnMethod gnm = new GenericClassnMethod();
        String  name [] = new String[] {"India", "Pakistan", "Bangladesh"};
        Integer num [] = new Integer[] {1,2,3};
        // To print the array
        gnm.printArray(name);
        gnm.printArray(num);
    }
}
