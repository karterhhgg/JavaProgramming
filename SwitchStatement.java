
import java.util.Scanner;

public class SwitchStatement {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        // using switch statement
        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid Choice");
        }
     }
}
