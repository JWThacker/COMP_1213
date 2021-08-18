import java.util.Comparator;

/**
* This class defines a comparator based on the campaign cost.
*
* @author Jared Thacker
* @version April 7, 2021
*/
public class CampaignCostComparator implements Comparator<MarketingCampaign> {

/**
* This is the compare method for this comparator class.
* It defines order based off the cost of the campaign.
*
* @param campaign1 - the first MarketingCampaign object.
* @param campaign2 - the second MarketingCampaign object.
* @return an integer depending on the order of the objects.
*/
   public int compare(MarketingCampaign campaign1,
                          MarketingCampaign campaign2) {
      if (campaign1.campaignCost() < campaign2.campaignCost()) {
         return -1;
      } else if (campaign1.campaignCost() > campaign2.campaignCost()) {
         return 1;
      } else { 
         return 0;
      }
                          
   }
}