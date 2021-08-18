/**
* This defines the OnlineArticle class.
*
* @author Jared Thacker
* @version March 29, 2021
*/
public class OnlineArticle extends OnlineTextItem {
   //fields
   private int wordCount;
   
/**
* This is the constructor for the OnlineArticle class.
*
* @param nameIn - the name of the article
* @param priceIn - the price of the article
*/
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
/**
* This method sets the word count for the article.
*
* @param wordCountIn - the word count of the article
* @return true if the word count is set, false otherwise
*/
   public boolean setWordCount(int wordCountIn) {
      if (wordCountIn != 0) {
         wordCount = wordCountIn;
         return true;
      } else {
         return false;
      }
   }
}