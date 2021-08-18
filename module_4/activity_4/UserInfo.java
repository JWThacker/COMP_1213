/**
*  Program to.
*
*  Module 4: Activity 4 (Expression Solver).
*  @author Jared Thacker
*  @version February 8, 2021 
*/
public class UserInfo {
// instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   private static final int OFFLINE = 0, ONLINE = 1;
// constructor
/**
* This is the constructor the UserInfo object.
* 
* @param firstNameIn first name of the object.
* @param lastNameIn last name of the object.
*/
   public UserInfo(String firstNameIn, String lastNameIn) {
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
// methods

/**
* This method prints the fields associated with the object.
* @param: none
* @return output information about the object 
*/
   public String toString() {

      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Locations: " + location + "\n";
      output += "Age: " + age + "\n";
   
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      } else {
         output += "Online";
      }
      return output;
   }
/**
* This method sets the location field of the object.
* @param locationIn - the location of the subject.
*/
   public void setLocation(String locationIn) {
      location = locationIn;
   }
/**
* This method sets the age of the subject of the object.
* @param ageIn - the age of the object.
* @return a boolean value indicating if age has been set or not.
*/
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;
   }
/**
* This method returns the age field of the object.
* @param: arguments not used
* @return age - the age of the object.
*/
   public int getAge() {
      return age;
   }
/**
* This method returns the location of the object.
* @param: None.
* @return location - the location of the object.
*/
   public String getLocation() {
      return location;
   }
/**
* This method changes the status field of the object to OFFLINE.
* @param: None
*/
   public void logOff() {
      status = OFFLINE;
   }
/**
* This method changes the status field of the object to ONLINE.
* @param: None
*/
   public void logOn() {
      status = ONLINE;
   }
}  