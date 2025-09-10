// Print numbers from 1 to 5.
package Recursion;
import java.util.*;
public class Basic2 {
    public static void printNumber(int n) {
        if(n == 0){      //base case
            return;
        }
       
        printNumber(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n = sc.nextInt();
        
        printNumber(n);
    }
    
}
