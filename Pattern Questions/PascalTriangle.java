import java.util.Scanner;

public class PascalTriangle {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    for(int i = 0; i < n; i++){
        //inner loop for space
        for(int j = 1; j < n-i; j++){
            System.out.print(" ");
        }
        
        //inner loop for star
        int c = 1;
        for(int j = 0; j <= i; j++) {
            System.out.print(c+ " ");
            c = c*(i-j) / (j+1);
        }

        System.out.println(" ");

    }
}
    
}
