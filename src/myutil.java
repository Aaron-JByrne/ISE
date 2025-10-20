import java.util.Scanner;

public class myutil {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      boolean running = true;
      
      do {
      System.out.printf(" === MyUtil Utility Menu === \n1. Find smallest number among three\n2. Computer average of three numbers\n3. Find middle character(s) of a string\n4. Exit\n");
      int userInput = Integer.parseInt(input.nextLine());
      
      
      switch (userInput) {
         case 1:
            System.out.printf("Enter your first number: ");
            double num1 = input.nextDouble();
            input.nextLine();
            System.out.printf("Enter your second number: ");
            double num2 = input.nextDouble();
            input.nextLine();
            System.out.printf("Enter your third number: ");
            double num3 = input.nextDouble();
            input.nextLine();
            System.out.println(UtilityApp.findSmallest(num1,num2,num3));
            break;
         case 2:
            System.out.printf("Enter your first number: ");
            double avnum1 = input.nextDouble();
            input.nextLine();
            System.out.printf("Enter your second number: ");
            double avnum2 = input.nextDouble();
            input.nextLine();
            System.out.printf("Enter your third number: ");
            double avnum3 = input.nextDouble();
            input.nextLine();
            System.out.println(UtilityApp.computeAverage(avnum1, avnum2, avnum3));
            break;
         case 3:
            System.out.printf("Enter your string: ");
            String userString = input.nextLine();
            System.out.println(UtilityApp.getMiddleCharacter(userString));
            break;
         case 4:   
            running = false;
      }//end of switch
     }//end of do
     while (running);
   }
  
}

class UtilityApp {
   public static String getMiddleCharacter(String input) {
      if ((input.length() / 2) % 2 == 0) {
         Character middle = input.charAt(((input.length()/2)-1));
         Character middle2 = input.charAt(((input.length()/2)));
         String FinalMiddle = middle.toString().concat(middle2.toString());
         return FinalMiddle;
      }
      else {
         Character middle = input.charAt(input.length()/2);
         return middle.toString();
      }
   }
   
   public static double computeAverage(double a, double b, double c) {
      return (a+b+c)/3;
   }
   
   
   public static double findSmallest(double a, double b, double c) {
      if ( (a<b) && (a<c) ) {
         return a;
      }
      else if ( (b<c) && (b<a) ) {
         return b;
      }
      else {
         return c;
      }
         
   }
}
