import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeList {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      ArrayList<Double> grades = new ArrayList<Double>();
      grades.add(100.0);
      grades.add(50.0);
      System.out.println(grades);
           
      do {
      System.out.printf("1. Add new grades\n2. Remove grades by index\n3. Update a grade by index\n4. Display all grades\n5. Display average grade\n");
      int option = input.nextInt();

      
         switch(option){
            case(1):
               double newGrade = input.nextDouble();
               grades.add(newGrade);
               break;
         
            case(2):
               int userIndex = input.nextInt();
               grades.remove(userIndex);
    
               break;
         
            case(3):
               int updateIndex = input.nextInt();
               double updateGrade = input.nextDouble();
               grades.set(updateIndex, updateGrade);
               break;
         
            case(4):
               System.out.println(grades);
               break;
         
            case(5):
               double sum=0;
               for (int i=0;i<grades.size();i++) {
                  sum += grades.get(i);
               }
               double average = (sum)/(grades.size());
               System.out.println(average);
               break;
         
         
         }
      } while(true);
   }
}