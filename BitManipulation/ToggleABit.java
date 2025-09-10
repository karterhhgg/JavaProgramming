//Write a program to toggle a bit a position = “pos” in a number “n”.

package BitManipulation;
import java.util.*;
public class ToggleABit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();

        int bitMask = 1<<pos-1;

        int newNumber = num ^ bitMask;
        System.out.println(newNumber);
        
    }
    
}
