/**
* This class represents the social media campaign for a
* company.
*
* @author Jared Thacker
* @version April 2, 2021
*/
public class SocialMediaMC extends IndirectMC {

/**
* Thie constant represents the base cost for the social media campaign.
*/
   public static final double BASE_COST = 3000.00;
   
/**
* This is the constructor for the SearchEngineMC class.
*
* @param nameIn - the name of the instance of SocialMediaMC.
* @param revenueIn - the amount of revenue of the instance of socialMediaMC
* @param costPerAdIn - the cost per ad for the instance of SocialMediaMC
* @param numberOfAdsIn - the number of ads for the instance of SocialMediaMC
*/
   public SocialMediaMC(String nameIn, double revenueIn, double costPerAdIn,
      int numberOfAdsIn) 
   {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   
/**
* This returns the base cost for the social media campaign.
*
* @return BASE_COST - the base cost for the social media campaign
*/
   public double getBaseCost() {
      return BASE_COST; 
   }

}