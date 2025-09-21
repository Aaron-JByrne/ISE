public class ASCIItriangles {
   public static void main(String[] args) {
      //for (int i = 1; i < 6; i++) {
      //   System.out.println("*".repeat(i));
      //} 
      
      //for (int i = 5; i > 0; i--) {
      //   String x = (" ".repeat(5-i) + "*".repeat(i));
      //   System.out.printf("%s\n",x);
      //} 
      
      
      for (int i = 1; i < 6; i++) {
         String x = (" ".repeat(5-i) + "*".repeat(2*i-1));
         System.out.printf("%s\n",x);
      } 
      
      
      
      
      
      //for (int i = 5; i > 0; i--) {
      //   String x = ("*".repeat(i) + " ".repeat(5-i));
      //   System.out.printf("%s\n",x);
      //} 
      
      
   }
}