/**
* This class defines a customer class with varying fields and methods.
*
* @author Jared Thacker
* @version March 16, 2021
*/
public class Customer implements Comparable<Customer> {

   // fields
   private String name;
   private String location;
   private double balance;
   
/**
* This is the constructor for the customer class.
*
* @param nameIn - the name of the customer
*/
   // constructor
   public Customer(String nameIn) {
      name = nameIn; //sets name to parameter input
      location = "";
      balance = 0;
   }

/**
* This method changes the location field to the parameter.
*
* @param locationIn - the string value that location will be changed to
*/
   public void setLocation(String locationIn) {
      location = locationIn;
   }
   
 /**
 * This method sets the location via two separate parameters for state
 * and city.
 *
 * @param cityIn - the string value that city will be changed to
 * @param stateIn - the string value that state will be changed to
 */
   public void setLocation(String cityIn, String stateIn) {
      location = cityIn + ", " + stateIn;
   }

/**
* This method changes the balance field by the parameter amount.
*
* @param amount - the double value that balance should be changed to
*/
   public void changeBalance(double amount) {
      balance += amount;
   }

/**
* This method returns the value of the location field.
*
* @return location - the location field
*/
   public String getLocation() {
      return location;
   }
   
/**
* This method return the balance field.
*
* @return balance - the balance that the customer has
*/
   public double getBalance() {
      return balance;
   }
   
/**
* This method return a string that has information listed about the object.
*
* @return output - the string that contains the information
*/
   public String toString() {
   
      String line1 = name;
      String line2 = location;
      String line3 = balance + "";
      
      String output = line1 + "\n" + line2 + "\n" + "$" + line3;
      
      return output;
   
   }
   
/**
* This method compares an object of type Customer to an object of the
* same type.
*
* @param obj - the customer obj for comparison
* @return 1 if this > than obj
*/
   public int compareTo(Customer obj) {
      if (Math.abs(this.balance - obj.getBalance()) < 0.000001) {
         return 0;
      } else if (this.balance < obj.getBalance()) {
         return -1;
      }  else {
         return 1;
      }
   }
   
}