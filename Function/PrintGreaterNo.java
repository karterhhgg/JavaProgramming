//Write a function which takes in 2 numbers and returns the greater of those two.
package Function;
import java.util.*; 

public class PrintGreaterNo {
    public static int calculateGreaterNo(int a, int b){
        if(a > b){
            System.out.println("a is greater than b.");
            return a;
        } else {
            System.out.println("b is greater than a.");
        return b;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calculateGreaterNo(a, b));
        }   
}
