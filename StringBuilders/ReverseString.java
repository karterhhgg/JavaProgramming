//Reverse a String (using StringBuilder class)

package StringBuilders;
import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        System.out.println("The original string is :" + sb);

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;    // 5-1-0 = 4

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.print("Reverse string is : ");
        System.out.print(sb);
    }
}
//output
/*
 The original string is :hello
Reverse string is : olleh
 */