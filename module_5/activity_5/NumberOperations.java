/**
* This program receives a list of numbers and performs various operations
* on it.
*
* @author Jared Thacker
* @version February 15, 2021
*/
public class NumberOperations {
   //Fields
   private int number;

/**
* This is the constructor for the NumberOperations class.
* @param numberIn - the number of the NumberOpeations object.
*/
   //Constructor
   public NumberOperations(int numberIn) {
      number = numberIn;
   }

/**
* This method return the number field for the NumberOperations object.
*
* @return number - the value of the number field.
*/
   //Methods
   public int getValue() {
      return number;
   }
   
/**
* This method returns the odd numbers under the number field.
*
* @return output - the string of list of numbers as described.
*/
   public String oddsUnder() {
      String output = "";
      int i = 0;
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
         i++;
      }
      return output;
   }
   
/**
* This method returns the powers of two that are under the number field.
*
* @return output - the list of powers of two as described above.
*/
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      while (powers < number) {
         output += powers + "\t"; //concatenate to output
         powers = powers * 2;
      }
      return output;
   }

/**
* This method returns various integer values depending on the relation of the
* number fields' relation to compareNumber.
*
* @param compareNumber - the number to compare to the number field.
* @return an integer.
*/  
   public int isGreater(int compareNumber) {
      if (number > compareNumber) {
         return 1;
      } 
      else if (number < compareNumber) {
         return -1;
      } 
      else {
         return 0;
      }
   }
   
/**
* This method prints information about the NumberOperations object.
*
* @return the string that displays information about the NumberOperations
*  object.
*/
   public String toString() {
      return number + "";
   }
}