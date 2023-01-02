import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// How to Read file through BufferReader
// This program can read character by character from a file and print them out
class B_BufferfmFile{
    public static void main(String[] args) throws IOException{
        // Declaring an Integer type variable
        int chInt;
        // Reading the file through BufferReader
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("File.txt"));

        // Creating a loop to read the content of the file by character where
        // -1 implies the end of file. chInt represents the index of the
        // Characters in the file
        while((chInt = reader.read()) != -1){
            // Converting the index value of chInt into character and
            // printing them out
            System.out.print((char)chInt);

        }
        reader.close();
    }
}

