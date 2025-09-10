import java.util.*;
public class NumberPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
        //inner loop for space
        for(int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        
        //inner loop for star
        for(int j = 1; j <= i; j++) {
            System.out.print(i+" ");
            // if want to print star pyramid
            //System.out.print("* ");
        }

        System.out.println(" ");

    }
}
}
