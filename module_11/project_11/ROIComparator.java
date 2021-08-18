import java.util.Comparator;

/**
* This class defines a comparator based on the ROII.
*
* @author Jared Thacker
* @version April 7, 2021
*/
public class ROIComparator implements Comparator<MarketingCampaign> {
   
/**
* This is the compare method for this comparator class.
* It defines order based off the ROI of the campaign.
*
* @param campaign1 - the first MarketingCampaign object.
* @param campaign2 - the second MarketingCampaign object.
* @return an integer depending on the order of the objects.
*/
   public int compare(MarketingCampaign campaign1,
                                     MarketingCampaign campaign2) {
      if (campaign1.calcROI() < campaign2.calcROI()) {
         return 1;
      } else if (campaign1.calcROI() > campaign2.calcROI()) {
         return -1;
      } else {
         return 0;
      }
   }
}