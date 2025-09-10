import java.util.Scanner;

public class HalfPyramid2 {
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
            System.out.print(j+" ");
        }

        System.out.println(" ");

    }
  }
    
}
