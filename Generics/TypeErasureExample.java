package Generics;

import java.util.ArrayList;
import java.util.List;

public class TypeErasureExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");

        List<Integer> intList = new ArrayList<>();
        intList.add(123);

        // At runtime, both lists have the same class due to type erasure
        System.out.println("stringList class: " + stringList.getClass());
        System.out.println("intList class: " + intList.getClass());
        System.out.println("Are they the same class? " + (stringList.getClass() == intList.getClass()));

        // The compiler enforces type safety, but the JVM doesn't know about the generic types.
        // The following line would cause a compile-time error:
        // stringList.add(123);
    }
}
