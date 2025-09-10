import java.util.Scanner;

public class HollowRhombus {
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
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
           for(int j = i; j <= n-1; j++){
                if(  i == 1 || j == n-1){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.println(" ");
    
        }
    }
    
}
