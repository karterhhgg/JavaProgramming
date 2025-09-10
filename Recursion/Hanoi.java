package Recursion;
import java.util.*;
public class Hanoi {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n == 1) {
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        return;
        }
        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoi(n-1, src, dest, helper);
        //transfer nth from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        //transfer n-1 from helper to dest using src as 'helper'
        towerOfHanoi(n-1, helper, src, dest);
        }
        public static void main(String args[]) {
        int n = 3;
        towerOfHanoi(n, "S", "H", "D");   // S=source,  D=Destination, H=helper 
      
    }
}
//output
/*
  transfer disk 1 from S to D
  transfer disk 2 from S to D
  transfer disk 1 from D to H
  transfer disk 3 from S to H
  transfer disk 1 from H to S
  transfer disk 2 from H to S
  transfer disk 1 from S to D
 */
