import java.util.HashSet;

// Print all the UNIQUE subsequence of a string
// Time complexicity = 2^n where n = number of chracters in the string

// We have use HashSet where unique values will be stored

public class D_UniqueSubsequence {
    public static void main(String[] args) {
        String sString = "aaa";
        int idx = 0;
        String newString = "";
        HashSet <String> setHash = new HashSet<>();
        uniqueSubsequence(sString, idx, newString, setHash);

    }

    public static void uniqueSubsequence(String sString, int idx, String newString, HashSet<String> setHash) {
        if (idx == sString.length()) {
            // If neString already exist we will not print that
            // But if the newString does not exist we will add that
            // in the setHash and also print that
            if(setHash.contains(newString)){
                return;
            }
            else {
                setHash.add(newString);
                System.out.println(newString); 
                return;
            }
        }
        char currentChar = sString.charAt(idx);
        // to be included
        uniqueSubsequence(sString, idx + 1, newString + currentChar, setHash);

        // or not to be included
        uniqueSubsequence(sString, idx + 1, newString, setHash);
    }
}
