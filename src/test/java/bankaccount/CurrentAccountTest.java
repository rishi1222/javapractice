package bankaccount;

import junit.framework.TestCase;
import org.junit.Test;

public class CurrentAccountTest extends TestCase {

    @Test
    public void testCheckBalance() throws AccountInvalid {

        Handler currentAccount = new CurrentAccount(1234,100);
        assertEquals(100d, currentAccount.getBalance(1234));
    }

    @Test
    public void testCheckException(){
        Handler currentAccout = new CurrentAccount(2345,1000);
        try {
            assertEquals(1000d,currentAccout.getBalance(3456));
        } catch (AccountInvalid accountInvalid) {
            assertEquals("Something went wrong",accountInvalid.getMessage());
        }
    }

    @Test
    public void testOverdraft() throws NotEnoughBalance, AccountInvalid {
        Handler currentAccount = new CurrentAccount(1234,100);
        currentAccount.withDraw(110);
        assertEquals(-10d,currentAccount.getBalance(1234));
    }

    @Test
    public void testOverdraftMax() throws NotEnoughBalance, AccountInvalid {
        Handler currentAccount = new CurrentAccount(1234,100);
        currentAccount.withDraw(200);
        assertEquals(-100d,currentAccount.getBalance(1234));
    }

    @Test
    public void testCheckExceptioNotEnoughBalance() throws AccountInvalid {
        Handler currentAccount = new CurrentAccount(1234,100);
        try {
            currentAccount.withDraw(210);
        } catch (NotEnoughBalance notEnoughBalance){
            assertEquals("Not enough balance",notEnoughBalance.getMessage());
        }

    }


}