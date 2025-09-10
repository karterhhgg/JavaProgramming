import java.util.Scanner;

/*public class PalindromicPyramid {
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
                 System.out.print("*");
            }
            for(int j = 2; j <= i; j++){
                System.out.print("*");
            }

            System.out.println(" ");
    
        }
    }
}*/

public class PalindromicPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            //inner loop for space
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }

           //inner loop for star
             for(int j = i; j >= 1; j--) {
                 System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }

            System.out.println(" ");
    
        }
    }
}
