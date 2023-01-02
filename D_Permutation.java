
// Print all permutations of a string
// Time complexcity O(n!) factorial of n where n denotes the number of
// characters in the string


public class D_Permutation {
    public static void main(String[] args){
        String sString = "abc";
        String permu = "";
        permutation(sString, permu);

    }
    public static void permutation(String sString, String permu){
        if(sString.length() == 0){
            System.out.println(permu);
        }
        for (int i = 0; i<sString.length(); i++){
            char currentChar = sString.charAt(i);
            System.out.println((currentChar));
            // "abc" - > "ab"
            String newString = sString.substring(0, i) +sString.substring(i+1);
            System.out.println(newString);
            permutation(newString, permu+currentChar);

        }

    }
    
}
