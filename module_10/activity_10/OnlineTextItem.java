/**
* This defines the OnlineTextItem class.
*
* @author Jared Thacker
* @version March 29, 2021
*/
public abstract class OnlineTextItem extends InventoryItem {
   
/**
* This is the constructor for the OnlineTextItem class.
*
* @param nameIn - the name of the item
* @param priceIn - the price of the item
*/
   public OnlineTextItem(String nameIn, double priceIn) {
      super(nameIn, priceIn);
   }
   
/**
* This calculates the total cost of the item.
*
* @return the price of the item
*/
   public double calculateCost() {
      return price;
   }
}