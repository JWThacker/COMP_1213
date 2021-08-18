import java.util.Scanner;
/**
*  Program to calculate the expression given by "result".
*
*  Module 2: Project 2.
*  @author Jared Thacker
*  @version January 25, 2021 
*/
public class ExpressionSolver
{
/**
*  Calculate the expression given by "Results" and then prints the value for
*  the variables and the result.
*  @param args Commannd line arguments - not used.
*/
   public static void main(String[] args) 
   {
      //declare and initiate x, y, and z
      Scanner userInput = new Scanner(System.in);
     

      double x = 0;
      double y = 0;
      double z = 0;
      double result;
      
      System.out.println("result = (9x + 6.25) (6y - 4.5) (3z + 2.75)"
                         + " / xyz");
      System.out.print("\tx = ");
      x = userInput.nextDouble();
      System.out.print("\ty = ");
      y = userInput.nextDouble();
      System.out.print("\tz = ");
      z = userInput.nextDouble();


      
      //x * y * z == 0, then print "result is "undefined" "
      //otherwise print numerical value of result
      if (x * y * z == 0) {
         System.out.println("result is \"undefined\"");
      } else {
         result = (9 * x + 6.25) * (6 * y - 4.5)
                  * (3 * z + 2.75) / (x * y * z);
         System.out.println("result = " + result);
      }
   }
}