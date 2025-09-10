import java.util.*;
public class HollowButterfly {
    public static void main(String []agrs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //upper half  hollow butterfly
        for(int i = 1; i <= n; i++){
            //inner loop for first triangle
            for(int j = 1; j <= i; j++){
                if( j == 1 || j == i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

           //inner loop for second triangle space
            for(int j = 1; j <= 2*(n-i); j++){
            System.out.print(" ");
        }

        //inner loop for second triangle star
        for(int j = 1; j <= i; j++) {
            if( j == 1 || j == i ){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
            System.out.println(" ");
        }
        //lower half hollow butterfly
        for(int i = n; i >= 1; i--){
            //inner loop for first triangle
            for(int j = 1; j <= i; j++){
                if( j == 1 || j == i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }

           //inner loop for second triangle space
            for(int j = 1; j <= 2*(n-i); j++){
            System.out.print(" ");
        }

        //inner loop for second triangle star
        for(int j = 1; j <= i; j++) {
            if( j == 1 || j == i ){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
            System.out.println(" ");
        }
    }
    
}
