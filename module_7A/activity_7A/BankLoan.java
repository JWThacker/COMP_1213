/**
* This defines the BankLoan class.
*
* @author Jared Thacker
* @version March 8, 2021
*/
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;
   private static int loansCreated = 0;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;

/**
* This defines the constructor for the BankLoan class.
*
* @param customerNameIn - the name of the customer
* @param interestRateIn - the interest rate for the loan
*/
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
* This method returns true if the loan was made.
*
* @param amount - a field; the amount requested for the loan
* @return wasLoanMade - a boolean indicating if the loan was made or not
*/
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
* This method pays the bank.
*
* @param amountPaid - the amount paid to the bank.
* @return the amount to pay to the bank.
*/
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }
   
/**
* This method returns the balance of the customer.
*
* @return balance - the balance on the customer's account.
*/
   public double getBalance() {
      return balance;
   }
   
/**
* This method returns true if a legitimate interest rate is passed in.
*
* @param interestRateIn - the interest rate in question.
* @return return true if the interest rate was legitimate.
*/
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }
   
/**
* This method return the interest rate field.
*
* @return interestRate - the interest field.
*/
   public double getInterestRate() {
      return interestRate;
   }

/**
* This method alters the balance field by charging interest.
*/
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }
   
/**
* This method return true if the amount is valid.
*
* @param amount - this method return true if amount is greater than 0.
* @return true if the amount is greater than 0.
*/
   public static boolean isAmountValid(double amount) {
      return amount >= 0;
   }
   
/**
* This method returns true if the customer is in debt.
*
* @param loan - the loan amount associated with the customer.
* @return true if the customer is in debt.
*/
   public static boolean isInDebt(BankLoan loan) {
      return loan.getBalance() > 0;      
   }
   
/**
* This method return the static variable loansCreated.
*
* @return loansCreated - the number of loans  created.
*/
   public static int getLoansCreated() {
      return loansCreated;
   }
   
/**
* This method resests the number of loans created.
*/
   public static void resetLoansCreated() {
      loansCreated = 0;
   }

/**
* This method returns a string that consists of information about the loan.
* 
* @return output - the string that contains the information.
*/
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

}
