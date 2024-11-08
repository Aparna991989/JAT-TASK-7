package EXCEPTIONS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadExample {
    public static void main(String[] args) {
        try {
            // Attempt to open and read from a file
            File file = new File("data.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("File contents:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            // Handle the exception if the file is not found
            System.out.println("Error: File not found. Please ensure the file exists.");
        }
    }
}



