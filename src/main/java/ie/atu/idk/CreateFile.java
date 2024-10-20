package ie.atu.idk;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args)throws IOException {

        File myFile = new File("MyFile1.txt");
        System.out.println("My file is located at " + myFile.getAbsolutePath());

        FileWriter outputFile = new FileWriter("MyFile1.txt", true);

    }

}
