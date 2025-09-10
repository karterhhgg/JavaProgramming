//Take an array of Strings input from the user & find
// the cumulative (combined) length of all those strings.

package Strings;
import java.util.*;
public class TakeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int toLength = 0;
        for(int i=0; i<size; i++){
            array[i] = sc.next();
            toLength += array[i].length();
        }
        System.out.println(toLength);
    }

}
