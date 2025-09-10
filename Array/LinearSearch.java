// Take an array as imput from the user. Search for a given number x
// and print the index at which it occurs.

package Array;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("size of the array: ");
        int size = sc.nextInt();
        System.out.println(" input the array element: ");
        int numbers[] = new int[size];
        //for input
        for(int i=0; i<size; i++){
            numbers[i]=sc.nextInt();
        }
        //for searching
        System.out.print(" enter the number do you want to search: ");
        int x = sc.nextInt();
        for(int i=0; i<size; i++){
            if(numbers[i] == x){
            System.out.println(" x found at index: "+i);
            } 
        }
    }
}
    

