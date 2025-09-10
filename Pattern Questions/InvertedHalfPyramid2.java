import java.util.Scanner;

public class InvertedHalfPyramid2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for(int j = i; j <= m; j++){
                System.out.print(i+ " ");
            }
            System.out.println(" ");
        }
        System.out.println();

    }
}
