package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// A class that implements Comparable
class Student implements Comparable<Student> {
    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", gpa=" + gpa + '}';
    }

    // Default sorting by ID
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.id, other.id);
    }
}

// A comparator to sort by name
class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}

// A comparator to sort by GPA
class SortByGpa implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return Double.compare(b.getGpa(), a.getGpa()); // Descending order
    }
}

public class ComparableAndComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Charlie", 3.8));
        students.add(new Student(1, "Alice", 3.5));
        students.add(new Student(2, "Bob", 3.9));

        // Sorting using Comparable (default sorting by ID)
        Collections.sort(students);
        System.out.println("Sorted by ID (Comparable): " + students);

        // Sorting using Comparator (by name)
        Collections.sort(students, new SortByName());
        System.out.println("Sorted by Name (Comparator): " + students);

        // Sorting using Comparator (by GPA)
        Collections.sort(students, new SortByGpa());
        System.out.println("Sorted by GPA (Comparator): " + students);
    }
}
