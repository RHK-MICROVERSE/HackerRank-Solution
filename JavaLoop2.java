/* HackerRank: JAVA LOOP II 
 * Problem no: 7
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoop2 {
    public static void main(String[] args) throws IOException{
        // Declaring an Object
        BufferedReader reader;
        //Creating the Object
        reader = new BufferedReader(new InputStreamReader(System.in));
        // Reading the first line
        int q = Integer.parseInt(reader.readLine().trim());
        
        for(int j=0; j<q; j++){
            // Reading the second line
            String temp = reader.readLine().trim();
            // Spliting the Second line in a, b, n
            String values[] = temp.split(" ");

            int a = Integer.parseInt(values[0]);
            int b = Integer.parseInt(values[1]);
            int n = Integer.parseInt(values[2]);
            int sum = a;
        
            for (int i=0; i<n; i++){
                int nextEle =(int)Math.pow(2,i) * b;
                sum = sum + nextEle;
                System.out.printf("%s ", sum);
            }
            System.out.println();
        }
        reader.close();

        /*
          for(String token : values) {
             System.out.println(token);
             }
             */
        //System.out.println(q);
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(n);

/*
             //Use split function to get the three integer a,b,n
        for (int i=0; i<3; i++){
            String aString = sc.next();
            int iInt = sc.nextInt();
            System.out.printf("%-15s%03d\n", sString, iInt);
        }
        for (int i=1; i<=10; i++){
            int alpha = N * i;
            System.out.printf("%d x %d = %d\n", N, i, alpha);
        } */
        
    }
    
}
    

