package StringBuilders;

public class FirstProgram {
    public static void main(String[] args) {
        // declare string builder
        StringBuilder sb = new StringBuilder("Prity");
        System.out.println(sb);

        //get a character at any index  using .charAt() function
        System.out.println(sb.charAt(0));

        //set a character at any index using .setCharAt() function
        sb.setCharAt(0, 'K');
        System.out.println(sb);

        //insert some charecter in the string at any index using .insert(indexNumber, insertedCharacter) function
        sb.insert(0, 'A');
        System.out.println(sb);

        // delete the character in  the string at any index using .delete(startIndexNumber, endIndexNumber)function
        // first value : jhan se delete start karna h
        // second value : jhan tak delete karna hai
        sb.delete(0, 1);
        System.out.println(sb);

        //add some character in the string  at ending position using .append()function
        // ya ise append bhi kahte hain means add something at the end
        sb.append("S");   //str = str + "S";
        sb.append("i");   //str = str + "i";
        sb.append("n");   //str = str + "n";
        sb.append("g");   //str = str + "g";
        sb.append("h");   //str = str + "h";
        System.out.println(sb);

        // find length of string  using .length() function
        System.out.println(sb.length());
    }
    
}
//output
/*
Prity
P
Krity
AKrity
Krity 
KritySingh
10          */
