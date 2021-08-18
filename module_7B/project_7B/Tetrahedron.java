import java.text.DecimalFormat;
/**
* This class defines a Tetrahedron class and defines various methods
* to calculate common measures on a tetrahedron class.
* 
* @author Jared Thacker
* @version March 11, 2021
*/
public class Tetrahedron implements Comparable<Tetrahedron> {
   //fields
   private String label = "";
   private double edge = 0;
   private static int count = 0;
   
/**
* This is the constructor for the Tetrahedron class.
*
* @param labelIn - the name of the Tetrahedron
* @param edgeIn - the edge that characterizes the Tetrahedron
*/
   public Tetrahedron(String labelIn, double edgeIn) { 
      setLabel(labelIn);
      setEdge(edgeIn);
      count++;
   }
   
/**
* This method is the accessor method for the label field.
*
* @return label - the label field of the Tetrahedron
*/
   public String getLabel() {
      return label;
   }
   
/**
* This method is the mutator method for the label field.
*
* @param labelIn - the label to be set
* @return true if the set is successful, otherwise return false
*/
   public boolean setLabel(String labelIn) {
      if (labelIn == null) {
         return false;
      } else {
         label = labelIn.trim();
         return true;
      }
   }

/**
* This is the accessor method for the edge field.
*
* @return edge - the edge field
*/
   public double getEdge() {
      return edge;
   }
   
/**
* This is the mutator method for the edge field.
*
* @param edgeIn - the edge to be set
* @return true if the set is successful, false otherwise
*/
   public boolean setEdge(double edgeIn) {
      if (edgeIn >= 0) {
         edge = edgeIn;
         return true;
      } else {
         return false;
      }
   }

/**
* This method calculates the height of the Tetrahedron.
*
* @return a - the height of the Tetrahedron
*/
   public double height() {
      double a = 0;
      a = Math.sqrt((double) 2 / 3) * edge;
      return a;
   }
   
/**
* This method calculate the surface area of the Tetrahedron.
*
* @return sa - the surface area of the Tetrahedron
*/
   public double surfaceArea() {
      double sa = 0;
      sa = Math.sqrt(3) * Math.pow(edge, 2);
      return sa;
   }

/**
* This method calculates the volume of the Tetrahedron.
*
* @return v - the volume of the Tetrahedron
*/
   public double volume() {
      double cubed = 0, denom = 1, v = 0;
      cubed = Math.pow(edge, 3);
      denom = 6 * Math.sqrt(2);
      v = cubed / denom;
      return v;
   }

/**
* This method return information about the Tetrahedron object.
*
* @return - the string containing information about the Tetrahedron
*/ 
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      String line1 = "", line2 = "", line3 = "", line4 = "";
      
      line1 = "Tetrahedron " + "\"" + label + "\"" + " with six edges"
         + " of length " + edge + " has:";
         
      line2  = "\theight = " + df.format(this.height()) + " units";
      
      line3  = "\tsurface area = " + df.format(this.surfaceArea())
         + " square units";
      
      line4 = "\tvolume = " + df.format(this.volume()) + " cubic units";
      return line1 + "\n" + line2 + "\n" + line3 + "\n" + line4;
   }

/**
* This method returns the class variable: count.
*
* @return count - the class variable count
*/
   public static int getCount() {
      return count;
   }

/**
* This method reset the count variable back to 0.
*/
   public static void resetCount() {
      count = 0;
   }

/**
* This method tests to see if two objects are equal.
*
* @param obj - the Tetrahedron to be tested
* @return boolean - true if the objects are identical, false otherwise
*/
   public boolean equals(Object obj) {
      if (!(obj instanceof Tetrahedron)) {
         return false;
      } else {
         Tetrahedron d = (Tetrahedron) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                                 && Math.abs(edge - d.getEdge()) < 0.000001); 
      }
   }

/**
* hashCode function associated with the class equals method.
*
* @return 0
*/
   public int hashCode() {
      return 0;
   }
   
/**
* This method makes a comparison based on the volume of the tetrahedrons.
*
* @param tetra - the Tetrahedron object for the comparison
* @return 0 if they're equal, 1 if this is greater than that, -1 if this
* is less than that
*/
   public int compareTo(Tetrahedron tetra) {
      double thisTetrahedronVolume = this.volume();
      double otherTetrahedronVolume = tetra.volume();
      
      if (Math.abs(thisTetrahedronVolume - otherTetrahedronVolume)
                                                             < 0.000001) {
         return 0;
      } else if ((thisTetrahedronVolume - otherTetrahedronVolume) < 0) {
         return -1;
      } else {
         return 1;
      }
   }
}