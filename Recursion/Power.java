// Print x^n (with stack height = n)
package Recursion;
import java.util.*;
public class Power {
    public static int calcPower(int x, int n) {
        if(n == 0){        // base case1
            return 1;
        }
        if(x == 0){       // base case2
            return 0;
        }
        int xPownm1 = calcPower(x, n-1); // calculate the x power n-1(x^n-1)
        int xPown = x * xPownm1;        // calculate the x power n (x^n) 
        return xPown;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = calcPower(x,n);
        System.out.print("Calculated power is: ");
        System.out.println(ans);
        
    }
    
}
// output
/*
   Enter the value of x: 2
   Enter the value of n: 1
   Calculated power is: 2
 */
