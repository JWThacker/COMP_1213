/**
* This class is the parent class for the inventory items in a store.
*
* @author Jared Thacker
* @version March 29, 2021
*/
public class InventoryItem {

   //fields
   protected String name;
   protected double price;
   private static double taxRate = 0;
   
/**
* This is the constructor for the InventoryItem class.
*
* @param nameIn - the name of the item
* @param priceIn - the price of the item
*/
   public InventoryItem(String nameIn, double priceIn) {
      name = nameIn;
      price = priceIn;
   }
   
/**
* This is the access method for the name field.
*
* @return the name field for the InventoryItem class
*/
   public String getName() {
      return name;
   }
   
/**
* This method calculates the total cost of the item including tax.
*
* @return the total cost
*/
   public double calculateCost() {
      return price * (1 + taxRate);
   }
   
/**
* This method sets the tax rate for the InventoryClass.
*
* @param taxRateIn - the tax on the item
*/
   public static void setTaxRate(double taxRateIn) {
      taxRate = taxRateIn;
   }
   
/**
* This method prints information about the object.
*
* @return the string contianing the information about the Inventoryitem
*    object
*/
   public String toString() {
      return name + ": $" + this.calculateCost();
   }
}