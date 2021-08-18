import java.io.FileNotFoundException;

/**
* This is a driver class for the MarketingCampaignList class.
*
* @author Jared Thacker
* @version April 7, 2021
*/
public class MarketingCampaignPart3 {

/**
* This is a test driver class for the MarketingCampaign class.
*
* @param args - the name of the .csv file to be read.
* @throws FileNotFoundException - the file could possibly not be found.
*/
   public static void main(String[] args) throws FileNotFoundException {
      try {
         if (args.length == 0) {
            System.out.println("File name expected as command line argument.");
            System.out.println("Program ending.");
         } else {
            String fileName = args[0];
            MarketingCampaignList myList = new MarketingCampaignList();
            myList.readFile(fileName);
            System.out.print(myList.generateReport());
            System.out.print(myList.generateReportByName());
            System.out.print(myList.generateReportByCampaignCost());
            System.out.print(myList.generateReportByROI());
            System.out.print(myList.generateInvalidRecordsReport());
         }
      } catch (FileNotFoundException e) {
         String fileName = args[0];
         System.out.println("*** Attempted to read file: " + e.getMessage());
      }
   }
}