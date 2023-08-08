public abstract class Book {
   private String title;
   private String author;
   private int publishYear;
   private static int numBooks;
   
   public Book(String title, String author, int publishYear) {
      if (title == null || title.equals("")) {
         throw new IllegalArgumentException("Title must be provided");      
      }
      if (author == null || author.equals("")) {
         throw new IllegalArgumentException("Author must be provided");      
      }  
      if (publishYear < 0) {
         throw new IllegalArgumentException("The year of publisment must be provided");      
      } 
   
      this.title = title;
      this.author = author;
      this.publishYear = publishYear;
      ++this.numBooks;
   }

   public String getTitle() { return this.title; }
   public String getAuthor() { return this.author; }
   public int getPublishYear() { return this.publishYear; }
   public static int getNumBooks() { return numBooks; }

   
   public void setTitle(String title) {
      if (title == null || title.equals("")) {
         throw new IllegalArgumentException("The Title of the book must be provided");      
      }
      this.title = title;
   }

   public void setAuthor(String author) {
      if (author == null || author.equals("")) {
         throw new IllegalArgumentException("The Author of the book must be provided");      
      }   
      this.author = author;
   }

   public void setPublishYear(int publishYear) {
      if (publishYear < 0) {
         throw new IllegalArgumentException("The year of publishment must be provided");      
      }   
      this.publishYear = publishYear;
   }
   
   public String toString() {
      return "Book: " + this.getTitle() + "\nWritten by: " + this.getAuthor()
         + "\nYear Published: " + this.getPublishYear();
   }
}