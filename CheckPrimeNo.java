// Print if a number n is prime or not (Input n from the user). 
import java.util.*;
public class CheckPrimeNo {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number: ");
       int n = sc.nextInt();
       int temp = 0;
       /*boolean isPrime = true;
       for(int i=2; i<=n/2; i++) {
           if(n % i == 0) {
               isPrime = false;
               break;
           }
       }


       if(isPrime) {
           if(n == 1) {
               System.out.println("This is neither prime not composite");
           } else {
               System.out.println("This is a prime number");
           }
       } else {
           System.out.println("This is not a prime number");
       }*/

       if(n == 1){
        System.out.println("Neihter prime not Composite");
       } else{
        for(int i=2; i<=n-1; i++) {
           if(n % i == 0) {
              temp += 1;
           }
        }
        if(temp == 0){
              System.out.println(n+" This number is prime");
           }else{
            System.out.println(n+"This number is not prime");
           }
        }
       
   }
}
