package bankaccount;

public interface Handler {

    public void withDraw(double money) throws NotEnoughBalance;

    public void deposite(double money);

    public double getBalance(int accountNo) throws AccountInvalid;



}
