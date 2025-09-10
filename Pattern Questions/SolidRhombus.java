import java.util.*;
public class SolidRhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //outer loop

        for(int i = 1; i <= n; i++){
            //inner loop for space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            
            //inner loop for star
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = i; j <= n-1; j++){
                System.out.print("*");
            }

            System.out.println(" ");
    
        }
    }
}
