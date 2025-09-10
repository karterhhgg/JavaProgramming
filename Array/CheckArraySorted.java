//Take an array of numbers as input and check if
// it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//   {3, 4, 6, 2} is not sorted in ascending order.

package Array;
import java.util.*;
public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arrays[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            arrays[i] = sc.nextInt();
        }

       /*  boolean isAscending = true;

        for(int i=0; i<arrays.length-1; i++){
            if(arrays[i]>arrays[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array is sorted in ascending order.");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }

    }
    
}*/
boolean isDiscending = true;

        for(int i=0; i<arrays.length-1; i++){
            if(arrays[i]<arrays[i+1]){
                isDiscending = false;
            }
        }
        if(isDiscending){
            System.out.println("The array is sorted in discending order.");
        }else{
            System.out.println("The array is not sorted in discending order");
        }

    }
    
}
