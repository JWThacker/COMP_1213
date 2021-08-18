import java.util.Scanner;
import java.util.ArrayList; //imports
import java.io.File;
import java.io.IOException;
/**
* This is a driver program that implements the ConeList class.
*/
public class ConeListApp {

/**
* This is a driver program that implements the ConeList class.
*
* @param args - command line args are not used.
* @throws IOException - simply terminate the program if this
*     exception is thrown.
*/
   public static void main(String[] args) throws IOException {
      
      //Instantiate new intance of the Scanner class.
      Scanner scan = new Scanner(System.in);
      
      //Declare and intialize all strings that will be used in this driver.
      String fileName, line, fileNameFromFile = "", label = "";
      
      //Declare the counter variable that will be used to iterate the loops.
      int counter = 0;
      
      //Declare and initialize the height and radius of the Cones in the 
      //ArrayList of Cones.
      double height = 0.0, radius = 0.0;
      ArrayList<Cone> listOfCones = new ArrayList<Cone>();
      
      //Declare my as an instance of the ConeList class.
      ConeList myList;
      
      //Prompt the user for the file and recieve their input.
      System.out.print("Enter file name: ");
      fileName = scan.nextLine();
      System.out.print("\n");     

      
      //Instantiate instance of the Scanner class called "fileScan".
      Scanner fileScan = new Scanner(new File(fileName));
      
      /*
      * This while loop adds cones to the ArrayList<Cone> from
      * the .txt files.
      */
      while (fileScan.hasNext()) {
         if (counter == 0) {
            fileNameFromFile = fileScan.nextLine();
         }
         else {
            label = fileScan.nextLine();
            height = Double.parseDouble(fileScan.nextLine());
            radius = Double.parseDouble(fileScan.nextLine());
            listOfCones.add(new Cone(label, height, radius));
         }
         counter++;
      }

      
      //Instatiate myList as an instance of the ConeList class.
      myList = new ConeList(fileNameFromFile, listOfCones);
      fileScan.close(); //Close the fileScan object.
            
      
      //Print the output from the toString() and the summaryInfo() methods. 
      System.out.println(myList.toString());
      System.out.println(myList.summaryInfo());
   }

}