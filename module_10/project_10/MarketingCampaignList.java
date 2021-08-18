import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
* This class defines MarketingCampaignList which defines a collection of
* MarketingCampaign objects and actions tobe done one them.
*
* @author Jared Thacker
* @version April 7, 2021
*/
public class MarketingCampaignList {
   //fields
   private MarketingCampaign[] campaignArr;
   private String[] invalidRecords;
   
/**
* This defines the construct for the MarketingCampaignList class.
*/
   public MarketingCampaignList() {
      campaignArr = new MarketingCampaign[0];
      invalidRecords = new String[0];
   }
   
/**
* This method returns an array of MarketingCampaign objects.
*
* @return campaignArr - an array of MarketingCampaign objects.
*/
   public MarketingCampaign[] getMarketingCampaignArray() {
      return campaignArr;
   }
   
/**
* This method returns an array of invalid records in the form of strings.
*
* @return invalidRecords - return the invalidRecords field.
*/
   public String[] getInvalidRecordsArray() {
      return invalidRecords;
   }
   
/**
* This method adds a MarketingCampaign object to the list.
*
* @param objectIn - the MarketingCampaign to add to the array.
*/
   public void addMarketingCampaign(MarketingCampaign objectIn) {
      campaignArr = Arrays.copyOf(campaignArr, campaignArr.length + 1);
      campaignArr[campaignArr.length - 1] = objectIn;
   }
   
/**
* This adds an record that is invalid to the array of invalid records.
*
* @param stringObj - the invalid record, as a string, to add to the array.
*/
   public void addInvalidRecord(String stringObj) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = stringObj;
   }

/**
* This method reads a .csv and creates a list of MarketingCampaign objects
* from the data in the .csv.
*
* @param fileNameIn - the name of the file to read and parse.
* @throws FileNotFoundException - the file could possibly not exist.
*/   
   public void readFile(String fileNameIn) throws FileNotFoundException {
      String name, category;
      double parsedRevenue, parsedCostPer;
      int parsedPieces;
      Scanner scan = new Scanner(new File(fileNameIn));
      
      while (scan.hasNext()) {
         Scanner scanLine = new Scanner(scan.nextLine());
         scanLine.useDelimiter(",");
         while (scanLine.hasNext()) {
            category = scanLine.next().trim();
            name = scanLine.next().trim();
            parsedRevenue = Double.parseDouble(scanLine.next().trim());
            parsedCostPer = Double.parseDouble(scanLine.next().trim());
            parsedPieces = Integer.parseInt(scanLine.next().trim());
            switch (category.charAt(0)) {
               case 'M':
               case 'm':
                  SocialMediaMC socialMediaMC = new SocialMediaMC(name,
                                                               parsedRevenue,
                                                               parsedCostPer,
                                                               parsedPieces);
                  this.addMarketingCampaign(socialMediaMC);
                  break;
               case 'D':
               case 'd':
                  DirectMC directMC = new DirectMC(name, parsedRevenue,
                                                   parsedCostPer,
                                                   parsedPieces);
                  this.addMarketingCampaign(directMC);
                  break;
               case 'I':
               case 'i':
                  IndirectMC indirectMC = new IndirectMC(name, parsedRevenue,
                                                         parsedCostPer,
                                                         parsedPieces);
                  this.addMarketingCampaign(indirectMC);
                  break;
               case 'S':
               case 's':
                  SearchEngineMC searchEngineMC = new SearchEngineMC(name,
                                                                  parsedRevenue,
                                                                  parsedCostPer,
                                                                  parsedPieces);
                  this.addMarketingCampaign(searchEngineMC);
                  break;
               default:
            }
         }
      }
      scan.close();
   }
   
/**
* This method generates a report, as a string, of the array of
* MarketingCampaign objects.
*
* @return output - the report in the form of a string.
*/
   public String generateReport() {
      String output = "-------------------------------\n";
      output += "Marketing Campaign Report\n";
      output += "-------------------------------\n\n";
      
      MarketingCampaign[] arr = this.getMarketingCampaignArray();
      for (MarketingCampaign element: arr) {
         output += element.toString() + "\n\n";
      }
      
      return output;
   }
   
/**
* This method generates a report, as a string, of the array of
* MarketingCampaign objects. It's sorted by name lexographically.
*
* @return output - the report in the form of a string.
*/
   public String generateReportByName() {
      String output = "-----------------------------------------\n";
      output += "Marketing Campaign Report (by Name)\n";
      output += "-----------------------------------------\n\n";
             
      Arrays.sort(this.getMarketingCampaignArray());
      
      MarketingCampaign[] arr = this.getMarketingCampaignArray();
      for (MarketingCampaign element: arr) {
         output += element.toString() + "\n\n";
      }       
      return output;
   }
   
/**
* This method generates a report, as a string, of the array of
* MarketingCampaign objects. It's sorted by ROI high to low.
*
* @return output - the report in the form of a string.
*/
   public String generateReportByROI() {
      String output = "-------------------------------------------------\n";
      output += "Marketing Campaign Report (by Highest ROI)\n";
      output += "-------------------------------------------------\n\n";
             
      Arrays.sort(this.getMarketingCampaignArray(), new ROIComparator());
      
      MarketingCampaign[] arr = this.getMarketingCampaignArray();
      for (MarketingCampaign element: arr) {
         output += element.toString() + "\n\n";
      }
      return output;
   }
   
/**
* This method generates a report, as a string, of the array of
* MarketingCampaign objects. It's sorted by CampaignCost low to high.
*
* @return output - the report in the form of a string.
*/
   public String generateReportByCampaignCost() {
      String output = "-------------------------------------------------\n";
      output += "Marketing Campaign Report (by Lowest Campaign Cost)\n";
      output += "-------------------------------------------------\n\n";
             
      Arrays.sort(this.getMarketingCampaignArray(),
                  new CampaignCostComparator());
      
      MarketingCampaign[] arr = this.getMarketingCampaignArray();
      for (MarketingCampaign element: arr) {
         output += element.toString() + "\n\n";
      }       
      return output;     
   }
}