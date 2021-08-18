/**
* This defines the ElectronicsItem class.
*
* @author Jared Thacker
* @version March 29, 2021
*/
public class ElectronicsItem extends InventoryItem {
   //fields not inherited from InventoryItem
   protected double weight;
   
   /**
   * This is the shipping cost of the ElectronicsItem class.
   */
   public static final double SHIPPING_COST = 1.5;
   
/**
* This is the constructor for the ElectronicsItem class.
*
* @param nameIn - the name of the item
* @param priceIn - the price of the item
* @param weightIn - the shipping weight of the item
*/
   public ElectronicsItem(String nameIn, double priceIn, double weightIn) {
      super(nameIn, priceIn);
      
      weight = weightIn;
   }
   
/**
* This calculates the total cost of the item including shipping weight and tax.
*
* @return the total cost of the item
*/
   public double calculateCost() {
      return super.calculateCost() + (SHIPPING_COST * weight);
   }
   
   
}