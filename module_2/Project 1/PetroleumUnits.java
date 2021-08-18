import java.util.Scanner;
/**
* A program to convert the amount of oil in ounces to units in
* barrels, gallons, quarts and ounces.
*
* Module 2: Project 2 (unit conversion).
* @author: Jared Thacker
* @version: January 28, 2021 
*/
public class PetroleumUnits {
   static final int ONE_BILLION = (int) 1.0e+9;
   /**
* A program to convert the units of oil.
* @param args Commannd line arguments - not used.
*/
   public static void main(String[] args) {
   
      int ouncesInput = 0;
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter amount of petroleum in ounces: ");
      ouncesInput = userInput.nextInt();
      
      if (ouncesInput > ONE_BILLION)
      {
         System.out.println("Amount must not exceed 1,000,000,000.");
         //return;
      } else {
         int barrels = 0;
         int gallons = 0;
         int quarts = 0;
         int ounces = 0;
         int remainder = 0;
         
         ounces = ouncesInput;
         System.out.println("Petroleum amount in units:");
         barrels = ounces / 5376;
         System.out.println("\tBarrels: " + barrels);

         remainder = ounces % 5376;
         gallons = remainder / 128;
         System.out.println("\tGallons: " + gallons);
      
         remainder = remainder % 128;
         quarts = remainder / 32;
         System.out.println("\tQuarts: " + quarts);
      
         ounces = remainder % 32;
         System.out.println("\tOunces: " + ounces);
         System.out.println(ouncesInput + " oz = " + "(" + barrels 
                            + " bl * " + 5376 + " oz) + " + "(" + gallons 
                            + " gal * " + "128 oz) + " + "(" + quarts  
                            + " qt * 32 oz) + " + "(" + ounces + " oz)");
      }  
   }
}