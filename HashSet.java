/*  HackerRank: HELLO WORLD
    JAVA 15
    Problem no: 35
 */



import java.util.*;




public class HashSet {
    public static void main(String[] args) {
        Scanner reader;
        reader = new Scanner(System.in);
        int tInt = reader.nextInt();
        System.out.println(tInt);

        String[] pair_left  =  new String[tInt];
        String[] pair_right = new String[tInt];

        for (int i = 0; i < tInt; i++) {
            pair_left[i] = reader.next();
            pair_right[i] = reader.next();
        }
        reader.close();
        
        Set<String> setString = new HashSet<String>();
        for (int i = 0; i < tInt; i++) {
            setString.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(setString.size());
        }
        

    }
}