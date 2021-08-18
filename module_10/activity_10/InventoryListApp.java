/**
* This is the driver program for the ItemsList class.
*
* @author Jared Thacker
* @version April 5, 2021
*/
public class InventoryListApp {

/**
* This is the main method that drives the implementation of the
* ItemsList class.
*
* @param args - command line args are not used in this program.
*/
   public static void main(String[] args) {
      ItemsList myItems = new ItemsList();
      
      InventoryItem.setTaxRate(0.05);
      
      myItems.addItem(new ElectronicsItem("laptop", 1234.56, 10));
      myItems.addItem(new InventoryItem("motor oil", 9.8));
      myItems.addItem(new OnlineBook("All Things Java", 12.3));
      myItems.addItem(new OnlineArticle("Useful Acronyms", 3.4));
      
      System.out.println(myItems.toString());
      
      System.out.println("Total: " + myItems.calculateTotal(2.0));
   }
}