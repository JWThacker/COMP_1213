import java.util.Scanner; //imports
import java.text.DecimalFormat;
/**
* A program to calculate the result involving cubic powers, square powers, a
* a radical and an absolute value.
* 
* @author Jared Thacker
* @version February 2, 2021
*/
public class SolveIt {
/**
* A program to calculate the result from a complicated mathematical expression.
* @param args Commannd line arguments - not used.
*/
   public static void main(String[] args) {
      
      //Instantiate userInput as an instance of the Scanner class.
      Scanner userInput = new Scanner(System.in);

      //Declare and intialize all doubles, String() objects and integers.
      double x = 0, xPrime = 0, beneathRadical = 0, divisor = 0, result = 0;
      String resultString = "";
      int periodIndex = 0, charsToRight = 0, charsToLeft = 0;
      
      /* Instatiate df as an object of the DecimalFormat class that
      *  will format the final output of the program.
      */
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      //Prompt user for their input. Receive their input.
      System.out.print("Enter a value for x: ");
      x = userInput.nextDouble();      
      xPrime = x;

      //Calculate the divisor and the expression beneath the radical.
      beneathRadical = 3 * Math.pow(xPrime, 2) + 2 * x + 1;
      divisor = Math.abs(2 * xPrime) + 4;
      
      /* If the expression beneath the radical is less than 0,
      *  prompt the user and terminate the program.
      */
      if (beneathRadical < 0) {
         System.out.println("The expression under the radical cannot be"
                            + " negative; program terminated.");
         System.exit(1);
      }

      /* Calculate the string and determine how many characters are to the
      *  left and right of the decimal.
      */
      result = (6 * Math.pow(xPrime, 3) + Math.sqrt(beneathRadical)) / divisor;
      resultString = Double.toString(result);
      periodIndex = resultString.indexOf('.');
      charsToRight = resultString.length() - 1 - periodIndex;
      charsToLeft = periodIndex;
      
      //Output the result to the terminal.
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: "
                         + charsToLeft);
      System.out.println("# of characters to right of decimal point: " 
                         + charsToRight);
      System.out.print("Formatted Result: " + df.format(result));      
   }

}