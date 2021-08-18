import java.text.DecimalFormat;

/**
* This class represents an indirect marketing campaign.
*
* @author Jared Thacker
* @version April 2, 2021
*/
public class IndirectMC extends MarketingCampaign {
  //fields
   protected double costPerAd;
   protected int numberOfAds;
  
/**
* This is class constant that represents the base cost of an
* indirect marketing campaign.
*
* @author Jared Thacker
* @version April 1, 2021
*/
   public static final double BASE_COST = 1500.0;
  
/**
* This is the constructor for the IndirectMC class.
*
* @param nameIn - the name of the instance of IndirectMC.
* @param revenueIn - the amount of revenue of the instance of IndirectMC
* @param costPerAdIn - the cost per ad for the instance of IndirectMC
* @param numberOfAdsIn - the number of ads for the instance of IndirectMC
*/ 
   public IndirectMC(String nameIn, double revenueIn, double costPerAdIn,
      int numberOfAdsIn)
   {
      super(nameIn, revenueIn);
      costPerAd = costPerAdIn;
      numberOfAds = numberOfAdsIn;
   }
   
/**
* This returns the cost per ad.
*
* @return costPerAd - the cost per ad for the instance of IndirectMC
*/
   public double getCostPerAd() {
      return costPerAd;
   }
   
/**
* This sets the cost per ad for the IndirectMC class.
*
* @param costPerAdIn - the cost per ad for the instance
*/
   public void setCostPerAd(double costPerAdIn) {
      costPerAd = costPerAdIn;
   }
   
/**
* This returns the number of ads for the campaign.
*
* @return numberOfAds - the number of ads field
*/
   public int getNumberOfAds() {
      return numberOfAds;
   }
   
/**
* This sets the number of ads fields for the class.
*
* @param numberOfAdsIn - the number of ads for the campaign
*/
   public void setNumberOfAds(int numberOfAdsIn) {
      numberOfAds = numberOfAdsIn;
   }
   
/**
* This returns the BASE_COST for the class.
*
* @return BASE_COST - the base cost of the campaign
*/
   public double getBaseCost() {
      return BASE_COST;
   }
   
/**
* This returns the ad cost for the class.
*
* @return output - ad cost for the campaign
*/
   private double getAdCost() {
      double output;
      output = costPerAd * numberOfAds;
      return output;
   }
   
/**
* This returns the campaign cost for the campaign.
*
* @return output - the campaign cost
*/
   public double campaignCost() {
      double output;
      output = this.getBaseCost() + (costPerAd * numberOfAds);
      return output;
   }
   
/**
* This returns a string filled with information about the instance
* of the IndirectMC class.
*
* @return output - the string with attributes about the instance
*/
   public String toString() {
      DecimalFormat dollars = new DecimalFormat("$#,##0.00");
      String line3, line4, output;
      
      line3 = "Base Cost: " + dollars.format(this.getBaseCost());
      line4 = "Ad Cost: " + dollars.format(this.getAdCost()) + " = "
         + dollars.format(costPerAd) + " per ad" + " * " + numberOfAds
         + " ads";
      
      output = super.toString() + "\n   " + line3 + "\n   " + line4;
      return output;
   }
}