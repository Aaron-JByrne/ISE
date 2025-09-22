public class Calc{
   public static void main(String[] args){
      System.out.println(Calculator.Add(1.2,2));
   }
}

class Calculator{
   public static int Add(int num1, int num2){
      return num1 + num2;
   }
   public static int Add(int num1, int num2, int num3){
      return num1 + num2;
   }
   public static double Add(double num1, double num2){
      return num1 + num2;
   }
   public static double Add(double num1, int num2){
      return num1 + num2;
   }
   public static double Add(int num1, double num2){
      return num1 + num2;
   }
}