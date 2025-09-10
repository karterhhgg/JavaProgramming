package Function;

import java.util.Scanner;

public class PrimeOrNot {
    public static void checkPrime(int num){
        int count = 0;
        for(int i = 1; i <= num; i++ ){
            if(num % i == 0){
                count ++;
            }
        }
        if( count == 2 ){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        checkPrime(num);
    }
    
}
