/**
* This driver program tests the UserInfo class.
*
* @author Jared Thacker
* @version February 8, 2021
*/
public class UserInfoDriver {
/**
* This driver programs tests the UserInfo class.
*
* @param args - command line args not used.
*/
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}