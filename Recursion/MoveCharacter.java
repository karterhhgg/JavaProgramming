// Move all ‘x’ to the end of the string. 
// Time Complexity = O(n)
package Recursion;
public class MoveCharacter {
    public static void moveAllX(String str, int idx, int count, String newStr){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x' || currChar == 'X'){
            count ++;
            moveAllX(str, idx+1, count, newStr);
        } else{
            newStr += currChar;   
            moveAllX(str, idx+1, count, newStr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcXXd";
        moveAllX(str, 0, 0, "");
    }
}
