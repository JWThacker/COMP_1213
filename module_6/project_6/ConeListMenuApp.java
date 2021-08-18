import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
/**
* This is a driver program to test the ConeList class.
*
* @author - Jared Thacker
* @version - February 26, 2021
*/
public class ConeListMenuApp {

/**
* This is a driver program to test the ConeList class.
*
* @param args - command line args not used
* @throws IOException - don't terminate if user gives wrong file name
*/
   public static void main(String[] args) throws IOException {
      //Make all declarations and initializations
      String line1, line2, line3, line4, line5, line6, line7, line8,
         line9, line10, stdInput,
         nameOfFile = "*** no list name assigned ***", newLabel = "",
         myLabel = "";
      Cone myCone = new Cone("", 0, 0);
      ArrayList<Cone> myListOfCones = new ArrayList<Cone>();
      ConeList myList = new ConeList(nameOfFile, myListOfCones);
      boolean keepGoing = true, truthValue = false;
      int coneListSize = 0;
      double newHeight = 0.0, newRadius = 0.0;
      
      //Define the only Scanner object
      Scanner userInput = new Scanner(System.in);
      
      //Initialize the lines of the selection list
      line1 = "Cone List System Menu";
      line2 = "R - Read File and Create Cone List";
      line3 = "P - Print Cone List";
      line4 = "S - Print Summary";
      line5 = "A - Add Cone";
      line6 = "D - Delete Cone";
      line7 = "F - Find Cone";
      line8 = "E - Edit Cone";
      line9 = "Q - Quit";
      line10 = "Enter Code [R, P, S, A, D, F, E, or Q]: ";
      
      //Prompt user with the selection list
      System.out.print(line1 + "\n" + line2 + "\n" + line3 + "\n" + line4
         + "\n" + line5 + "\n" + line6 + "\n" + line7 + "\n" + line8 + "\n"
         + line9 + "\n");
     
      /*This loop processes user input and maps it to the appropriate
      * case in the switch statment. The loop continues until the user
      * enter "q" or "Q".
      */
      do {
         System.out.print(line10);
         stdInput = userInput.nextLine();
         switch (stdInput) {
            case "R":
            case "r": //read file
               System.out.print("\tFile name: ");
               stdInput = userInput.nextLine();              
               myList = myList.readFile(stdInput);
               System.out.println("\tFile read in and Cone List created\n");
               break;
            case "P":
            case "p": //print info about the ConeList object
               System.out.println("\n" + myList.toString());
               break;
            case "A":
            case "a": //add a cone to the list
               System.out.print("\tLabel: ");
               newLabel = userInput.nextLine();
               System.out.print("\tHeight: ");
               newHeight = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius: ");
               newRadius = Double.parseDouble(userInput.nextLine());
               myList.addCone(newLabel, newHeight, newRadius);
               System.out.println("\t*** Cone added ***" + "\n");
               break;
            case "F":
            case "f": //find a cone in the list
               System.out.print("\tLabel: ");
               myLabel = userInput.nextLine();
               myCone = myList.findCone(myLabel);
               if (myCone == null) {
                  System.out.println("\t\"" + myLabel + "\""
                     +  " not found.\n");
               } else {
                  System.out.println(myCone.toString() + "\n");
               }
               break;
            case "D":
            case "d": //delete a cone in the list
               System.out.print("\tLabel: ");
               myLabel = userInput.nextLine();
               myCone = myList.deleteCone(myLabel);
               if (myCone == null) {
                  System.out.println("\t\"" + myLabel + "\" not found" + "\n");
               } else {
                  System.out.println("\t\"" + myCone.getLabel()
                      + "\" deleted" + "\n");
               }
              
               break;
            case "E":
            case "e": //edit a cone in the list
               System.out.print("\tLabel: ");
               newLabel = userInput.nextLine();
               System.out.print("\tHeight: ");
               newHeight = Double.parseDouble(userInput.nextLine());
               System.out.print("\tRadius: ");
               newRadius = Double.parseDouble(userInput.nextLine());
               truthValue = myList.editCone(newLabel, newHeight, newRadius);
               if (truthValue) {
                  System.out.print("\t\"" + newLabel
                     + "\" successfully edited\n" + "\n");
               } else {
                  System.out.print("\t\"" + newLabel + "\" not found\n" + "\n");
               }
               break;
            case "S":
            case "s": //print summary statement
               System.out.println("\n" + myList.summaryInfo() + "\n");
               break;
            case "Q":
            case "q": //terminate program
               keepGoing = false;
               break;
            default: //In case user enters invalid code
               System.out.println("\t*** invalid code ***\n");
               break;
         }
      } while (keepGoing); 
      
   }
}