// update the 2nd bit (position = 1) of a number n to 1. (n = 0101 )
package BitManipulation;
import java.util.*;
public class UpdateBitProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // if oper = 1: set operartion
        // if oper = 0: clear operation
        int n = 5; //0101
        int pos = 1;
         int bitMask = 1<<pos;

         if(oper == 1){
            //set operation
            int newNumber = bitMask | n;
            System.out.println(newNumber);
         } else{
            // clear operation
            int newBitMask = ~(bitMask);
            int newNumber = bitMask & n;
            System.out.println(newNumber);
         }
    }
}
