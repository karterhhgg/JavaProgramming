//Q3. Find the occurrence of the first and last occurrence of an element using recursion.
// that means koi element string me first time kab aaya aur last time kab aaya
package Recursion;
public class Occurance {
    // hum apna first and last variables ko static bnayenge kyonki isko bar bar hum recursion function ke undar call nhi karna chahte
    public static int first = -1;
    public static int last = -1;
    public static void findOccurance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println("First Occurance in index : "+first);
            System.out.println("Last Occurance in index : "+last);
            return;
        }

        char currChar = str.charAt(idx);
        if(currChar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str, idx+1, element);
    } 

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOccurance(str, 0, 'a'); 
    }
}
