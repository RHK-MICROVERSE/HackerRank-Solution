

// Remove duplicates from a string

public class RemoveDuplicate{
    public static void main(String[] args){
        String sString = "abbccda";
        int idx = 0;
        String newsString = "";
        foundNRemove(sString, idx, newsString);

    }
    //creating a map where all value will be false initially and will have
    // 26 false each for a single character of english alphabets. If a character
    // is found then will turn into True and again find same character
    // will not be added in the newsString
    public static boolean[] map =new boolean[26];

    public static void foundNRemove( String sString, int idx, String newsString){
        if(idx == sString.length()){
            System.out.println(newsString);
            return;
        }
        char currentChar = sString.charAt(idx);
        if(map[currentChar-'a']){
            foundNRemove(sString, idx+1, newsString);
        }
        else{
            newsString += currentChar;
            map[currentChar - 'a'] = true;
            foundNRemove(sString, idx + 1, newsString);
        }
    }
}