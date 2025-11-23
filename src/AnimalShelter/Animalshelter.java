package AnimalShelter;

public class Animalshelter {
    public static void main(String[] args) {
        Dog dog1 = new Dog("dog", 12);
    }
}

class Animal{
    String name;

    void makeSound(){
        System.out.println("Some generic animal sound");
    }

    Animal(String name){
        this.name = name;
    }
}

class Dog extends Animal{
    int massKilos;

    Dog(String name, int massKilos){
        super(name);
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("Woof!");
    }
}

class Cat extends Animal{

    Cat(String name){
        super(name);
    }
}