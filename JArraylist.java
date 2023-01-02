
/*HackerRank: ARRAYLIST
Problem no:30
 */


import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class JArraylist {
   
        
    public static void main(String[] args) throws IOException {
        Scanner reader;
        reader = new Scanner(System.in);
        int numLines = reader.nextInt();
        ArrayList<ArrayList<Integer>> linesArray = new ArrayList<>();

        for(int i=0; i< numLines; i++){
            ArrayList<Integer> lineArray = new ArrayList<Integer>();
            int numCases = reader.nextInt();
            for(int j=0; j<numCases; j++){
                lineArray.add(reader.nextInt());
            }
            linesArray.add(lineArray);
        }
       
        int queriesInt = reader.nextInt();
        for(int k=0; k<queriesInt; k++){
            int xInt = reader.nextInt();
            int yInt = reader.nextInt();
            if(yInt >linesArray.get(xInt-1).size()){
                System.out.println("ERROR!");
                    
                }
            else{
                    System.out.println(linesArray.get(xInt-1).get(yInt-1));
                }
            }
        reader.close();
    }
}
