/**
* this defines the Division class responsible for carrying out the divisions
* in the DivisionDriver program.
*
* @author Jared Thacker
* @version April 12, 2021
*/
public class Division {

/**
* This method performs integer division for two integers.
* 
* @param numeratorIn - the numerator of the fraction.
* @param denominatorIn - the denominator of the fraction.
*
* @return output - the quotient if the division was carried, 0 otherwise
*/
   public static int intDivide(int numeratorIn, int denominatorIn) {
      try {
         int output = numeratorIn / denominatorIn;
         return output;
      } 
      catch (ArithmeticException e) {
         return 0;
      }
   }
   
/**
* This defines the decimal division class responsible for carrying
* out the divisions in the DivisionDriver program.
*
* @param numeratorIn - the numerator of the fraction.
* @param denominatorIn - the denominator of the fraction.
* @return output - the quotient if the division was carried out.
* @throws IllegalArgumentException - exception throw if 0 is entered.
*/
   public static  double decimalDivide(int numeratorIn, int denominatorIn) 
      throws IllegalArgumentException {
      
      if (denominatorIn == 0) {
         throw new IllegalArgumentException("The denominator "
            + "cannot be zero.");
      } else {
         double output = (double) numeratorIn / denominatorIn;
         return output;
      }
   }
}