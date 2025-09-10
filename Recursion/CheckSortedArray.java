//Check if an array is sorted (strictly increasing). - 
// time complexity = O(n)
package Recursion;
public class CheckSortedArray {
    public static boolean checkSorted(int arr[], int idx){
       
        if(idx == arr.length-1){
            return true;
        }
      /*    if(arr[idx] < arr[idx+1]){
            // array is sorted till now
            return checkSorted(arr,idx+1);
        } else{
            return false;
        }  */
          
        // another way
        
            if(arr[idx] >= arr[idx+1]){
            // array is unsorted
            return false;
            }
            return checkSorted(arr, idx+1);
         
    }  
    
    public static void main(String[] args) {
        int arr[] = {1, 0, 3};
        System.out.print(" Array is sorted:  ");
        System.out.print(checkSorted(arr, 0));
    }
}
