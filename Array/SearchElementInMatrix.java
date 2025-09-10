// Take a matrix as input from the user. Search for a given number x and 
// print the indices at which it occurs
package Array;
import java.util.*;
public class SearchElementInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int array[][] = new int[rows][cols];

        //input

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                array[i][j] = sc.nextInt();
            }
        }

        //output
        int x = sc.nextInt();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                if(array[i][j]==x){
                    System.out.println("The number is found at indices: ("+i+","+j+")");
                }
            }
        }
    }
    
}
