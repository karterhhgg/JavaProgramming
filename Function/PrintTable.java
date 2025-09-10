package Function;

import java.util.Scanner;

public class PrintTable {
    public static void printtableOfNumber(int num){

        for(int i=1; i<=10;i++){
        System.out.println(" "+ num*i);
        }
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        printtableOfNumber(num);        
    }    
}

// if print table until 2-10
/*public class PrintTable {
    public static void printtableOfNumber(int num){

        for(int i=1; i<=10;i++){
        System.out.print(" "+ num*i);
        }
    }
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i=num; num<=num2; num++){
        printtableOfNumber(num);
        System.out.println();
        
    }
    }

    
}*/

