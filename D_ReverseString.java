

// How to reverse a string through recursion

public class D_ReverseString {
    public static void main(String[] args){
        String sString = "abcd";
        int indexInt = sString.length()-1;
        reverseString(indexInt, sString);
    }
    public static void reverseString(int indexInt, String sString){
        if(indexInt == 0){
            System.out.println(sString.charAt(indexInt));
            return;
        }
        System.out.println(sString.charAt(indexInt));
        reverseString(indexInt-1, sString);
    }
    
}
