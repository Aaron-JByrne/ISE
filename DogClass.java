public class DogClass {
   public static void main(String[] args) {
      System.out.println("---");
      
      Dog testdog = new Dog("max", 12);
      testdog.bark();
      testdog.displayAge();
   }
}

class Dog {
   private String name;
   private int age;
   
   
   public Dog(String name, int age) {
      this.name = name;
      this.age = age;
   }
  
   public void bark() {
      System.out.printf("Woof! My name is %s\n", this.name);
   }
   
   public void displayAge() {
      System.out.printf("I am %s years old.\n", this.age);   
   }
}