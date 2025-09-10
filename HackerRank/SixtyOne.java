package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class SixtyOne {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        // Reading input into the 2D array
        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }

        bufferedReader.close();

        int maxSum = Integer.MIN_VALUE;

        // Loop through the array and calculate the hourglass sum for each possible hourglass
        for (int i = 1; i < 5; i++) { // i is the center row of the hourglass
            for (int j = 1; j < 5; j++) { // j is the center column of the hourglass
                // Calculate the sum of the hourglass
                int sum = arr.get(i-1).get(j-1) + arr.get(i-1).get(j) + arr.get(i-1).get(j+1) // top row
                        + arr.get(i).get(j) // middle row (just the middle element)
                        + arr.get(i+1).get(j-1) + arr.get(i+1).get(j) + arr.get(i+1).get(j+1); // bottom row

                // Update maxSum if the current hourglass sum is greater
                maxSum = Math.max(maxSum, sum);
            }
        }

        // Print the largest hourglass sum
        System.out.println(maxSum);
    }
}
