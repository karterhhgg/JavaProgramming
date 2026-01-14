package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamExample {
    public static void main(String[] args) {
        String filename = "test.txt";
        String content = "Hello, Java I/O!";

        // Write to a file using FileOutputStream
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(content.getBytes());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        // Read from a file using FileInputStream
        try (FileInputStream fis = new FileInputStream(filename)) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println("\nSuccessfully read from the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
