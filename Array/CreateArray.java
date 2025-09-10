package Array;

public class CreateArray {
    public static void main(String[] args) {
        // creating array method - 1 with new keyword
   /*  int [] marks = new int[3];
    marks[0] = 80;
    marks[1] = 70;
    marks[2] = 90;  */

    // creating array method - 2 
    int marks[]={70,80,90};
   //System.out.println(marks[0]);
   //System.out.println(marks[1]);
   //System.out.println(marks[2]);
   for(int i = 0; i<3; i++){
    System.out.println(marks[i]);
   }
}
    
}
