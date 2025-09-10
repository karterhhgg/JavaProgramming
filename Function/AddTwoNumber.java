package Function;
import java.util.*;

public class AddTwoNumber {
    public static int calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int a = sc.nextInt();
        System.out.print("Enter the second value: ");
        int b = sc.nextInt();
        
        int sum = calculateSum(a, b);
        System.out.println("Sum of these values: " +sum);

    }
    
}
