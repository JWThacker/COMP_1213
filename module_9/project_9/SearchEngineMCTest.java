import org.junit.Assert;
import org.junit.Test;

/**
* This is the test class for the SearchEngineMC class.
*
* @author Jared Thacker
* @version April 2, 2021
*/
public class SearchEngineMCTest {

/**
* This tests the getBaseCost() method in the SearchEngineMC class.
*
*/
   @Test public void testGetBaseCost() {
      SearchEngineMC mc2 = new SearchEngineMC("Web Ads 2", 27500.00,
         2.50, 5000);
      Assert.assertEquals(2000.00, mc2.getBaseCost(), 0.0001);
   }
}
