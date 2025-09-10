// Write a program to find if a number is a power of 2 or not.

package BitManipulation;
import java.util.*;
public class PowerOf2OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int val = (n & (n-1));
        if(val == 0){
            System.out.println("given number is power of 2.");
        } else{
            System.out.println("given number is not power of two");
        }
    }
    
}
