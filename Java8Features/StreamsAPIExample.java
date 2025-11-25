package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPIExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Alex");

        // A stream pipeline to filter, map, and collect results
        List<String> result = names.stream()
                .filter(name -> name.startsWith("A")) // Filter names starting with 'A'
                .map(String::toUpperCase) // Convert to uppercase
                .sorted() // Sort the names
                .collect(Collectors.toList()); // Collect the results into a list

        System.out.println("Original list: " + names);
        System.out.println("Processed list: " + result);

        // Another example: calculating the sum of squares of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = numbers.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
