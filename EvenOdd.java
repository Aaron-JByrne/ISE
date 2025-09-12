import java.util.Scanner;

public class EvenOdd {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int num = input.nextInt();
      
      boolean isEven = (num % 2 == 0);
      
      if (isEven) {
         System.out.printf("Even");
      }
      else {
         System.out.printf("Odd");
      }
      
   }
}