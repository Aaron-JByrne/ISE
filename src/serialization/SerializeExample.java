package serialization;

import java.io.*;

// A simple class that implements Serializable
class Person implements Serializable {
    // Recommended: define a serialVersionUID
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public String getFileName() {
        return String.format("%s.ser", this.name);
    }
}

public class SerializeExample {
    static void write(Person inPerson){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(inPerson.getFileName()))) {
            out.writeObject(inPerson);
            System.out.println("Object has been serialized to " + inPerson.getFileName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void read(String fileName){
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Object has been deserialized:");
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        Person person2 = new Person("j", 22);

        write(person2);
        read("j.ser");

        write(person);
        read("Alice.ser");

        /*
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            out.writeObject(person);
            System.out.println("Object has been serialized to person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Object has been deserialized:");
            deserializedPerson.display();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

         */
    }
}
