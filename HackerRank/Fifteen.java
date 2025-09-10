package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Fifteen {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        // These are already filled in the loop above, don't overwrite them!

        //Write your code here
        Set<String> pairs = new HashSet<String>();

        for (int i = 0; i < t; i++) {
            // Just use existing values (do NOT call s.next() again)
            String a = pair_left[i];
            String b = pair_right[i];

            String combined;
            if (a.compareTo(b) < 0) {
                combined = a + "," + b;
            } else {
                combined = b + "," + a;
            }

            pairs.add(combined);
            System.out.println(pairs.size());
        }

        s.close();
    }
}
