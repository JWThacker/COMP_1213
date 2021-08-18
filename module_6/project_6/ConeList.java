import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;       //imports
import java.io.IOException;
import java.text.DecimalFormat;
/**
* This program constructs an ArrayList of Cones and calculates/prints
* certain quantities for the ArrayList of Cones.
*
* @author Jared Thacker
* @version February 17, 2021
*/
public class ConeList {
/** Field declarations
* listName - the name of the ArrayList of Cones.
* coneList - the ArrayList of Cones.
*/
   private String listName = "";
   private ArrayList<Cone> coneList = new ArrayList<Cone>();
   
/** Constructor declaration
* This is the constructor for the ConeList class.
*
* @param listNameIn - The name of the list of Cones.
* @param coneListIn - The ArrayList of cones.
*/
   public ConeList(String listNameIn, ArrayList<Cone> coneListIn) {
      listName = listNameIn;
      coneList = coneListIn;
   }
   
/**
* This method returns the name of the ArrayList of Cones.
*
* @return listName - the list of the ArrayList of Cones.   
*/
   public String getName() {
      return listName;
   }

/**
* This method returns the number of Cones in the ArrayList.
*
* @return listSize - the size() of the ArrayList of cones.
*/
   public int numberOfCones() {
      int listSize = 0;
      listSize = coneList.size();
      return listSize;
   }

/**
* This method calculates the total base perimeter as a lump sum.
*
* @return sumBasePerimeter - the total base perimeter of the ArrayList
*     of Cones.
*/
   public double totalBasePerimeter() {
      int sizeOfList = 0, counter = 0;
      double sumBasePerimeter = 0;
      sizeOfList = coneList.size();
      if (sizeOfList == 0) {
         return 0;
      }
      else {
         while (counter < sizeOfList) {
            sumBasePerimeter += coneList.get(counter).basePerimeter();
            counter++;
         }
         return sumBasePerimeter;
      }
   }

/**
* This method calculates the total base area of the ArrayList of Cones.
*
* @return sumBaseArea - the total base area of the ArrayList ofCones.
*/
   public double totalBaseArea() {
      int sizeOfList = coneList.size(), counter = 0;
      double sumBaseArea = 0.0;
      if (sizeOfList == 0) {
         return sumBaseArea;
      }
      else {
         while (counter < coneList.size()) {
            sumBaseArea += coneList.get(counter).baseArea();
            counter++;
         }
         return sumBaseArea;
      }
   }

/**
* This method calculates the total slant height of the ArrayList of Cones.
*
* @return sumSlantHeight - the total slant height of the ArrayList of Cones.
*/
   public double totalSlantHeight() {
      int sizeOfList = coneList.size(), counter = 0;
      double sumSlantHeight = 0;
      if (sizeOfList == 0) {
         return sumSlantHeight;
      }
      else {
         while (counter < sizeOfList) {
            sumSlantHeight += coneList.get(counter).slantHeight();
            counter++; 
         }
         return sumSlantHeight;
      }
   
   }

/**
* This method returns the total side area of the ArrayList of Cones.
*
* @return sumSideArea - the total side area of the ArrayList of Cones.
*/
   public double totalSideArea() {
      int sizeOfList = coneList.size(), counter = 0;
      double sumSideArea = 0.0;
      if (sizeOfList == 0) {
         return sumSideArea;
      }
      else {
         while (counter < sizeOfList) {
            sumSideArea += coneList.get(counter).sideArea();
            counter++;
         }
         return sumSideArea;
      }
   }

/**
* This method returns the total surface area of the ArrayList of Cones.
*
* @return sumSurfaceArea - the total surface area of the ArrayList of Cones.
*/
   public double totalSurfaceArea() {
      int sizeOfList = coneList.size(), counter = 0;
      double sumSurfaceArea = 0;
      if (sizeOfList == 0) {
         return sumSurfaceArea;
      }
      else {
         while (counter < sizeOfList) {
            sumSurfaceArea += coneList.get(counter).surfaceArea();
            counter++;
         }
         return sumSurfaceArea;
      }
   }

/**
* This method returns the total vollume of the ArrayList of Cones.
*
* @return sumOfVolume - the total volume of the ArrayList of Cones.
*/
   public double totalVolume() {
      int sizeOfList = coneList.size(), counter = 0;
      double sumOfVolume = 0.0;
      if (sizeOfList == 0) {
         return sumOfVolume;
      }
      else {
         while (counter < sizeOfList) {
            sumOfVolume += coneList.get(counter).volume();
            counter++;
         }
         return sumOfVolume;
      }
   }
   
/**
* This method returns the average surface area of the ArrayList of Cones.
*
* @return averageSurfaceArea - the average surface area of the ArrayList of
*  Cones.
*/
   public double averageSurfaceArea() {
      int sizeOfList = coneList.size(), counter = 0;
      double averageSurfaceArea = 0.0;
      if (sizeOfList == 0) {
         return averageSurfaceArea; 
      }
      else {
         averageSurfaceArea = totalSurfaceArea() / sizeOfList;
         return averageSurfaceArea;
      }
   }

/**
* This method returns the average volume of the ArrayList of Cones.
*
* @return averageVolume - the total average volume of the ArrayList of Cones.
*/
   public double averageVolume() {
      int sizeOfList = coneList.size(), counter = 0;
      double averageVolume = 0.0;
      if (sizeOfList == 0) {
         return averageVolume;
      }
      else {
         averageVolume = totalVolume() / sizeOfList;
         return averageVolume;
      }
   }
   
/**
* This method returns the ArrayList of Cones.
*
* @return coneList - the ArrayList of Cones
*/
   public ArrayList<Cone> getList() {
      return coneList;
   }
   
/**
* This method reads a file given by the user and creates an ArrayList of Cones.
*
* @param fileNameIn - the name of the file
* @return listOfCones - the ArrayList of Cones.
* @throws IOException - don't throw excpetion if user inputs a nonexistant file
*/
   public ConeList readFile(String fileNameIn) throws IOException {
      int counter = 0;
      double height, radius;
      String fileName = "", label = "";
      ArrayList<Cone> myArrayList = new ArrayList<Cone>();
      ConeList listOfCones;
      Scanner fileScan = new Scanner(new File(fileNameIn));
      
      fileName = fileScan.nextLine(); //Read name of the file.
      
      while (fileScan.hasNext()) {
         label = fileScan.nextLine();
         height = Double.parseDouble(fileScan.nextLine());
         radius = Double.parseDouble(fileScan.nextLine());
         myArrayList.add(new Cone(label, height, radius));
      }
      listOfCones = new ConeList(fileName, myArrayList);
      return listOfCones;
   }

/**
* This method adds a Cone object to the ArrayList of Cones.
*
* @param labelIn - the name of the cone to be added
* @param heightIn - the height of the cone to be added
* @param radiusIn - the radius of the cone to be added
*/  
   public void addCone(String labelIn, double heightIn, double radiusIn) {
      Cone newCone = new Cone(labelIn, heightIn, radiusIn);
      coneList.add(newCone);
   }

/**
* This method searches for a Cone object of a given name.
*
* @param labelIn - the name of the Cone to be searched for
* @return cone - the cone if it was found in the ArrayList
*/
   public Cone findCone(String labelIn) {
      String coneLabel = "";
      for (Cone cone: coneList) {
         coneLabel = cone.getLabel();
         if (labelIn.equalsIgnoreCase(coneLabel)) {
            return cone;
         }
      }
      return null;
   }

/**
* This method deletes a cone from the ArrayList of Cones.
*
* @param labelIn - the name of the Cone to be deleted
* @return coneToDelete - the Cone object that was deleted
*/
   public Cone deleteCone(String labelIn) {
      Cone coneToDelete = new Cone("", 0, 0);
      coneToDelete = findCone(labelIn);
      if (coneToDelete == null) {
         return null;
      } else {
         coneList.remove(coneToDelete);
         return coneToDelete;
      }
   }
   
/**
* This method edits the height and radius fields of the cone object.
*
* @param labelIn - the name of the cone
* @param heightIn - the height value to be changed to
* @param radiusIn - the radius value to be changed to
* @return coneEdited - a boolean value that indicates if the cone was edited
*/
   public boolean editCone(String labelIn, double heightIn, double radiusIn) {
      String coneLabel = "";
      int coneIndex = 0;
      boolean coneEdited = false, t1 = false, t2 = false;
      for (Cone cone: coneList) {
         coneLabel = cone.getLabel();
         if (labelIn.equalsIgnoreCase(coneLabel)) {
            cone.setHeight(heightIn);
            cone.setRadius(radiusIn);
            coneEdited = true;
            return coneEdited;
         }
      }
      return coneEdited;
   } 
/**
* This method returns information about the ArrayList.
*
* @return output - the information string about the ArrayList.
*/
   public String toString() {
      int sizeOfList = coneList.size(), counter = 0;
      String output = listName + "\n";
      if (sizeOfList == 0) {
         return output;
      }
      else {
         while (counter < sizeOfList) {
            output += "\n" + coneList.get(counter).toString() + "\n";
            counter++;
         }
         return output;
      }
      
   }

/**
* This method prints out a summary table of the ArrayList.
*
* @return output - the string that is the summary of information about the
*     ArrayList.
*/   
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String header, line1, line2, line3, line4, line5, line6, line7, line8,
          line9, output;
      header = "----- Summary for " + listName + " -----";
      line1 = "Number of Cones: " + numberOfCones();
      line2 = "Total Base Perimeter: " + df.format(totalBasePerimeter()); 
      line3 = "Total Base Area: " + df.format(totalBaseArea());
      line4 = "Total Slant Height: " + df.format(totalSlantHeight());
      line5 = "Total Side Area: " + df.format(totalSideArea());
      line6 = "Total Surface Area: " + df.format(totalSurfaceArea());
      line7 = "Total Volume: " + df.format(totalVolume());
      line8 = "Average Surface Area: " + df.format(averageSurfaceArea());
      line9 = "Average Volume: " + df.format(averageVolume());
      output = header + "\n" + line1 + "\n" + line2 + "\n" + line3 + "\n"
         + line4 + "\n" + line5 + "\n" + line6 + "\n" + line7 + "\n"
         + line8 + "\n"  + line9;
      return output;
   }
}