/**
* This defines the InvalidCategoryException class that
* will be thrown when an invalid category appears in the
* .CSVs.
*
* @author Jared Thacker
* @version April 14, 2021
*/
public class InvalidCategoryException extends Exception {

/**
* This is the constructor for the InvalidCategoryClass.
*
* @param categoryIn - the invalid category
*/
   InvalidCategoryException(String categoryIn) {
      super("For category: " + categoryIn);
   }
}