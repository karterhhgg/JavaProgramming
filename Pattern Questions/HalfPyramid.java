import java.util.*;
/*public class HalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
        System.out.println();

    }
}*/

//half pyramid with number
/*public class HalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= i; j++){
                System.out.print( j );
            }
            System.out.println(" ");
        }
        System.out.println();

    }
}*/

// alphabet half pyramid
public class HalfPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        for(int i = 1; i <= m; i++){
            char alphabet = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print( alphabet );
                alphabet ++;
            }
            System.out.println(" ");
        }
        System.out.println();

    }
}
