public class intarr {
   public static void main(String[] args) {
      int[] myArray = {1,1,2,3,5};
      
      for (int i=0;i<myArray.length;i++) {
         System.out.println(myArray[i]);
      }
      
      myArray[2] = 100;
      
      for (int i=0;i<myArray.length;i++) {
         System.out.println(myArray[i]);
      }
   }
}

   