
/*  HackerRank: VARARGS - SIMPLE ADDITION
    JAVA 8
    Problem no: 52
 */

import java.util.Scanner;

public class AdditionHR {
    public static void add(int... arr){
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total = total + arr[i];
            if(i==arr.length-1){
                System.out.print(arr[i] + "=");
            }
            else{
                System.out.print(arr[i] + "+");
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        int counter = 6;
        int[] arr = new int[counter];
        try{
            Scanner reader;
            reader = new Scanner(System.in);
            for(int i=0; i<counter; i++){
                arr[i]=reader.nextInt();
            }
            add(arr[0],arr[1]);
            add(arr[0],arr[1], arr[2]);
			//add(arr[0],arr[1], arr[2], arr[3]);
            add(arr[0],arr[1], arr[2], arr[3], arr[4]);
            add(arr[0],arr[1], arr[2], arr[3], arr[4],arr[5]);
            reader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}








