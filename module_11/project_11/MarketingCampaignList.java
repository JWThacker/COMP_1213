import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

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
      String[] info = new String[5];
      String name, category, revenue, costPer, pieces;
      double parsedRevenue, parsedCostPer;
      int parsedPieces;
      Scanner scan = new Scanner(new File(fileNameIn));
      
      while (scan.hasNext()) {
         Scanner scanLine = new Scanner(scan.nextLine());
         scanLine.useDelimiter(",");
         while (scanLine.hasNext()) {
            try {
               Arrays.fill(info, null);
               category = scanLine.next().trim();
               info[0] = category;
               name = scanLine.next().trim();
               info[1] = name;
               revenue = scanLine.next().trim();
               info[2] = revenue;
               costPer = scanLine.next().trim();
               info[3] = costPer;
               pieces = scanLine.next().trim();
               info[4] = pieces;
               parsedRevenue = Double.parseDouble(revenue);
               parsedCostPer = Double.parseDouble(costPer);
               parsedPieces = Integer.parseInt(pieces);
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
                     IndirectMC indirectMC = new IndirectMC(name,
                                                            parsedRevenue,
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
                     try {
                        throw new InvalidCategoryException(category);
                     } catch (InvalidCategoryException e) {
                        String badLine;
                        badLine = category + "," + name + ","
                           + revenue + "," + costPer + ","
                           + pieces +  "\n" + e.toString();
                        this.addInvalidRecord(badLine);
                     } finally {
                        break;
                     }
               }
            } catch (NoSuchElementException e) {
               String badLine = "";
               badLine = info[0];
               for (int i = 1; i < info.length; i++) {
                  if (info[i] != null) {
                     badLine += "," + info[i];
                  }                }
               badLine += "\n" + e.toString()
                  + ": For missing input data";
               this.addInvalidRecord(badLine);
            } catch (NumberFormatException e) {
               String badLine = info[0];
               for (int i = 1; i < info.length; i++) {
                  if ((info[i] != null)) {
                     badLine += "," + info[i];
                  }                }
               badLine += "\n" + e.toString();
               this.addInvalidRecord(badLine);
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
   
/**
* This generates the report of invalid records.
*
* @return output - the string with the invalid records
*/
   public String generateInvalidRecordsReport() {
      String[] invalidRecsArr = this.getInvalidRecordsArray();
      String output = "----------------------\n"
         + "Invalid Records Report\n"
         + "----------------------\n\n";
      for (String element: invalidRecsArr) {
         output += element + "\n\n";
      }
      return output;
   }
}