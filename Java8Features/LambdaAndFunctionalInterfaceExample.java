package Java8Features;

// A functional interface has only one abstract method
@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();
}

public class LambdaAndFunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface myFunc = () -> System.out.println("Hello from a lambda expression!");
        myFunc.myMethod();

        // Another example with a functional interface that takes parameters
        MathOperation addition = (a, b) -> a + b;
        System.out.println("10 + 5 = " + addition.operate(10, 5));

        MathOperation subtraction = (a, b) -> a - b;
        System.out.println("10 - 5 = " + subtraction.operate(10, 5));
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}
