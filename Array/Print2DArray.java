//Taking a matrix as an input and printing its elements.
package Array;
import java.util.*;
public class Print2DArray {
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
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(array[i][j]+ "   ");
            }
            System.out.println();
        }
    }
    
}
//output
/*
3
3
1 2 3  4 5 6 7 8 9
1   2   3   
4   5   6
7   8   9        */