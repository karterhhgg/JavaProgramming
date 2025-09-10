

import java.util.*;

public class TakeInput {
   // @SuppressWarnings("resource")
    public static void main(String args[]){
        //how to take input using Scanner class import from the java.util package
       /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum); */
        Scanner sc = new Scanner(System.in);

    // jab hum next() function ka use karte hain to only one token(i.e. ram) input leta hai
       // String name = sc.next();
    // multiple tokens(ram singh) ke liye nextLine() function ka use karte hain
        String name = sc.nextLine();
    // multile type ke variables ke different type ka function use hota hai
        //nextInt()
        //nextFloat()
        //nextDouble()
        System.out.println(name);

    }
    
}
