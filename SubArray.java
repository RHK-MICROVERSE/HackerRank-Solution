
/*HackerRank: SUBARRAY
Problem no:29
 */




import java.io.IOException;
import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) throws IOException {
        Scanner reader;
        reader = new Scanner(System.in);
        int numElement = reader.nextInt();
        int[] intArr = new int[numElement];
        for (int i=0; i<numElement; i++){
            intArr[i] = reader.nextInt();
        }
        reader.close();
        int result = 0;
        for (int i = 0; i < numElement; i++) {
            for (int j = i; j < numElement; j++) {
                int alpha = 0;
                for (int k = i; k <= j; k++) {
                    alpha = alpha + intArr[k];
                    //System.out.print(intArr[k] + "	");
                }
                if (alpha < 0) {
                    result++;
                }
                //System.out.println();
            }
        }
            System.out.println(result);
    }
}
