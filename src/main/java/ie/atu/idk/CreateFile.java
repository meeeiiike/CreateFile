package ie.atu.idk;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args)throws IOException {

        // Creating new file named "MyFile.txt "
        File myFile = new File("MyFile1.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());

        try{ //creating outputFile, which we can add to the .txt from here
            FileWriter outputFile = new FileWriter("MyFile1.txt", true);
            outputFile.write("it's 2 am :( ");
            outputFile.close(); // always close after
        }catch(IOException e){
            e.printStackTrace();
        }

        // Adding the PrintWriter Constructor,
        // which allows us to add text to the file,
        // using println methods like usual
        PrintWriter outputFile = new PrintWriter("MyFile1.txt");
        outputFile.println("hahahahahahahahahahahhahahahahahahahahahahahahahaha");
        outputFile.close();

        // These two Constructors can be combined!
        PrintWriter outputFile1 = new PrintWriter(new FileWriter("MyFile1.txt", true));



    }

}
