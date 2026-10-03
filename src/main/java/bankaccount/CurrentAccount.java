package bankaccount;

public class CurrentAccount implements Handler {

    final double overdraftLimit = -100;
    int accountNo;
    double balance;

    public CurrentAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    @Override
    public void withDraw(double money) throws NotEnoughBalance {
        if (this.balance >= money) {
            this.balance = this.balance - money;
        } else if (this.balance <= money && money <= (this.balance - this.overdraftLimit)) {
            this.balance = this.balance - money;
        } else if (this.balance < money && (this.balance - this.overdraftLimit < money)) {
            throw new NotEnoughBalance("Not enough balance");
        }

    }

    @Override
    public void deposite(double money) {
        this.balance = this.balance + money;

    }

    @Override
    public double getBalance(int accountNo) throws AccountInvalid {
        if (this.accountNo == accountNo) {
            return this.balance;
        } else {
            throw new AccountInvalid("Something went wrong");
        }
    }

}
