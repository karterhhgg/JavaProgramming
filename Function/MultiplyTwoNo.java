package Function;
import java.util.*;
public class MultiplyTwoNo {

    public static int calculateMultiply(int a, int b){
        int mul = a * b;
        return mul;
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateMultiply(a,b);
        System.out.println(sum);
    }

}
