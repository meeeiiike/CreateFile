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
        File myFile = new File("MyFile1.txt");
        File myFile2 = new File("MyFile2.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());
        System.out.println("My file is located at " + myFile2.getAbsolutePath());


        // Creating outputFile, which we can add to the .txt from here
        try{
            FileWriter outputFile = new FileWriter("MyFile1.txt", true);
            FileWriter outputFile2 = new FileWriter("MyFile2.txt", true);
            outputFile.write("What day is it?");
            outputFile2.write("chewsday innit");
            outputFile.write("oh ok");
            outputFile.close(); // always close after
            outputFile2.close(); // always close after
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
        //PrintWriter newOutputFile = new PrintWriter(new FileWriter("MyFile2.txt", true));
        Scanner inputFile = new Scanner (new File(myFile2("MyFile2.txt"));
        newOutputFile.close();
        inputFile.nextLine();
        String fileToString = inputFile.nextLine();
        inputFile.close();



    }

}
