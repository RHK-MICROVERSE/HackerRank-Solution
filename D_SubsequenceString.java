
// Print all the subsequence of a string
// Time complexicity = 2^n where n = number of chracters in the string

public class D_SubsequenceString {
    public static void main(String[] args){
        String sString = "abc";
        int idx = 0;
        String newString ="";
        findSubsequence(sString, idx, newString);


    }

    public static void findSubsequence(String sString, int idx, String newString){
        if (idx == sString.length()){
            System.out.println(newString);
            return;
        }
            char currentChar = sString.charAt(idx);
            // to be included
            findSubsequence(sString, idx+1, newString+currentChar);

            // or not to be included
            findSubsequence(sString, idx+1, newString);        
    }
}
