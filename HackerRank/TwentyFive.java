// Here's the complete code that checks whether the given regex pattern is valid by attempting to compile it using Pattern.compile():

package HackerRank;

import java.util.Scanner;
import java.util.regex.*;

public class TwentyFive {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
             if(!in.hasNextLine())
             return;
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0 && in.hasNextLine()){
			String pattern = in.nextLine();
          	//Write your code
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
        in.close();
    }
}
