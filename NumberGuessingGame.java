import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
   public static void main(String[] args) {
      int guesses = 10;
      boolean greaterThan = false;
      int pivot = -1;
   
   
      Random r = new Random();
      int theNumber = r.nextInt(100) + 1;
      
           
      System.out.println(theNumber);
      
      System.out.printf("You have 10 chances to Guess a random number between 1 and 100\n");
      
      while (guesses != 0) {
         Scanner input = new Scanner(System.in);
         int guess = input.nextInt();
         
         if (guess == theNumber) {
            System.out.printf("Correct!");
            break;
         }
         else if (guess > theNumber) {
            System.out.printf("Too High!\n");
            greaterThan = true;
            
         }
         else if (guess < theNumber) {
            System.out.printf("Too Low!\n");
            greaterThan = false;
            
         }
         
         if(guesses != 10) {
            if ((guess > pivot) == greaterThan) {
               System.out.printf("Come on, pay attention dude!\n");
            }
         }
         
          pivot = guess;
          guesses--;
      }
      
   }
}
