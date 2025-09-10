package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FourtySix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            
            // Using Reflection to get MessageDigest instance
            Class<?> clazz = Class.forName("java.security.MessageDigest");
            Object md = clazz.getMethod("getInstance", String.class).invoke(null, "SHA-256");
            clazz.getMethod("update", byte[].class).invoke(md, input.getBytes());
            byte[] digest = (byte[]) clazz.getMethod("digest").invoke(md);
            
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

