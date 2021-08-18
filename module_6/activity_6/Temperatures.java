import java.util.ArrayList;
/**
* This program performs various operations on an ArrayList of 
* temperatures.
*
* @author Jared Thacker
* @version February 22, 2021
*/
public class Temperatures {
   //Fields
   private ArrayList<Integer> temperatures;
   
/**Constructor
* The constructor for the Temperatures class.
*
* @param temperaturesIn - The ArrayList of temperatures.
*/
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      temperatures = temperaturesIn;
   }
   
/**
* This method find the lowest temperature in the ArrayList.
*
* @return low - the lowest temperature in the ArrayList.
*/
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 0; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      return low;
   }
   
/**
* This method find the highest temperatures in the ArrayList.
*
* @return high - the highest temperature in the ArrayList.
*/
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp: temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      return high;
   }
   
/**
* The lowerMinimum method takes an int value and returns the parameter
* if it is lower than the value returned by getLowTemp. Otherwise, it 
* returns the return of getLowTemp.
*
* @param lowIn - the temperature value to be tested.
* @return the lowest value between lowIn or getLowTemp().
*/
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
/**
* The higherMaximum method takes an int value and returns the parameter if
* it is greater than the value returned by getHigh Temp. Otherwise, it 
* returns the return of getHighTemp.
*
* @param highIn - the temperature value to be tested.
* @return the highest value between highIn or getHighTemp().
*/
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();   
   }
   
/**
*  This method prints information about the Temperatures object.
*
* @return string that contains information about the Temperatures object.
*/
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();

   }
}