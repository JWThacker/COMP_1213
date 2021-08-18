import java.text.DecimalFormat;
/**
* This class provides similar functionality that ArrayList gives.
*
* @author Jared Thacker
* @version March 25, 2021
*/
public class TetrahedronList {
   //fields
   private String listName;
   private Tetrahedron[] tList;
   private int count;
   
/**
* This is the constructor for the class.
*
* @param listNameIn - the name of the list
* @param tListIn - the array of the Tetrahedrons
* @param numberOfTetrahedronsIn - the initial number of Tetrahedrons in
*                                 the list
*/
   public TetrahedronList(String listNameIn, Tetrahedron[] tListIn,
      int numberOfTetrahedronsIn) {
      listName = listNameIn;
      tList = tListIn;
      count = numberOfTetrahedronsIn;
   }
   
/**
* This method let's the use access the listName field.
*
* @return listName - the name of the list
*/
   public String getName() {
      return listName;
   }
   
/**
* This method returns the number of Tetrahedrons in the list.
*
* @return numElements - the number of Tetrahedrons in the list
*/
   public int numberOfTetrahedrons() {
      int numElements = 0;
      for (Tetrahedron tetrahedron: tList) {
         if (tetrahedron != null) {
            numElements++;
         }
      }
      return numElements;
   }

/**
* This method calculates and returns the total surface area of the list.
*
* @return sum - the total surface area of the list
*/
   public double totalSurfaceArea() {
      double sum = 0;
      
      if (this.numberOfTetrahedrons() != 0) {
         for (Tetrahedron tetrahedron: tList) {
            if (tetrahedron != null) {
               sum += tetrahedron.surfaceArea();
            }
         }
         return sum;
      }
      return sum;
   } 
   
/**
* This method returns the average surface area of the list.
*
* @return avg - the average surface area of the list
*/
   public double averageSurfaceArea() {
      double avg = 0;
      if (this.numberOfTetrahedrons() > 0) {
         avg = this.totalSurfaceArea() / this.numberOfTetrahedrons();
      }
      return avg;
   }
   
/**
* This method returns the average volume of the list.
*
* @return avg - the average volume of the list
*/
   public double averageVolume() {
      double avg = 0;
      if (this.numberOfTetrahedrons() > 0) {
         avg = this.totalVolume() / this.numberOfTetrahedrons();
      }
      return avg;
   }
   
/**
* This method returns the total volume of the list.
*
* @return sum - the total volume of the list
*/
   public double totalVolume() {
      double sum = 0;
      
      if (this.numberOfTetrahedrons() != 0) {
         for (Tetrahedron tetrahedron: tList) {
            if (tetrahedron != null) {
               sum += tetrahedron.volume();
            }
         }
      }
      return sum;
   }
   
/**
* This method returns a string that contains info about the list.
*
* @return output - the string to be returned
*/
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String output;
      String line1 = "----- Summary for " + listName  + " -----";
      String line2 = "Number of Tetrahedrons: " + this.numberOfTetrahedrons();
      String line3 = "Total Surface Area: "
         + df.format(this.totalSurfaceArea()) + " square units";
      String line4 = "Total Volume: "
         + df.format(this.totalVolume()) + " cubic units";
      String line5 = "Average Surface Area: "
         + df.format(this.averageSurfaceArea()) + " square units";
      String line6 = "Average Volume: "
         + df.format(this.averageVolume()) + " cubic units";
      String newLine = "\n";
      
      output = line1 + newLine + line2 + newLine + line3 + newLine + line4
         + newLine + line5 + newLine + line6;
      return output;
   }
   
/**
* This method returns the array of Tetrahedrons.
*
* @return tList - the array of Tetrahedrons
*/
   public Tetrahedron[] getList() {
      return tList;
   }
   
/**
* This method finds and returns the requested Tetrahedron in the list.
*
* @param labelIn - the label of the Tetrahedron to be found
* @return tetrahedron - the Tetrahedron if it's found, null if it's not
*/
   public Tetrahedron findTetrahedron(String labelIn) {
      
      for (Tetrahedron tetrahedron: tList) {
         if (tetrahedron != null) {
            if (tetrahedron.getLabel().equalsIgnoreCase(labelIn)) {
               return tetrahedron;
            }
         }
      }
      return null;
   }
   
/**
* This method adds a Tetrahedron to the list.
*
* @param labelIn - the label of the Tetrahedron to be added
* @param edgeIn - the edge of the Tetrahedron to be added
*/
   public void addTetrahedron(String labelIn, double edgeIn) {
      if (tList.length == this.numberOfTetrahedrons()) {
         Tetrahedron[] temp = new Tetrahedron[tList.length + 1];
      
         for (int i = 0; i < this.numberOfTetrahedrons(); i++) {
            temp[i] = tList[i];
         }
         tList = temp;
      }
      tList[count] = new Tetrahedron(labelIn, edgeIn);
      count++;    
   }
   
/**
* This method deletes a Tetrahedron from the list.
*
* @param labelIn - the label of the Tetrahedron to be deleted
* @return tempTetra - the Tetrahedron if it was deleted, null if it wasn't
*/
   public Tetrahedron deleteTetrahedron(String labelIn) {
      Tetrahedron tempTetra;
      for (int i = 0; i < this.numberOfTetrahedrons(); i++) {
         if (tList[i].getLabel().equalsIgnoreCase(labelIn)) {
            tempTetra = tList[i];
            for (int j = i; j < this.numberOfTetrahedrons() - 1; j++) {
               tList[j] = tList[j + 1];
            }
            tList[count - 1] = null;
            count--;
            return tempTetra;
         }
      }
      return null;
   }
   
/**
* This method edits the edge of a Tetrahedron in the list.
*
* @param labelIn - the name of the Tetrahedron to be edited
* @param edgeIn - the replacement value for the edge field in Tetrahedron
* @return true if the Tetrahedron was edited, false if not
*/
   public boolean editTetrahedron(String labelIn, double edgeIn) {
      for (Tetrahedron tetrahedron: tList) {
         if (labelIn.equalsIgnoreCase(tetrahedron.getLabel())) {
            tetrahedron.setEdge(edgeIn);
            return true;
         }
      }
      return false;  
   }
   
/**
* This method finds and returns the Tetrahedron with the largest volume.
*
* @return - the Tetrahedron with the largest volume
*/
   public Tetrahedron findTetrahedronWithLargestVolume() {
      double tempVolume, largestVolume;
      String largestVolumeLabel = "";
      Tetrahedron largestVolumeTetrahedron = null;
      if (this.numberOfTetrahedrons() > 0) {
         largestVolumeLabel = tList[0].getLabel();
         largestVolume = tList[0].volume();
      
      
         for (int i = 1; i < count; i++) {
            tempVolume = tList[i].volume();
            if (largestVolume < tempVolume) {
               largestVolumeLabel = tList[i].getLabel();
               largestVolume = tempVolume;
            }
         }
         largestVolumeTetrahedron = this.findTetrahedron(largestVolumeLabel);
         return largestVolumeTetrahedron;
      }
      return largestVolumeTetrahedron;
      
   }
   
}