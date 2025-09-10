//  Print the sum of first n natural numbers.
package Recursion;
import java.util.*;
public class SumOfNaturalNo {
    public static void printSum(int i, int n, int sum) {
        if(i > n){
            System.out.println(sum);
            return;
        }
        sum = sum + i;  // sum+=n;
        printSum(i+1, n, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter the value: ");
        int num = sc.nextInt();
        int sum = 0;
        printSum(i, num, sum);
    }
}
