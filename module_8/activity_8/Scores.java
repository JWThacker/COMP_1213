/**
* This program provides several service methods for an array of integers.
*/
public class Scores {
   //fields
   private int[] numbers;
   
/**
* This is the constructor for the Scores class.
*
* @param numbersIn - an array of integer values
*/
   public Scores(int[] numbersIn) {
      numbers = numbersIn;
   }
   
/**
* This method find the evens from the array of integers.
* @return evens - the array of even integers
*/
   public int[] findEvens() {
      int numberEvens = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            numberEvens++;
         }
      }
      
      int[] evens = new int[numberEvens];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 == 0) {
            evens[count] = numbers[i];
            count++;
         }
      }
      
      return evens;
   }
   
   
/**
* This method find the odds elements in an array of intergers.
*
* @return odds - the array of odd elements
*/
   public int[] findOdds() {
      int numberOdds = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            numberOdds++;
         }
      }
      
      int[] odds = new int[numberOdds];
      
      int count = 0;
      for (int i = 0; i < numbers.length; i++) {
         if (numbers[i] % 2 != 0) {
            odds[count] = numbers[i];
            count++;
         }
      }
      
      return odds;
   }
   
/**
* This method calculates the average of an array of integer value.
*
* @return the average of the array of integers
*/
   public double calculateAverage() {
      int sum = 0;
      
      for (int i = 0; i < numbers.length; i++) {
         sum += numbers[i];
      }
      
      return (double) sum / numbers.length;
   }
   
/**
* This method returns a string of the elements of the array of integers.
*
* @return result - the string with the elements in the array
*/
   public String toString() {
      String result = "";
      
      for (int i = 0; i < numbers.length; i++) {
         result += numbers[i] + "\t";
      }
      return result;
   }
   
/**
* This method prints the elements of the array in reverse order.
*
* @return result - the string with the elements in the array
*/
   public String toStringInReverse() {
      String result = "";
      
      for (int i = numbers.length - 1; i >= 0; i--) {
         result += numbers[i] + "\t";
      }
      return result;
   }

}