package Function;
import java.util.*;

public class PrintName {
    public static void printMyName(String name){   //create a function
        System.out.println(name);
        return;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);  //call the function
    }
    
    
}
