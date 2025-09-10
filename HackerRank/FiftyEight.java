package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FiftyEight {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // length of array
        int[] arr = new int[n];
        
        // Read array elements
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int count = 0; // To count number of negative subarrays
        
        // Loop through all possible subarrays
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr[j];
                if(sum < 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}

