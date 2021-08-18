/**
* This class defines an array list of InventoryItems.
*
* @author Jared Thacker
* @version April 5, 2021
*/
public class ItemsList {
   //fields
   private InventoryItem[] inventory;
   private int count;
   
/**
* This is the constructor for the InventoryItems class.
*/
   public ItemsList() {
      inventory = new InventoryItem[20];
      count = 0;
   }
   
/**
* This method adds an item to the inventory[] field.
*
* @param itemIn - the item to add to the inventory field.
*/
   public void addItem(InventoryItem itemIn) {
      inventory[count] = itemIn;
      count++;
   }
   
/**
* This method calculates the total of the ItemsList.
*
* @param electronicsSurcharge - the surcharge applied only to electronic items.
* @return total - the total cost of the ItemsList.
*/
   public double calculateTotal(double electronicsSurcharge) {
      double total = 0;
      
      for (int i = 0; i < count; i++) {
         if (inventory[i] instanceof ElectronicsItem) {
            total += inventory[i].calculateCost() + electronicsSurcharge;
         } else {
            total += inventory[i].calculateCost();
         }
      }
      
      return total;
   }
   
/**
* This method returns a string the contains information about the list of
* items in the list.
*
* @return output - the string that contains the string of information.
*/
   public String toString() {
      String output = "All inventory:\n\n";
      
      for (int i = 0; i < count; i++) {
         output += inventory[i].toString() + "\n";
      }
      
      return output;
   }
}