import java.util.*; // import java.util.Scanner;
public class Employee
{
    public String name;
    public int age;
    // parameterized constructor
    public Employee(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public Employee()
    {
        this.name = "William";
        this.age = 28;
    }
    public void show()
    {
        System.out.println("Name of Employee:"+ this.name);
        System.out.println("Age of Employee:"+ this.age);
    }
    public static void main (String args[])
    {
        Employee e=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of Employee");
        String name=sc.nextLine();
        System.out.println("Enter the Age: ");
        int age=sc.nextInt();
        new Employee(name, age).show();
        new Employee().show();
    }
}
