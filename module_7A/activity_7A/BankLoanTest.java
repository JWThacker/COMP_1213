import org.junit.Assert;
//import static org.junit.Assert.*;
//import org.junit.Before;
import org.junit.Test;

/**
* This is a JUnit testing class.
* 
* @author Jared Thacker
* @version March 8, 2021
*/
public class BankLoanTest {


/**
* This is a test method that tests the chargeInterest() method.
*/
   @Test public void chargeInterestTest() {
      BankLoan loan1 = new BankLoan("Jane", 0.10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), 0.000001);
   }

}
