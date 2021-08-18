import java.util.Scanner;

public class PetroleumUnitsFirstDraft {

   public static void main(String[] args) {
      Scanner user_input = new Scanner(System.in);
      int barrels = 0;
      int gallons = 0;
      int quarts = 0;
      int ounces = 0;
      double dummy_conv = 0;
      double remainder = 0;
      
      System.out.print("Enter amount of petroleum in ounces: ");
      ounces = user_input.nextInt();

      dummy_conv = (double) ounces / 5376;

      remainder = ounces % 5376;

      barrels = (int) dummy_conv;
      System.out.println("Barrels: " + barrels);

      remainder = remainder * 42 / 5376;

      gallons = (int) remainder;
      if (gallons != 0){
         remainder %= gallons;
      }
      System.out.println("Gallons: " + gallons);
      dummy_conv = remainder * 4;
      quarts = (int) dummy_conv;
      System.out.println("Quarts: " + quarts);
      
      if (quarts != 0)
      {
         remainder = dummy_conv % quarts;
         dummy_conv = remainder * (32);
      } else {
      //remainder = dummy_conv % quarts;
      dummy_conv = remainder * (32 * 4);
      }
      
      ounces = (int) dummy_conv;
      System.out.println("Ounces: " + ounces);

      //dummy_conv = ((double) gallons * 42 / (double) 5376) ;
      
/*      System.out.println(dummy_conv);      
      System.out.println(barrels);
      System.out.println(remainder);
      System.out.println(gallons);      
      System.out.println(remainder);
      */
   }

}