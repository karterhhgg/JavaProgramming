//Write a function that takes in the radius as input and returns the circumference of a circle.
package Function;
import java.util.*;

public class Circumference {
    public static double getCircumference(int radius){
        double Circumference = 2 * 3.1416 * radius;
        return Circumference;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        System.out.print("The circumference of a circle is:" +" ");
        System.out.println(getCircumference(radius));

    }    
}
