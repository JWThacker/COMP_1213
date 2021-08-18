import org.junit.Assert;
import org.junit.Test;

/**
* This class tests the IndirectMC class.
* @author Jared Thacker
* @version April 1, 2021
*/
public class IndirectMCTest {

/**
* This test the getCostPerAd() method in the Indirectmc class.
*/
   @Test public void testGetCostPerAd() {
      IndirectMC imc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(2.00, imc.getCostPerAd(), 0.0001);
   }
   
/**
* This test the setCostperAd() method in IndirectMC class.
*/
   @Test public void testSetCostPerAd() {
      IndirectMC imc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      imc.setCostPerAd(3.00);
      Assert.assertEquals(3.00, imc.getCostPerAd(), 0.0001);
   }
   
/**
* This tests the getNumberOfAds() method in the IndirectMC class.
*/
   @Test public void testGetNumberOfAds() {
      IndirectMC imc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(3500, imc.getNumberOfAds(), 0.0001);
   }
   
/**
* This tests the setNumberOfAds() method in the IndirectMC class.
*/
   @Test public void testSetNumberOfAds() {
      IndirectMC imc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      imc.setNumberOfAds(4000);
      Assert.assertEquals(4000, imc.getNumberOfAds(), 0.0001);
   }
   
/**
* This tests the getBaseCost() method in the IndirectMC class.
*/
   @Test public void testGetBaseCost() {
      IndirectMC imc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(1500.00, imc.BASE_COST, 0.0001);
   }
   
/**
* This tests the campaignCost() method in the IndirectMC class.
*/
   @Test public void testCampaignCost() {
      IndirectMC imc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      Assert.assertEquals(8500.00, imc.campaignCost(), 0.0001);
   }
   
/**
* This tests the toString() method in te IndirectMC class.
*/
   @Test public void testToString() {
      IndirectMC imc = new IndirectMC("Web Ads 1", 15000.00, 2.0, 3500);
      String toStringOutput = "Web Ads 1 (class IndirectMC)\n"
         + "Revenue: $15,000.00   Campaign Cost: $8,500.00   ROI: 76.47%\n"
         + "   Base Cost: $1,500.00\n"
         + "   Ad Cost: $7,000.00 = $2.00 per ad * 3500 ads";
         
      Assert.assertEquals(toStringOutput, imc.toString());
   }
}
