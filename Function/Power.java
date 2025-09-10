
//Two numbers are entered by the user, x and n. Write a function to 
//find the value of one number raised to the power of another i.e. xn.
package Function;

import java.util.Scanner;

public class Power {
    public static void main(String args[]) {
       System.out.print("Enter x: ");
       Scanner sc = new Scanner(System.in);
       float x = sc.nextFloat();
       System.out.print("Enter n: ");
       float n = sc.nextFloat();

       float result = 1;
       //Please see that n is not too large or else result will exceed the size of int
       for(int i=0; i<n; i++) {
           result = result * x;
       }
       System.out.println("x to the power n is : "+ result);
   }   
}
