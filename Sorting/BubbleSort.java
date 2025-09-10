package Sorting;
import java.util.*;
public class BubbleSort {
    // Time Complexity of Bubble Sort = O(n^2)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        //for input
        System.out.print("Enter the element of array: ");
        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }
        //for output
        System.out.print("Print the array element: ");
        for(int i=0; i<size; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        //bubble Sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){

               // if(arr[j] < arr[j+1]){             (if print the array element in discending order)
                  if(arr[j] > arr[j+1]){           //(if print the array element in ascending order )
                   
                    //swap the element
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            
        }

        System.out.println("Sorted array element using Bubble Sort : ");
        for(int i=0; i<size; i++){
        System.out.print(arr[i]+" ");
        }

     }
    
}

//output
/*
 Enter the size of array:5
 Enter the element of array: 7 8 3 2 1 
 Print the array element:  7 8 3 2 1
 Sorted array element using Bubble Sort :
 1 2 3 7 8
 */