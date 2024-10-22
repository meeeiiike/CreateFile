package ie.atu.idk;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {

    public static void main(String[] args)throws IOException {
        // Creating new file named "MyFile.txt "
        // AHHHHHHHHHh
        File myFile = new File("MyFile1.txt");
        File myFile2 = new File("MyFile2.txt");
        File myFile3 = new File("MyFile3.txt");
        File myFile4 = new File("MyFile4.txt");

        System.out.println("My file is located at " + myFile.getAbsolutePath());
        System.out.println("My file is located at " + myFile2.getAbsolutePath());
        System.out.println("My file is located at " + myFile3.getAbsolutePath());
        System.out.println("My file is located at " + myFile4.getAbsolutePath());

        // Creating outputFile, which we can add to the .txt from here
        // intellijs magic ai :))))))))
        FileWriter outputFile3 = null;
        try {
            FileWriter outputFile = new FileWriter("MyFile1.txt", true);
            FileWriter outputFile2 = new FileWriter("MyFile2.txt", true);
            outputFile3 = new FileWriter("MyFile3.txt", true);
            outputFile.write("What day is it?\n");
            outputFile2.write("chewsday innit\n");
            outputFile.write("oh ok\n");
            outputFile.close(); // always close after
            outputFile2.close(); // always close after
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }

        // Adding the PrintWriter Constructor,
        // which allows us to add text to the file,
        // using println methods like usual

        // Now append method is working properly, just had to initialise outputFile3 in scope
        PrintWriter longwayofappending = new PrintWriter(outputFile3);
        longwayofappending.println("Hello World!");
        longwayofappending.close();

        // These two Constructors can be combined!
        PrintWriter OutputFile4 = new PrintWriter(new FileWriter("MyFile4.txt", true));
        OutputFile4.println("wassupppp!");
        OutputFile4.close();
    }
}
