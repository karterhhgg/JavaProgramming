package Generics;

import java.util.Arrays;
import java.util.List;

public class WildcardExample {
    // Upper-bounded wildcard: accepts a list of Number or its subclasses
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    // Unbounded wildcard: accepts a list of any type
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Lower-bounded wildcard: accepts a list of Integer or its superclasses
    public static void addIntegers(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        System.out.println("Sum of integers: " + sumOfList(intList));

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);
        System.out.println("Sum of doubles: " + sumOfList(doubleList));

        System.out.print("Integer list: ");
        printList(intList);

        System.out.print("Double list: ");
        printList(doubleList);

        List<Number> numList = Arrays.asList(1, 2.5, 3L);
        addIntegers(numList);
        System.out.println("List after adding integers: " + numList);
    }
}
