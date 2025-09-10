package HackerRank;

import java.util.*;

public class SixtyFour {

    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n]; // Create array 'a' of size 'n'
        
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt(); // Store each input in the array
        }
        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

