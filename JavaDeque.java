
/*HackerRank: JavaDeque
Java 8
 Problem no:39
 */





import java.util.*;
import java.util.HashSet;
import java.util.Scanner;





public class JavaDeque {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayDeque<Integer> dqArray = new ArrayDeque<>();
        int n = reader.nextInt();
        int m = reader.nextInt();

        //reader.close();
        Set<Integer> hashSet = new HashSet<Integer>();
        int max = -1;
        for (int i = 0; i <n; i++) {
            int num = reader.nextInt();
            dqArray.add(num);
            hashSet.add(num);
            if(dqArray.size()==m){
                if(hashSet.size()>max){
                    max = hashSet.size();
                }
                int first = (int)dqArray.remove();
                if(!dqArray.contains(first)){
                    hashSet.remove(first);
                }
            }
        }
    reader.close();
    System.out.println(max);
      
    }
    
}
