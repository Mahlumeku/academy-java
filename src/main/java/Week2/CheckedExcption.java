package Week2;

import java.io.FileReader;

import java.io.IOException;

public class CheckedExcption {
    public static void main(String[] args) {
        // Declare the file path
        String filePath = "example.txt";

        // Handle the IOException with a try-catch block
        try {
            // Try to open and read the file
            FileReader reader = new FileReader(filePath);
            System.out.println("File opened successfully.");
            reader.close();  // Close the file reader
        } catch (IOException e) {
            // This block will handle any IOException that occurs
            System.out.println("An error occurred while trying to read the file.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}


