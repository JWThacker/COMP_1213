import java.text.DecimalFormat;
/**
* This class represents the direct marketing campaign for a company.
*
* @author Jared Thacker
* @version April 2, 2021
*/
public class DirectMC extends MarketingCampaign {
   //fields
   private double costPerMailPiece;
   private int numberOfMailPieces;
   
/**
* This constant represents the base cost for the direct marketing campaign.
*/
   public static final double BASE_COST = 1000.0;
   
/**
* This is the constructor for the DirectMC class.
*
* @param nameIn - the name of the campaign.
* @param revenueIn - the revenunue of the campaign.
* @param costPerMailPieceIn - the cost per mail of the campaign.
* @param numberOfMailPiecesIn - the number of pieces of mail for the campaign.
*/
   public DirectMC(String nameIn, double revenueIn, double costPerMailPieceIn,
      int numberOfMailPiecesIn) {
      super(nameIn, revenueIn);
      
      costPerMailPiece = costPerMailPieceIn;
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
/**
* This method returns the cost per mail piece for the DirectMC class. 
*
* @return costPerMailPiece - the cost per mail piece for the campaign.
*/
   public double getCostPerMailPiece() {
      return costPerMailPiece;
   }
   
/**
* This method sets the cost per maiil in the directMC class.
*
* @param costPerMailPieceIn - the cost per mail piece in this campaign.
*/
   public void setCostPerMailPiece(double costPerMailPieceIn) {
      costPerMailPiece = costPerMailPieceIn;
   }
   
/**
* This returns the number of mail pieces for this campaign.
*
* @return numberOfMailPieces - the number of mail pieces for this campaign.
*/
   public int getNumberOfMailPieces() {
      return numberOfMailPieces;
   }
   
/**
* This sets the number of mail pieces for the DirectMC class.
*
* @param numberOfMailPiecesIn - the number of mail pieces for the campaign.
*/
   public void setNumberOfMailPieces(int numberOfMailPiecesIn) {
      numberOfMailPieces = numberOfMailPiecesIn;
   }
   
/**
* This method calculates the campaign cost for the DirectMC class.
*
* @return output - the campaign cost.
*/ 
   public double campaignCost() {
      double output = 0;
      output = this.BASE_COST + (costPerMailPiece * numberOfMailPieces);
      
      return output;
   }
   
/**
* This is a private method that calculates the mail cost for DirectMC class.
*
* @return outupt - the mail cost for the DirectMC class
*/
   private double mailCost() {
      double output = 0;
      output = costPerMailPiece * numberOfMailPieces;
      return output;
   }
   
/**
* This method returns a string the contains information about the instance of
* the DirectMC object.
*
* @return output - the string containing the information.
*/
   public String toString() {
      DecimalFormat dollars = new DecimalFormat("$#,##0.00");
      String line3, line4, output;
      
      line3 = "Base Cost: " + dollars.format(this.BASE_COST);
      line4 = "Mail Cost: " + dollars.format(this.mailCost())
         + " = " + dollars.format(costPerMailPiece) + " per mail piece * "
         + numberOfMailPieces + " mail pieces";
         
      output = super.toString() + "\n   " + line3 + "\n   " + line4;
      return output;
   }
}