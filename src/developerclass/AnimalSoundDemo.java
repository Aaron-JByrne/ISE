import java.lang.reflect.*;

// Main class to demonstrate polymorphism
public class AnimalSoundDemo {
    public static void main(String[] args) {
        // Create an array of Animal references
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();  // Polymorphic assignment
        animals[1] = new Cat();
        animals[2] = new Cow();

        // Loop through the array and call makeSound()
        for (Animal animal : animals) {
            animal.makeSound();  // Polymorphism in action
        }

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.printf("is a subclass of %s\n",animal.getClass().getSuperclass().getSimpleName());

            Method[] Declaredmethods = animal.getClass().getDeclaredMethods();
            Method[] methods = animal.getClass().getMethods();

            for (Method method : methods) {
                System.out.println(method.getName());
            }
            for (Method method : Declaredmethods) {
                //System.out.println(method.getName());
            }
        }

    }
}

// Define the interface
interface Animal {
    void makeSound(); // abstract method
}

// Implementing the interface in different classes
class Dog implements Animal {
    //  @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    public void makeSoundA() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Cow implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Cow says: Moo!");
    }
}