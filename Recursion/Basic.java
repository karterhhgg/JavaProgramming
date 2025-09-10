// Print numbers from 5 to 1.
package Recursion;
import java.util.*;
public class Basic {
    public static void printNumber(int n) {
        if(n == 0){   //base case
            return;
        }
        System.out.println(n);
        printNumber(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n = sc.nextInt();
        printNumber(n);
    }
    
}
