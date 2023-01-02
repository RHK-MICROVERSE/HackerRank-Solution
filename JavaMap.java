/*HackerRank: JAVA SUB STRING
 Problem no:33
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class JavaMap {
    public static void main(String[] args){
        Scanner reader;
        reader = new Scanner(System.in);
        int numCases = reader.nextInt();
        // Creating a HashMap to solve the problem
        Map <String, Integer> mapping = new HashMap<String, Integer>(numCases);
        // We will read String now so need to clear buffer
        // To read a String after Integer the Scanner buffer need to be empty
        // Clearing the Scanner Buffer
        reader.nextLine();
        for(int i=0; i< numCases; i++){
            String name = reader.nextLine();
            int telNum = reader.nextInt();
            mapping.put(name, telNum);
            reader.nextLine();
        }

        // Query: As we dont know how many query we will use while loop
        while(reader.hasNext()){// If have something then execute
            String qName = reader.nextLine();
            try{
                int contact= mapping.get(qName);
                System.out.println(qName+"="+contact);
            }
            catch(Exception e){
                System.out.println("Not found");
            }
        }
        reader.close();
    }
}
