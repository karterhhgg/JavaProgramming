/*
 After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.
Sample Input
5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1
Sample Output
0 0
1 0
1 1
1 2

 */
package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Twenty {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 
        
        BitSet[] bitsets = new BitSet[3]; 
        bitsets[1] = new BitSet(n);
        bitsets[2] = new BitSet(n);
        
        for (int i = 0; i < m; i++) {
            String op = sc.next();
            int set1 = sc.nextInt();
            int set2 = sc.nextInt();
            
            if (op.equals("AND")) {
                bitsets[set1].and(bitsets[set2]);
            } else if (op.equals("OR")) {
                bitsets[set1].or(bitsets[set2]);
            } else if (op.equals("XOR")) {
                bitsets[set1].xor(bitsets[set2]);
            } else if (op.equals("FLIP")) {
                bitsets[set1].flip(set2);
            } else if (op.equals("SET")) {
                bitsets[set1].set(set2);
            }
            
            System.out.println(bitsets[1].cardinality() + " " + bitsets[2].cardinality());
        }
        
        sc.close();
    }
}
