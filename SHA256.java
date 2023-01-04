/*HackerRank: SHA 256
 Problem no:33
 */





import java.util.Scanner;
import java.io.UnsupportedEncodingException;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class SHA256 {

    private static Object getBytes;

    public static void main(String[] args) throws DigestException, NoSuchAlgorithmException {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        

        try {
            Scanner reader;
            reader = new Scanner(System.in);
            String wordInput = reader.nextLine();
            reader.close();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(wordInput.getBytes("UTF-8"));
            byte[] byteHash = md.digest();
            for(byte b: byteHash){
                System.out.format("%02x",b);
            }
        } 
        catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
