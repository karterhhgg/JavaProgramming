package ExceptionHandling;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Exception handling
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // This block is always executed
            System.out.println("Finally block executed.");
        }
    }
}
