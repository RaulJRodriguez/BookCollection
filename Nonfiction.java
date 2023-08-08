public class Nonfiction extends Book{
   private int edition;
   
   public Nonfiction(String title, String author, int publishYear, int edition){
      super(title, author, publishYear);
      if (edition < 0){
      throw new IllegalArgumentException("Edition must be greater than 0");
      }
      
      this.edition = edition;
   }
   
   public int getEdition() {return this.edition;}
   
   public String toString() {
      return super.toString()
      + "\nEdition: " + this.edition;
   }

}
