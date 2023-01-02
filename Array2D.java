/*HackerRank: 2D ARRAY
 Problem no:28
 */
import java.io.*;

import java.util.*;

public class Array2D {
    public static void main(String[] args) throws IOException {
        // Creating an Input Stream Reader Object objIsr
        InputStreamReader objIsr = new InputStreamReader(System.in);
        // Creating a BufferedReader object bufferedReader
        BufferedReader bufferedReader;
        // Assiging the INput Stream reader ibjIsr to bufferedReader Object
        bufferedReader = new BufferedReader(objIsr);

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        bufferedReader.close();
        int maxHourGlass = Integer.MIN_VALUE;
        for (int r = 0; r < 6 - 2; r++) {
            for (int c = 0; c < 6 - 2; c++) {
                int sum = arr.get(r).get(c) + arr.get(r).get(c+1) + arr.get(r).get(c+2) + arr.get(r+1).get(c+1) + arr.get(r+2).get(c)
                        + arr.get(r+2).get(c+1) + arr.get(r+2).get(c+2);
                maxHourGlass = Math.max(maxHourGlass, sum);
                //System.out.println(sum);
            }
        }
        System.out.println(maxHourGlass);
    }

}
