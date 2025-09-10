// Print the string in reverse
// Time Complexity = O(n)   n=length of string
package Recursion;
import java.util.*;
public class Reverse {
    public static void reverseString(String str, int index){
        if(index == 0){
            System.out.print(str.charAt(index));
            return;
        }

        System.out.print(str.charAt(index));
        reverseString(str, index-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.next();
        int index = str.length()-1;
        System.out.print("Reverse String is: ");
        reverseString(str, index);
    }
}
