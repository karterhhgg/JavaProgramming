package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class FiftySeven {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        BigInteger num = new BigInteger(n);

        if (num.isProbablePrime(10)) { // certainty = 10 is enough for this problem
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}

