import java.util.Scanner;

public class StudentArray {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      Student[] studentarr = new Student[5];
      
      for (int i=0;i<5;i++) {
         String name = input.nextLine();
         int score = Integer.parseInt(input.nextLine());
         studentarr[i] = new Student(name, score);
      }
      
      for (Student student : studentarr) {
         System.out.printf("Student name: %s\nStudent Score: %d\n", student.getName(), student.getScore());
      }
   
   }
}

class Student {
   private String name;
   private int score;
   
   public Student(String name, int score) {
      this.name = name;
      this.score = score;
   }
  
   public String getName() {
      return this.name;
   }
   
   public void setName(String userInput) {
      this.name = userInput;
   }
   
   public int getScore() {
      return this.score;
   }
   
   public void setScore(int userScore) {
      this.score = userScore;
   }
}