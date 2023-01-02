// Move all 'x' to the end of the string



public class D_MoveString {
    public static void main(String[] args){
        String sString = "axbcxxd";
        char element = 'x';
        int idex = 0;
        String result = moveEnd(sString, element, idex);
        System.out.println(result);

    }
    public static String newsString ="";
    public static String moveEnd(String sString, char element, int idex){
        //BaseCase
        if(idex == sString.length()){
            return newsString;
        }
        char currentChar = sString.charAt(idex);
        int counter = 0;
        
        //int lastIndex = sString.length()-1;
        if (currentChar != element){
            newsString  = newsString + sString.charAt(idex);
            
        }
        else {
            counter++;
        }
        moveEnd(sString, element, idex + 1);
        
        for (int i=0; i< counter; i++){
            newsString = newsString + element;
        }
        return newsString;


    }
    
}
