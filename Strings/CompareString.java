package Strings;

public class CompareString {
    public static void main(String[] args) {
        String name1 = "radha";
        String name2 = "radha";
        //use compareTo function  ye function three conddition check karta hai
        // 1. s1>s2 : +ve value
        // 2. s1==s2: 0
        // 3. s1<s2 : -ve value
        if(name1.compareTo(name2) ==0 ){
            System.out.println("Strins are equal");
        }else {
            System.out.println("Strings are not equal");
        }
    }
    
}
