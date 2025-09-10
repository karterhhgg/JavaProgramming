// Print factorial of a number n.
package Recursion;
import java.util.*;
public class Factorial{
    public static void printFactorial(int n, int fact) {
    if(n == 0 || n == 1){
        System.out.println(fact);
        return ;
    }
    fact *= n;
    printFactorial(n-1, fact);
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        int fact = 1;
        printFactorial(n, fact);

    }
}
