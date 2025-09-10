// Here's the complete working code to check whether two strings are anagrams or not, considering case insensitivity, suitable for Java 7:
package HackerRank;

import java.util.Scanner;

public class TwentyThree {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If lengths are different, they can't be anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Use an array to count character frequencies (26 letters in English)
        int[] charCount = new int[26];

        // Increase count for each character in 'a'
        for (int i = 0; i < a.length(); i++) {
            charCount[a.charAt(i) - 'a']++;
        }

        // Decrease count for each character in 'b'
        for (int i = 0; i < b.length(); i++) {
            charCount[b.charAt(i) - 'a']--;
        }

        // If any count is not zero, then it's not an anagram
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

