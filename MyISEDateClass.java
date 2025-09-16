import java.time.LocalDate;
import java.util.Date;
import java.time.Period;
import java.lang.Math;
import java.time.temporal.ChronoUnit;



public class MyISEDateClass {
   public static void main(String[] args) {
      //LocalDate date2 = LocalDate.now();
      MyISEDate date1 = new MyISEDate();
      
      MyISEDate date2 = new MyISEDate(11, 9, 2020);
      
      date1.getDay();
      date1.setDay(29);
      date1.getDay();
      
      date1.getMonth();
      date1.setMonth(2);
      date1.getMonth();
      
      date1.getYear();
      date1.setYear(2001);
      date1.getYear();
      
      
      date1.displayNumberOfDays();
      
      date1.displayDate();
   }
}

class MyISEDate {
   private int day;
   private int month;
   private int year;
   
   // blank constructor
   public MyISEDate() {
      LocalDate date = LocalDate.now();
      
      this.day = date.getDayOfMonth();
      this.month = date.getMonthValue();
      this.year = date.getYear();
   }
   
   // use chosen date constructor
   public MyISEDate(int dd, int mm, int yyyy) {   
      this.day = dd;
      this.month = mm;
      this.year = yyyy;
      
      //System.out.printf("%d-%d-%d",this.day, this.month, this.year);
   }
   
   public void getDay() {
      System.out.printf("todays date is %d\n",this.day);
   }
   
   public void setDay(int dd) {
      boolean validdate = true;
      if (dd < 0) {
         System.out.printf("Invalid Date\n");
         validdate = false;
      }
      else if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12) {
         if (dd > 31) {
            System.out.printf("Invalid Date\n");
            validdate = false;

         }
      }
      else if (this.month == 2) {
         if (dd > 28) {
            System.out.printf("Invalid Date\n");
            validdate = false;

         }
      }
      else {
         if (dd > 30) {
            System.out.printf("Invalid Date\n");
            validdate = false;

         }
      }
        
      if (validdate) {
         System.out.printf("date changed from %d to %d\n", this.day, dd);
         this.day = dd;
      
      }
   }
   
   public void getMonth() {
      System.out.printf("the month is %d\n",this.month);
   }
   
   public void setMonth(int mm) {
      if (mm > 0 && mm <= 12) {
      System.out.printf("month changed from %d to %d\n", this.month, mm);
      this.month = mm;
      }
      else {
         System.out.printf("Invalid Month\n");
      }
   }
   
   public void getYear() {
      System.out.printf("The year is %d\n",this.year);
   }
   
   public void setYear(int yyyy) {
      if (yyyy > 0) {
      System.out.printf("Year changed from %d to %d\n", this.year, yyyy);
      this.year = yyyy;
      }
      else {
         System.out.printf("Invalid Year\n");
      }
   }
   
   
   public void displayNumberOfDays() {
      LocalDate date = LocalDate.now();
      LocalDate date2 = LocalDate.of(this.year, this.month, this.day);
     
         
      
      
      long daysBetween = ChronoUnit.DAYS.between(date, date2);
      System.out.printf("%d days between %s and %s\n",Math.abs(daysBetween), date, date2);
   }
   
   public void displayDate() {
      System.out.printf("%s-%s-%s\n",this.day, this.month, this.year);
   }
   
}