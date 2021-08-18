/**
* This defines the OnlineBook class.
*
* @author Jared Thacker
8 @version March 29, 2021
*/
public class OnlineBook extends OnlineTextItem {
   //fields not inherited from OnlineArticle
   protected String author;
   
/**
* This is the constructor for the OnlineBook class.
*
* @param nameIn - the name of the book
* @param priceIn - the price of the book
*/
   public OnlineBook(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      
      author = "Author Not Listed";
   }
   
/**
* This returns a string that contains information about the OnlineBook object.
*
* @return the string the contains the information
*/
   public String toString() {
      return name + " - " + author + ": $" + this.price;
   }
   
/**
* This method sets the author of the OnlineBook class.
*
* @param authorIn - the author of the book
* @return true if the author was set, false otherwise
*/
   public boolean setAuthor(String authorIn) {
      if (authorIn != null) {
         this.author = authorIn;
         return true;
      } else {
         return false;
      }
      
   }
}