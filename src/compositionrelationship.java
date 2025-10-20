import java.util.ArrayList;
import java.util.Scanner;

public class compositionrelationship{
   public static void main(String[] args) {
      Book book = new Book("ajb","my book", 2025,1);
      Book book2 = new Book("ajb","my next book", 2026,2);
      Book book3 = new Book("ajb","my final book", 2030,3);
      
      //book.displayBookInfo();
      
      Library mylibrary = new Library(book,book2,book3);
      //mylibrary.displayLibraryBooks();
      //mylibrary.delBook(3);
      //mylibrary.displayLibraryBooks();
      
      Scanner input = new Scanner(System.in);
      
      do {
      
         System.out.printf("1. display books in library\n2. add book\n3. remove book by ID\n");
         int option = Integer.parseInt(input.nextLine());
         
         switch(option){
            case 1:
               mylibrary.displayLibraryBooks();
               break;
            case 2:
               System.out.println("Enter author:");
               String newAuthor = input.nextLine();
               System.out.println("Enter book title:");
               String newTitle = input.nextLine();
               System.out.println("Enter year book was released:");
               int newYear = Integer.parseInt(input.nextLine());
               System.out.println("Enter book ID:");
               int newID = Integer.parseInt(input.nextLine());
               
               Book newBook = new Book(newAuthor, newTitle, newYear, newID);
               mylibrary.addBook(newBook);
               break;
            case 3:
               System.out.println("Enter the ID of the book you would like removed");
               int userID = Integer.parseInt(input.nextLine());
               mylibrary.delBook(userID);
               break;
         }
      
      
      
      } while(true);
      
      
   }
}

class Book{
   private String author;
   private String title;
   private int year;
   private int ID;
   
   Book(String inAuthor, String inTitle, int inYear, int inID) {
      this.author = inAuthor;
      this.title = inTitle;
      this.year = inYear;
      this.ID = inID;
   }
   
   public void displayBookInfo() {
      System.out.printf("ID: %d\nTitle: %s\nAuthor: %s\nYear: %d\n",this.ID,this.title,this.author,this.year);
   }
   
   public int getID() {
      return this.ID;
   }
   
}

class Library{
   private ArrayList<Book> books = new ArrayList<Book>();   
   

   Library(Book... inBooks) {
      for (Book inBook : inBooks) {
         books.add(inBook);
      }
   }
   
   
   public void displayLibraryBooks() {
      for (Book inBook : books) {
         inBook.displayBookInfo();
      }
   }
   
   public void addBook(Book... inBooks) {
      for (Book inBook : inBooks) {
         books.add(inBook);
      }
   }
   
   public void delBook(int inID) {
      for (int i=0;i<books.size();i++) {
      //System.out.printf("%d, %d\n",books.get(i).getID(),inID);
         if (books.get(i).getID() == inID) {
         //System.out.printf("they equal");
            books.remove(books.indexOf(books.get(i)));
            //int index = books.indexOf(books.get(i));
            //System.out.println(index);
         }
      }
      //books.remove(index);
   }//end of delbook

}