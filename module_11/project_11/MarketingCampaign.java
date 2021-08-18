import java.text.DecimalFormat;

/**
* This is the abstract class for the marketing campaign.
*
* @author Jared Thacker
* @version March 30, 2021
*/
public abstract class MarketingCampaign implements
                                        Comparable<MarketingCampaign> {
   //fields
   protected String name;
   protected double revenue;
   protected static int count = 0;
   
/**
* This is the constructor for the MarketingCampaign abstract class.
*
* @param nameIn - the name of the campaign
* @param revenueIn - the amount of revenue of hte campaign
*/
   public MarketingCampaign(String nameIn, double revenueIn) {
      name = nameIn;
      revenue = revenueIn;
      count++;
   }
   
/**
* This returns the name of the campaign.
*
* @return name - the name of the campaign
*/
   public String getName() {
      return name;
   }
   
/**
* This sets the name of the campaign.
*
* @param nameIn - the name of the campaign
*/
   public void setName(String nameIn) {
      name = nameIn;
   }
   
/**
* This returns the revenue from the campaign.
*
* @return revenue - the revenue from the campaign
*/
   public double getRevenue() {
      return revenue;
   }
   
/**
* This sets the revenue of the campaign.
*
* @param revenueIn - the revenue of the marketing campaign
*/
   public void setRevenue(double revenueIn) {
      revenue = revenueIn;
   }
   
/**
* The returns the count of the campaign.
*
* @return count - the number of campaigns by the company
*/
   public static int getCount() {
      return count;
   }
   
/**
* This resets the count of the number of campaigns by the company.
*/
   public static void resetCount() {
      count = 0;
   }
   
/**
* This calculates the ROI from the campaign.
*
* @return roi - the ROI from the campaign
*/
   public double calcROI() {
      double roi = 0;
      
      roi = (revenue - campaignCost()) / campaignCost();
      return roi;
   }
   
/**
* This is the toString() method for the MarketingCampaign class.
*
* @return output - the string containing the information of the class
*/
   public String toString() {
      DecimalFormat dollars = new DecimalFormat("$#,##0.00");
      DecimalFormat percents = new DecimalFormat("0.##%");
      String line1, line2, output;
      line1 = name + " ("  + this.getClass() + ")";
      line2 = "Revenue: " + dollars.format(this.getRevenue()) + "   "
         + "Campaign Cost: " + dollars.format(this.campaignCost())
         + "   " + "ROI: " + percents.format(this.calcROI());
      
      output = line1 + "\n" + line2;
      return output;
   }
   
/**
* This is the abstract method for the campaignCost() method.
*
* @return the campaignCost of the campaign
*/
   public abstract double campaignCost();
   
/**
* This method defines the natural ordering of the MarketingCampaign class.
*
* @param objectIn - The MarketingCampaign object to be compared.
* @return the integer representing the order of the two objects.
*/
   public int compareTo(MarketingCampaign objectIn) {
      if (objectIn == this) {
         return 0;
      } else {
         return name.compareToIgnoreCase(objectIn.getName());
      }
   }
}