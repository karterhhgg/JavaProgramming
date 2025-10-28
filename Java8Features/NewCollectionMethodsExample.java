package Java8Features;

import java.util.ArrayList;
import java.util.List;

public class NewCollectionMethodsExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Anna");

        // forEach method
        System.out.println("Using forEach:");
        names.forEach(name -> System.out.println(name));

        // removeIf method
        System.out.println("\nOriginal list: " + names);
        names.removeIf(name -> name.startsWith("A"));
        System.out.println("List after removing names starting with 'A': " + names);
    }
}
