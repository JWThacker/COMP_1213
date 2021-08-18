import java.text.DecimalFormat; //imports
import java.util.Scanner;
import java.util.Random;
/**
* A program to print various information associated with a fictional
* ticket to mars. Information incudes price, cost, seat # discount etc.
* 
* @author Jared Thacker
* @version February 4, 2021
*/
public class MarsTicket {
/**
* A program to print the various information associated with a ticket to mars.
* @param args Commannd line arguments - not used.
*/
   public static void main(String[] args) {
      //Declare instances of the Scanner class and Random class.
      Scanner userInput = new Scanner(System.in);
      Random generator = new Random();
      
      //Declare and intialize all strings that will be used in this program.
      String input = "", modifiedInput = "", ticket = "", date = "", day = "",
             month = "", year = "", hour = "", minutes = "", time = "",
             seat = "";
             
      //Declare and initialize the numerical variables.
      double price = 0.0, discount = 0.0, cost = 0.0;
      int index = 0, prize = 0;
      
      //Instantiate all formats used in this program.
      DecimalFormat priceFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat discountFormat = new DecimalFormat("0%");
      DecimalFormat prizeFormat = new DecimalFormat("000000");
      
      //Prompt the user for their ticket code and receive their input.
      System.out.print("Enter ticket code: ");
      
      input = userInput.nextLine();
      modifiedInput = input.trim();
      
      /* If the ticket length is less than 27 characters long, otherwise
       * print an error message.
      */
      if (modifiedInput.length() < 27) {
      
         //Print error message
         System.out.println("");
         System.out.println("*** Invalid Ticket Code ***");
         System.out.print("Ticket code must have at least 27 characters.");
      } else {
         System.out.println("");
         
         //Parse price and discount.
         price = Double.parseDouble(modifiedInput.substring(0, 7));
         discount = Double.parseDouble(modifiedInput.substring(9, 11)) / 100;
      
         //Print ticket description.
         ticket = modifiedInput.substring(26);
         System.out.print("Ticket: " + ticket + "   ");

         //Parse and print the properly formatted date.
         date = modifiedInput.substring(15, 23);  
         month = date.substring(0, 2);
         day = date.substring(2, 4);
         year = date.substring(4, 8);
         System.out.print("Date: " + month + '/' + day + '/' + year + "   ");

         //Parse and print the properly formatted time.
         time = modifiedInput.substring(11, 15);
         hour = time.substring(0, 2);
         minutes = time.substring(2, 4);
         System.out.println("Time: " + hour + ':' + minutes + "   ");

         //Print the seat #.
         seat = modifiedInput.substring(23, 26);
         System.out.print("Seat: " + seat + "   ");

         //Print the price and discount information.
         System.out.print("Price: " + priceFormat.format(price) + "   ");
         System.out.print("Discount: " + discountFormat.format(discount)
                         + "   ");
         //Calculate and print the cost information
         cost = price * (1 - discount);
         System.out.println("Cost: " + priceFormat.format(cost));
         
         //Generate and print the prize number.
         prize = (int) 9.99999e+5;
         prize = generator.nextInt(prize) + 1;
         System.out.println("Prize Number: " + prizeFormat.format(prize));
      }
   }

}