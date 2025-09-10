import java.util.Scanner;

public class RotateHalfPyramid {
    // rotate the upper half pyramid in 180 degree
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();

    //outer loop
    for(int i = 1; i <= m; i++){
        //inner loop for space print
        for(int j = 1; j <= m-i; j++){
            System.out.print(" ");
        }
        
        //inner loop for star
        for(int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

}
