

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// How to Read character inside an array of character thorugh READ function
// under the BufferedReader. Mainly READ fucntion takes three variables
// the first one is the name of the array (arr), the second one is the index
// number(2) and the thrid one(4) is the number of characters it will 
// read from the file or input. Here if we have a word COMPUTER in the file.
// It will first read first 4 charactes as per the thrid variable of READ and
// then it will put these 4 chracters inside the array name arr starting 
// from the index 2 on word. So if we print the arr it will give an output of
// COMP with two leading blankspace. READ( arr, 2, 4).
    
class B_BufferRead {
    public static void main(String[] args) throws IOException {

        // Reading the file through BufferReader
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("File.txt"));

        // Declaring a Character Array with 20 memory space
        char[] cArray = new char[20];
        reader.read(cArray,2,4);
        System.out.println(cArray);

        reader.close();
    }
}
