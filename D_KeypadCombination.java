// Print Keypad combination
// time complexicity 4^n



public class D_KeypadCombination {

    public static void main(String[] args) {
        String sString ="23";
        int idx = 0;
        String combination ="";
        printcombination(sString, idx, combination);
        
    }

    public static String[] keypad ={".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printcombination(String sString, int idx, String combination) {
        //BASECASE
        if(idx == sString.length()){
            System.out.println("Getting the idex inside Basecase: " + idx);
            System.out.println(combination);
            return;
        }
        System.out.println("Getting the idex: " + idx);
        char currentChar = sString.charAt(idx);
        System.out.println("Getting the currentChar: " + currentChar);
        String mapping = keypad[currentChar -'0'];
        System.out.println("Getting the mapping: " + mapping);
        for(int i=0; i<mapping.length(); i++){
            System.out.println("Getting the idex inside loop: " + idx);
            System.out.println("Getting the value of i: " + idx);
            printcombination(sString, idx+1, combination+mapping.charAt(i));
            System.out.println("Getting the idex inside loop END: " + idx); 
            System.out.println();
            //for(int j=0; j<)

        }
        
    }
}
