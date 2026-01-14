package Java8Features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalAndMethodReferenceExample {
    public static void main(String[] args) {
        // Optional example
        Optional<String> optionalWithValue = Optional.of("Hello");
        Optional<String> optionalEmpty = Optional.empty();

        System.out.println("Optional with value: " + optionalWithValue.orElse("Default"));
        System.out.println("Empty optional: " + optionalEmpty.orElse("Default"));

        optionalWithValue.ifPresent(value -> System.out.println("Value is present: " + value));
        optionalEmpty.ifPresent(value -> System.out.println("This will not be printed."));

        // Method reference example
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using a lambda expression
        List<String> upperCaseNamesLambda = names.stream()
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Uppercase (lambda): " + upperCaseNamesLambda);

        // Using a method reference
        List<String> upperCaseNamesMethodRef = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase (method ref): " + upperCaseNamesMethodRef);

        // Another method reference example (to a constructor)
        List<Person> people = names.stream()
                .map(Person::new)
                .collect(Collectors.toList());
        System.out.println("People created with method reference: " + people);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + '}';
    }
}
