package Java8Features;

interface MyInterface {
    // An abstract method
    void abstractMethod();

    // A default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // A static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of the abstract method.");
    }
}

public class DefaultAndStaticMethodsExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.abstractMethod();
        myClass.defaultMethod(); // Calling the default method

        MyInterface.staticMethod(); // Calling the static method
    }
}
