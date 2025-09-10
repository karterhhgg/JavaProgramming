package Strings;

import javax.sound.sampled.SourceDataLine;

public class SubString {
    public static void main(String[] args) {
    String sentence = "My name is Prity Singh";
    //use .substring(1,2) fuunction isme do index pass karte hain 
    // pahla beginning index jhan se hame string print karna hai
    // dusra ending index jhan tak hame string print karna hai
    // but hame ending index ek jyada lena hoga kyonki ye length se ek kam tak print karta hai
    // for ex- agar hame hame 4 tak length chahiye to 5 put karna hoga 
   
    //System.out.println(sentence.substring(0,3));
    String name = sentence.substring(11,sentence.length());
    System.out.println(name);
    }
}
