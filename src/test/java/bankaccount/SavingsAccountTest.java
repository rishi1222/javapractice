package bankaccount;

import junit.framework.TestCase;
import org.junit.Test;

public class SavingsAccountTest extends TestCase {

    Handler savingsAccount = new SavingsAccount(1,200);

    @Test
    public void testDeposite() throws AccountInvalid {
        savingsAccount.deposite(10);
        assertEquals(210.20,savingsAccount.getBalance(1));

    }

    @Test
    public void testWidrawBalance() throws AccountInvalid, NotEnoughBalance {
        savingsAccount.withDraw(10);
        assertEquals(190.0,savingsAccount.getBalance(1) );
    }

}