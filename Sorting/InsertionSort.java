package Sorting;
import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int size = sc.nextInt();
        int array[] = new int[size];
        
        //for input
        System.out.print("Enter the array element: ");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        //for output
        System.out.print("Print the array element: ");
        for(int i=0; i<size; i++){
            System.out.print(" "+ array[i]);
        }

        System.out.println();
        // Selection Sort
        System.out.println("Sorted array element using Insertion Sorting: ");
        

       for(int i=1; i<array.length; i++) {
        int current = array[i];
        int j = i - 1;
            while(j >= 0 && array[j] > current) {
                //Keep swapping
                array[j+1] = array[j];
                j--;
            }
              array[j+1] = current;
        }
        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
            
        }
    }
    
}
