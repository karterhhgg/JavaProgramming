package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedVsUncheckedException {
    public static void main(String[] args) {
        // Unchecked exception (RuntimeException)
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // Throws ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }

        // Checked exception (must be handled or declared)
        try (FileReader fr = new FileReader("nonexistent.txt")) {
            // This line will not be reached as the file does not exist.
            System.out.println("File opened.");
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("I/O Exception: " + e.getMessage());
        }
    }
}
