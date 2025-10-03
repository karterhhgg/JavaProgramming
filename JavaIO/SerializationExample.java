package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// A class that implements Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class SerializationExample {
    public static void main(String[] args) {
        String filename = "person.ser";
        Person person = new Person("John Doe", 30);

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
            System.out.println("Object has been serialized.");
        } catch (IOException e) {
            System.out.println("An error occurred during serialization: " + e.getMessage());
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Object has been deserialized: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization: " + e.getMessage());
        }
    }
}
