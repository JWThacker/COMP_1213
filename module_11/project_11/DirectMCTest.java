import org.junit.Assert;
import org.junit.Test;

/**
* This is the test file that tests the MarketingCampaign class and
* the DirectMC class.
*/
public class DirectMCTest {

/**
* This tests the getCostPerMailPiece() method in the DirectMC class.
*/  
   @Test public void testGetCostPerMailPiece() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(3.00, dmc.getCostPerMailPiece(), 0.00001);
   }
   
/**
* This tests the setCostPerMailPiece() method in the DirectMC class.
*/
   @Test public void testSetCostPerMailPiece() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      dmc.setCostPerMailPiece(4.00);
      Assert.assertEquals(4.00, dmc.getCostPerMailPiece(), 0.0001);
   }
   
/**
* This tests the getNumberOfMailPieces() method in the DirectMC class.
*/
   @Test public void testGetNumberOfMailPieces() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(2000, dmc.getNumberOfMailPieces(), 0.0001);
   }
   
/**
* This tests the setNumberOfMailPieces() method in the DirectMC class.
*/
   @Test public void testSetNumberOfMailPieces() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      dmc.setNumberOfMailPieces(3000);
      Assert.assertEquals(3000, dmc.getNumberOfMailPieces(), 0.0001);
   }
   
/**
* This tests the campaignCost() method in the DirectMC class.
*/
   @Test public void testCampaignCost() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(7000.00, dmc.campaignCost(), 0.0001);
   }
   
/**
* This tests the toString() method in the DirectMC class.
*/
   @Test public void testToString() {
      String toStringOutput;
      toStringOutput = "Ad Mailing (class DirectMC)\n"
         + "Revenue: $10,000.00   Campaign Cost: $7,000.00   ROI: 42.86%"
         + "\n   Base Cost: $1,000.00"
         + "\n   Mail Cost: $6,000.00 = $3.00 per mail piece "
         + "* 2000 mail pieces";
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(toStringOutput, dmc.toString());
   }
   
/**
* This tests the getName() method in the MarketingCampaign class.
*/
   @Test public void testGetName() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals("Ad Mailing", dmc.getName());
   }
   
/**
* This tests the setName() method in the MarketingCampaign class.
*/
   @Test public void testSetName() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      dmc.setName("Ad Mailing 2");
      Assert.assertEquals("Ad Mailing 2", dmc.getName());
   }
   
/**
* This tests the getRevenue() method in the MarketingCamaign class.
*/
   @Test public void testGetRevenue() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(10000.00, dmc.getRevenue(), 0.0001);
   }
   
/**
* This tests the setRevenue() method in the MarketingCampaign class.
*/
   @Test public void testSetRevenue() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      dmc.setRevenue(20000.00);
      Assert.assertEquals(20000.00, dmc.getRevenue(), 0.00001);
   }
      
/**
* This tests the getCount() method in the MarketingCampaign class.
*/
   @Test public void testGetCount() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      dmc.resetCount();
      DirectMC dmc2 = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(1, dmc.getCount(), 0.0001);
   }
   
/**
* This tests the resetCount() method in the MarketingCampaign class.
*/
   @Test public void testResetCount() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      dmc.resetCount();
      Assert.assertEquals(0, dmc.getCount(), 0.0001);
   }
   
/**
* This tests the calcROI() method in the MarketingCampaign class.
*/
   @Test public void testCalcROI() {
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertEquals(0.42857142857142855, dmc.calcROI(), 0.00001);
   }
   
/**
* This tests the toString() method in the MarketingCampaign class.
*/
   @Test public void testToStringMarketingCampaign() {
      String toStringOutput = "Ad Mailing (class DirectMC)\n"
         + "Revenue: $10,000.00   Campaign Cost: $7,000.00   ROI: 42.86%";
      DirectMC dmc = new DirectMC("Ad Mailing", 10000.00, 3.00, 2000);
      Assert.assertTrue(dmc.toString().contains(toStringOutput));
   }
}
