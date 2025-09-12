import java.util.Scanner;

public class GradeCategoryChecker {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      
      if ((num >= 0) && (num <= 100)) {
         if (num >= 90) {
            if (num == 100) {
               System.out.println("Perfect Score.");
            }
            System.out.println("Grade A");
         }
         else if (num >= 80) {
            System.out.println("Grade B");
         }
         else if (num >= 70) {
            System.out.println("Grade C");
         }
         else if (num >= 60) {
            System.out.println("Grade D");
         }
         else {
            System.out.println("Grade F");
         }
      }
      else {
         System.out.println("Invalid score. Please enter a value between 0 and 100.");
      }
   }
}