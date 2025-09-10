package Array;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        //input

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[i][j]+ "   ");
            }
            System.out.println();
        }

        System.out.println("The tranpose of matrix:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    
}

//output
/*
 3
3
1 2 3 4 5 6 7 8 9
1   2   3   
4   5   6
7   8   9
The tranpose of matrix:
1 4 7
2 5 8
3 6 9
 */
