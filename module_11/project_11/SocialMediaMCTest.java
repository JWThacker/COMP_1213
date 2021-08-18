import org.junit.Assert;
import org.junit.Test;

/**
* This class tests the SocialMediaMC class.
*
* @author Jared Thacker
* @version April 2, 2021
*/
public class SocialMediaMCTest {

/**
* This tests the getBaseCost() method in the SocialMediaMC class.
*/
   @Test public void testGetBaseCost() {
      SocialMediaMC mc3 = new SocialMediaMC("Web Ads 3", 35000.00, 3.00, 8000);
      Assert.assertEquals(3000.00, mc3.getBaseCost(), 0.0001);
   }
}
