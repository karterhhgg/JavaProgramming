package Sorting;
import java.util.*;
public class SelectionSorting {
    //Time Complexity of Selection Sort = O(n^2)
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
        System.out.println("Sorted array element using Selection Sorting: ");
        for(int i=0; i<array.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<array.length; j++){
                if(array[smallest] > array[j]){
                    smallest = j;
                }
            }
                // swap the element
                int temp = array[smallest];
                array[smallest] = array[i];
                array[i] = temp;
            
        }

        for(int i=0; i<size; i++){
            System.out.print(array[i]+" ");
            }
    }
    
}
//output
/*
    Enter the Size of the Array: 5
    Enter the array element: 5 9 2 1 4
    Print the array element:  5 9 2 1 4
    Sorted array element using Selection Sorting:
    1 2 4 5 9
 */
