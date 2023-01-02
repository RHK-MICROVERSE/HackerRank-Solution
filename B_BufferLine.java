

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// How to Read lines from a file through BufferReader
// This program can read line by line from a file and print them out
class B_BufferLine {
    public static void main(String[] args) throws IOException {

        // Reading the file through BufferReader
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("File1.txt"));

        // Creating a string variable to store the line read throug BufferedReader
        // and also assiging the value of the BufferedReader value at the same time
        String sString;

        // Creating a loop to check if the file reached end through
        // line value to NULL
        while ((sString = reader.readLine()) != null) {
          //  Printing each line one by one
            System.out.println(sString);
        }
        reader.close();
    }
}
