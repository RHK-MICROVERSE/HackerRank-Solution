/*  HackerRank: JAVA LIST
 *  Problem no: 32
*/

import java.util.Scanner;
import java.util.ArrayList;

public class JavaList {
    public static void main(String [] args){
        Scanner reader;
        reader = new Scanner(System.in);
        int numInteger = reader.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(numInteger);
        for (int i=0; i<numInteger; i++){
            int element = reader.nextInt();
            arr.add(element);
        }
        int qInt = reader.nextInt();
        // Query Part
        for(int j=0; j<qInt; j++){
            String sInsert = reader.next();
            //System.out.println(sInsert);
            if (sInsert.equals("Insert")){
                int xPosition = reader.nextInt();
                int yValue = reader.nextInt();
                arr.add(xPosition, yValue);
            }
            if(sInsert.equals("Delete")){
                int xPosition = reader.nextInt();
                arr.remove(xPosition);
            }
        }
        reader.close();
        for(int i: arr){
            System.out.print(i+" ");
        }
        
    }
    
}
