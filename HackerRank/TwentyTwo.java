package HackerRank;

import java.io.*;
import java.util.*;

public class TwentyTwo {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String reversed = new StringBuilder(A).reverse().toString();
        if(A.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

}
