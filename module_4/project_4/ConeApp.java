import java.util.Scanner;
/**
* This is a driver program for the Cone class.
*
* @author: Jared Thacker
* @version: February 11, 2021
*/
public class ConeApp {
/**
* This is a driver program for the Cone class.
* @param args - command line arguments not used.
*/
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String label = "";
      double height = 0;
      double radius = 0;
      
      //Prompt and receive the user for the cone radius.
      System.out.print("Enter label, height, and radius for a cone.\n"
         + "\tlabel: ");
      label = userInput.nextLine().trim();
      
      //Prompt and receive the cone height from the user.
      System.out.print("\theight: ");
      height = Double.parseDouble(userInput.nextLine());
      if (height <= 0.0) {
         System.out.println("Error: height must be greater than 0.");
         return;
      }

      //Prompt and receive the cone radius from the user.
      System.out.print("\tradius: ");
      radius = Double.parseDouble(userInput.nextLine());
      if (radius <= 0) {
         System.out.println("Error: radius must be greater than 0.");
         return;
      }
      
      //Instantiate the cone object and call the toString() method.
      Cone cone = new Cone(label, height, radius);
      System.out.println(cone.toString());
   }  
}