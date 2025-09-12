import java.util.Scanner;



public class StudentGrades {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      
      
      System.out.printf("Enter the score of your exam: ");
      
      int score = input.nextInt();
      
      if ((score >= 0) && (score <= 100)) {
         
         if (score >= 90) {
            System.out.printf("Excellent Work");
         }
         if (score > 50) {
            System.out.printf("You passed the exam");
         }
         else {
            System.out.printf("You failed the exam");
         }
         
      }
      else {
         System.out.printf("invalid input");
      }
      
   }   
}