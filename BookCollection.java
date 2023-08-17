import javax.swing.JOptionPane;
import java.util.ArrayList;

public class BookCollection {

   private static ArrayList<Book> bookList = new ArrayList<>();
   
   public static void main(String[] args) {
      boolean keepRunning = true;
      int choice = 0;
      while (keepRunning) {
      choice = Integer.parseInt(JOptionPane.showInputDialog(null, "BOOK COLLECTION MENU " + "\nEnter '1' to add a book " + "\nEnter '2' to display a list of books" + "\nEnter '3' to quit"));
      switch(choice) {
         case 1:
           //add a book
            String title = JOptionPane.showInputDialog("Enter the book's title:");
            String author = JOptionPane.showInputDialog("Enter the book's author:");
            int publishYear = Integer.parseInt(JOptionPane.showInputDialog("Enter the year the book was published:"));
            String type = JOptionPane.showInputDialog("Is the book Nonfiction or Fiction? ");
            Book book = new Book(title, author, publishYear);
         
            if (type.equalsIgnoreCase("nonfiction")) {
               Nonfiction nonfiction;
               int edition = Integer.parseInt(JOptionPane.showInputDialog("Enter the edition of the nonfiction book:"));
               nonfiction = new Nonfiction(title, author, publishYear, edition);
               JOptionPane.showMessageDialog(null, nonfiction.toString());
               bookList.add(nonfiction);
            } else {
               JOptionPane.showMessageDialog(null, book.toString());
               bookList.add(book);
            }
            break;
         case 2:
         // print list of books
         for (Book b : bookList) {
        JOptionPane.showMessageDialog(null, b.toString());
    }
            break;
         case 3:
         //ends program
         JOptionPane.showMessageDialog(null, "Goodbye!");
         keepRunning = false;
            break;
      }
   
   
   
   
   
        
   }
   }
}