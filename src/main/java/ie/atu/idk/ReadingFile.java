package ie.atu.idk;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws IOException {

        // Open the file
        Scanner inputFile = null;
        try {
            inputFile = new Scanner(new File("MyFile1.txt"));
        }catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }

        // Read data from all of file
        while(inputFile.hasNext()){
            String readData = inputFile.nextLine();
            System.out.println(readData);
        }

        // Close when done
        inputFile.close();
    }
}
