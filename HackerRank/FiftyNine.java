package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FiftyNine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        // Read number of lines
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline after reading the integer
        
        // Initialize an ArrayList to hold the lines of numbers
        ArrayList<ArrayList<Integer>> lines = new ArrayList<>();
        
        // Read each line
        for (int i = 0; i < n; i++) {
            // Read the number of integers in the line and the integers themselves
            String[] input = sc.nextLine().split(" ");
            ArrayList<Integer> line = new ArrayList<>();
            for (int j = 1; j < input.length; j++) {  // Skip the first number (count)
                line.add(Integer.parseInt(input[j]));
            }
            lines.add(line);
        }
        
        // Read the number of queries
        int q = sc.nextInt();
        
        // Process each query
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt() - 1;  // Convert 1-based index to 0-based
            int y = sc.nextInt() - 1;  // Convert 1-based index to 0-based
            
            // Check if the indices are valid
            if (x >= 0 && x < n && y >= 0 && y < lines.get(x).size()) {
                System.out.println(lines.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
        
        sc.close();
    }
}
