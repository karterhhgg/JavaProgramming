// Print all unique subsequences of a string.
package Recursion;
import java.util.HashSet;  // for the Hashset function
public class PrintUniqueSubsequence {
    public static void subsequences(String str, int idx, String newStr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newStr)){
                return;
            }else{
               System.out.println(newStr);
               set.add(newStr);
               return;
            }
        }
        char currChar = str.charAt(idx);

        // to be come the character in new string(newstr)
        subsequences(str, idx+1, newStr+currChar, set);

        // not to be come the character in the new string(newStr)
        subsequences(str, idx+1, newStr, set);
    }

    public static void main(String[] args) {
        String str = "bbb";
        HashSet<String> set = new HashSet<>();
        subsequences(str, 0, "", set);
    }
}
