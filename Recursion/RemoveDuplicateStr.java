//  Remove duplicates in a string.
// time complexity = O(n)
package Recursion;
public class RemoveDuplicateStr {
    public static boolean [] map = new boolean [26];  // size 26 liye hai kyon ki alphabet 26 hota h
    public static void removeDuplicate(String str, int idx, String newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicate(str, idx+1, newStr);
        } else{
            newStr += currChar;
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr); 
        }
    }
    public static void main(String[] args) {    
        String str =  "abbccda";
        removeDuplicate(str, 0, "");
    }
}
