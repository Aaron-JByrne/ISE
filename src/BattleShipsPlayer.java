public class BattleShipsPlayer {
   public static void main(String[] args) {
      int[][] array = { {1,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0,0,0} };
      //int[][] array = new int[10][10];
      Grid.display(array);
   }
}

class Grid {
   public static void display(int[][] inarray) {
      System.out.printf("  0 1 2 3 4 5 6 7 8 9\n");
      
      for (int i=0;i<10;i++) {
         System.out.printf("%d ",i);
         for (int[] miniarr : inarray) {
            System.out.printf("%s ",Grid.convert(miniarr[i]));
            
         }
         System.out.printf("\n");
      }
      
   }
   public static char convert(int input) {
      if (input == 0) {
         return '~';
      }
      else if (input == 1) {
         return 'X';
      }
      else if (input == 2) {
         return 'O';
      }else {
         return 'n';
      }
   }
  
   
   
   
}