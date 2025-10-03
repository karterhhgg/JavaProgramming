package Generics;

// A generic class
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class GenericClassAndMethodExample {
    // A generic method
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Using the generic class
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(10);
        System.out.println("Integer Box content: " + integerBox.getContent());

        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics");
        System.out.println("String Box content: " + stringBox.getContent());

        // Using the generic method
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C"};

        System.out.print("Integer Array: ");
        printArray(intArray);

        System.out.print("String Array: ");
        printArray(stringArray);
    }
}
