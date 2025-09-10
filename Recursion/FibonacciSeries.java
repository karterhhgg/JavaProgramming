// Print the fibonacci sequence till nth term.
package Recursion;
import java.util.*;
public class FibonacciSeries {
    public static void printFibonacci(int a, int b, int term){
        if(term == 0){
            return;
        } 
        System.out.print(a+" ");
        printFibonacci(b, a+b, term-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int term = sc.nextInt();
        int a = 0;               // first term
        int b = 1;               // second term
        printFibonacci(a, b, term);
    }
}
