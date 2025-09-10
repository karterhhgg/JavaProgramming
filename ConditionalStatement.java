
import java.util.*;
public class ConditionalStatement {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        // using the if else statement

        if(age >= 18){
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }
    }
}
