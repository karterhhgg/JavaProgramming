//Enter 3 numbers from the user & make a function to print their average.
package Function;
import java.util.Scanner;

public class AverageOfThreeNo {
    public static void printAverage(int a, int b, int c){

        int sum = a+b+c;
        int avg = sum/3;

        System.out.println("Average of these numbers: "+avg);
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        printAverage(a, b, c);
    }   
}
