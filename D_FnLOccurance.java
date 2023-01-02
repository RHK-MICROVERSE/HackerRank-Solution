
// Find the 1st and last occurance of an element in a string

public class D_FnLOccurance {
    public static void main(String[] args){
        String sString = "adaacdaefaah";
        int idx = 0;
        char element = 'a';
        stringOccurance(idx, sString, element);
    }
    
    public static int First = -1;
    public static int Last = -1;
    public static void stringOccurance(int idx, String sString, char element){
        if(idx == sString.length()){
            System.out.println("First Occurance of the Element: " + First);
            System.out.println("Last Occurance of the Element: " + Last);
            return;
        }
        char currentChar = sString.charAt(idx);
        if(currentChar == element){
            if(First == -1){
                First = idx;
            }
            else{
                Last = idx;
            }
        }
        stringOccurance(idx+1, sString, element);

    }
}
