
/**
* This class represents the search engine marketing campaign.
*
* @author Jared Thacker
* @version April 2, 2021
*/
public class SearchEngineMC extends IndirectMC {

/**
* This is a constant that represents the base cost of the indirect
* marketing campaign.
*/
   public static final double BASE_COST = 2000.00;
   
/**
* This is the constructor for the SearchEngineMC class.
*
* @param nameIn - the name of the instance of IndirectMC.
* @param revenueIn - the amount of revenue of the instance of SearchEngineMC
* @param costPerAdIn - the cost per ad for the instance of SearchEngineMC
* @param numberOfAdsIn - the number of ads for the instance of SearchEngineMC
*/
   public SearchEngineMC(String nameIn, double revenueIn, double costPerAdIn,
      int numberOfAdsIn) 
   {
      super(nameIn, revenueIn, costPerAdIn, numberOfAdsIn);
   }
   
/**
* This returns the base cost constant for this class/campaign.
*
* @return BASE_COST - the base cost of the campaign/class
*/
   public double getBaseCost() {
      return BASE_COST;
   }
}