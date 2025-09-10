//Write a function that takes in age as input and returns if that 
//person is eligible to vote or not. A person of age > 18 is eligible to vote.

package Function;
import java.util.Scanner;

public class Eligibility {
    public static boolean isEligibility(int age){
        if(age >= 18){
            System.out.print("The person is eligible : "+" ");
            return true;
        } else {
            System.out.print("The person is not eligible : "+" ");

            return false;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

       // System.out.print("The circumference of a circle is:" +" ");
        System.out.println(isEligibility(age));

    }
    
}
