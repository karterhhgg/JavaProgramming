//Write a program to enter the numbers till the user wants and 
//at the end it should display the count of positive, negative and zeros entered. 
package Function;
import java.util.*;
public class CheckPositiveNegativeZero {

   public static void main(String args[]) {
       int positive = 0, negative = 0, zeros = 0;
       System.out.print("Enter how many numbers you want: ");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

       for(int i = 1; i <= n; i++) {
           System.out.print("Enter your number : ");
           int number = sc.nextInt();
           if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }
       }

       System.out.println("Positives : "+ positive);
       System.out.println("Negatives : "+ negative);
       System.out.println("Zeros : "+ zeros);
   }   
}


