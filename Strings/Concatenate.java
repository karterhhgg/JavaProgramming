package Strings;

public class Concatenate {
    public static void main(String[] args) {
        //concatenation 
        String firstName = "Prity";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        //String fullName = firstName = "@" + lastName;
        System.out.println(fullName);
        //length of the string
        System.out.println("Length of the string: " + fullName.length());
        // use charAt for print all character separately
        for(int i=0; i<fullName.length(); i++){
        System.out.println(fullName.charAt(i));
        }
    }
}
