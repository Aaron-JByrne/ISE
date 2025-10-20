public class inheritence{
   public static void main(String[] args){
      Student ajb = new Student("Aaron", "2006-12-06","25444379", 2025);
      Staff chris = new Staff("Chris", "1990-11-11", "1", "ISE");
      
      
      ajb.displayInfo();
      ajb.displayInfo("Student");
      
      chris.displayInfo();
      chris.displayInfo("Staff");
      
   }
}

class Person {
   protected String name;
   protected String dateOfBirth;
   
   public Person() {
   this.name = "";
   this.dateOfBirth = "";
   }
   
   public Person(String inName, String inDOB) {
      this.name = inName;
      this.dateOfBirth = inDOB;
   }
   
   void displayInfo() {
      System.out.printf("Name: %s, DOB: %s\n",this.name,this.dateOfBirth);
   }
   
   void displayInfo(String prefix) {
      System.out.printf("%s ",prefix);
      this.displayInfo();
   }

   
}

class Student extends Person {
   private String studentID;
   private int year;
   
   public Student(String inName, String inDOB,String inStudentID, int inYear){
      this.name = inName;
      this.dateOfBirth = inDOB;
      this.studentID = inStudentID;
      this.year = inYear;
   }
   
   @Override
   void displayInfo() {
      System.out.printf("Name: %s, DOB: %s, ID: %s, Year: %d\n",this.name,this.dateOfBirth,this.studentID,this.year);
   }

   
}

class Staff extends Person {
   private String staffID;
   private String department;
   
   Staff(String inName, String inDOB, String ID, String inDepartment){
      this.name = inName;
      this.dateOfBirth = inDOB;
      this.staffID = ID;
      this.department = inDepartment;
   }
   
   @Override
   void displayInfo() {
      System.out.printf("Name: %s, DOB: %s, ID: %s, Department: %s\n",this.name,this.dateOfBirth,this.staffID,this.department);
   }


} 