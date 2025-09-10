// This will output true or false for each IP address based on whether it matches the given pattern.
package HackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class TwentySix {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

//Write your code here
class MyRegex {
    // Regular expression pattern to validate an IP address
    String pattern = "^([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])\\.([01]?\\d{1,2}|2[0-4]\\d|25[0-5])$";
}