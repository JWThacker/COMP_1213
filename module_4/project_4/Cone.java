import java.text.DecimalFormat;
/**
* This is the Cone class that stores information about the cone
* and performs several calculations associated with a cone.
* 
* @author: Jared Thacker
* @version: February 11, 2021
*/
public class Cone {
   //Fields
   private String label = "";
   private double height;
   private double radius;
  
  //Constructor
/**
* This is a constructor for the Cone  class.
*
* @param labelIn - the label for the cone.
* @param heightIn - the height of the cone.
* @param radiusIn - the radius of the cone.  
*/
   public Cone(String labelIn, double heightIn, double radiusIn) {
      setLabel(labelIn);
      setHeight(heightIn);
      setRadius(radiusIn);
   }
  
  //methods 
/**
* Mutator method that sets the label of the Cone object.
*
* @param labelIn - the label of the Cone object.
* @return isSet - boolean indicating whehter the field has been set or not.
*/
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
         return isSet;
      } else {
         return isSet;
      }
   }
  
/**
* Accessor method that retrieves the label of the Cone object.
*
* @return label return the label field.
*/
   public String getLabel() {
      return label;
   }

/**
* Mutator method that sets the height of the Cone object.
*
* @param heightIn - the height of the Cone object.
*        isSet boolean indicating whehter the field has been set or not.
* @return isSet boolean indicating whether the field has been set or not.
*/
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn > 0) {
         height = heightIn;
         isSet = true;
         return isSet;
      } else {
         return isSet;
      }
   }
  
  
/**
* Accessor method that retrives the height field of the Cone object.
*
* @return height the height field.
*/
   public double getHeight() {
      return height;
   }
  
/**
* Mutator method that sets the radius of the cone object.
*
* @param radiusIn - the radius of the Cone object.
* @return isSet - boolean indicating whether the field has been set or not.
*/
   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn > 0) {
         radius = radiusIn;
         isSet = true;
         return isSet;
      } else {
         return isSet;
      }
   }
  
/**
* Accessor method that retrives the radius field of the Cone object.
*
* @return radius - the radius field.
*/
   public double getRadius() {
      return radius;
   }

/**
* Service method that calculates the base perimeter of a cone.
* 
* @return p - the base perimeter of the cone.
*/
   public double basePerimeter() {
      double pi = Math.PI;
      double p = 2 * pi * radius;
      return p;
   }

/**
* Service method that calculates the base area of a cone.
* 
* @return b - the base area of the cone.
*/
   public double baseArea() {
      double pi = Math.PI;
      double b = pi * Math.pow(radius, 2);
      return b;
   }

/**
* Service method that calculates the slant height of a cone.
*
* @return s - the slant height of the cone.
*/
   public double slantHeight() {
      double beneathRadical = Math.pow(radius, 2) + Math.pow(height, 2);
      double s = Math.sqrt(beneathRadical);
      return s;
   }

/**
* Service method that calculates the side area of a cone.
*
* @return sideS - the slant area of the cone.
*/
   public double sideArea() {
      double pi = Math.PI;
      double sideS = pi * radius * slantHeight();
      return sideS;
   }
/**
* Service method that calculates the surface area of a cone.
*
* @return t the surface area of the cone.
*/
   public double surfaceArea() {
      double pi = Math.PI;
      double t = pi * radius * (radius + slantHeight());
      return t;
   }

/**
* Service method that calculates the volume of a cone.
*
* @return v the volume of the cone.
*/
   public double volume() {
      double pi = Math.PI;
      double rSquared = Math.pow(radius, 2);
      double v = pi * rSquared * height / 3;
      return v;
   }

/**
* Service method that prints information about the Cone object.
*
* @return output the message containing the information about the Cone object.
*/
   public String toString() {
      DecimalFormat coneFormat = new DecimalFormat("#,##0.0##");
      String lineOne;
      String lineTwo;
      String lineThree;
      String lineFour;
      String output;
    
      lineOne = '\"' + label + '\"' + " is a cone with height = " + height 
         + " units" + " and radius = " + radius + " units,";
    
      lineTwo = "which has base " + "perimeter = " 
         + coneFormat.format(basePerimeter()) + " units, "
         + "base area = " + coneFormat.format(baseArea()) + " square units,";

      lineThree = "slant height = " + coneFormat.format(slantHeight()) 
         +  " units, " + "side area = "
         + coneFormat.format(sideArea()) + " square units,";
      
      lineFour = "surface area = " + coneFormat.format(surfaceArea())
         + " square units, and volume = " + coneFormat.format(volume())
         + " cubic units.";
      output = lineOne + "\n" + lineTwo + "\n" + lineThree + '\n' + lineFour;
     
      return output;
   }
  
}