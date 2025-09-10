
import java.util.*;
public class ComparisonOperator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        // using the conditional statement (nested if else)
        if(a == b){
            System.out.println("a and b is equal.");
        } else if(a > b) {
            System.out.println("a is greater than b.");
        } else{
            System.out.println("a is lesser than b.");
        }

    }
    
}
