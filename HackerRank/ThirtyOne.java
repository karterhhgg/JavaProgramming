package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ThirtyOne {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Read initial list size
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        // Read the list elements
        for (int i = 0; i < n; i++) {
            list.add(scanner.nextInt());
        }

        // Read number of queries
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer

        for (int i = 0; i < q; i++) {
            String queryType = scanner.nextLine(); // Read "Insert" or "Delete"
            String[] query = scanner.nextLine().split(" ");

            if (queryType.equals("Insert")) {
                int index = Integer.parseInt(query[0]);
                int value = Integer.parseInt(query[1]);
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = Integer.parseInt(query[0]);
                list.remove(index);
            }
        }

        // Print the final list
        for (int num : list) {
            System.out.print(num + " ");
        }

        scanner.close();

    }
}

