public class Multidimensionarr{
   public static void main(String[] args) {
      int[][] myNumbers = { {1,4,2}, {3,6,8}, {32,64,85} };
      
      for (int[] inarr : myNumbers) {
         for (int num : inarr) {
            System.out.printf("%d ",num);
         }
         System.out.println();
      }
      
      for (int i=0;i<myNumbers.length;i++) {
         for (int j=0;j<myNumbers[i].length;j++) {
            System.out.printf("%d ",myNumbers[i][j]);
         }
         System.out.println();
      }
   }
}