// Print x^n (with stack height = logn)
package Recursion;
import java.util.*;
public class Power2 {
    public static int calPow(int x, int n) {
        if(n == 0){        // base case1
            return 1;
        }
        if(x == 0){       // base case2
            return 0;
        }
        // if n is even
        if(n % 2 == 0){
            return calPow(x, n/2) * calPow(x, n/2);
        }
        // if n is odd
        else{
            return calPow(x, n/2) * calPow(x, n/2) * x;
        }  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the value of x: ");
        int x = sc.nextInt();
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int ans = calPow(x,n);
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