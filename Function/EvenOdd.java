package Function;

import java.util.Scanner;

public class EvenOdd {
    public static void checkEvenOrOdd(int num){

        if( num%2 == 0 ){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        checkEvenOrOdd(num);
    }
    
}
