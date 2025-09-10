package Function;
import java.util.*;
public class FactorialOfNumber {

    public static void printFactorial(int num){
        //running loop for factorial
        int factorial = 1;
        
        for(int i=num; i>=1;i-- ){
            factorial = factorial * i;
        }

        System.out.println(factorial);
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printFactorial(num);
    }

}
