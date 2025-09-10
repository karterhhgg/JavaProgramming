//  Print all the subsequences of a string.
// time complexity = O(2^n)    ,  n= no. of character in string
package Recursion;
public class PrintSubsequences {
    public static void subsequences(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);

        // to be come the character in new string(newstr)
        subsequences(str, idx+1, newStr+currChar);

        // not to be come the character in the new string(newStr)
        subsequences(str, idx+1, newStr);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
    }
}
