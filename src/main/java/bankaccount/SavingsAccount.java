package bankaccount;

import javax.security.auth.login.AccountException;

public class SavingsAccount implements Handler {
    int accountNo;
    double balance;

    SavingsAccount(int accountNo,double balance){
        this.accountNo=accountNo;
        this.balance=balance;
    }

    @Override
    public void withDraw(double money) throws NotEnoughBalance {
        if(this.balance > money){
            this.balance = this.balance - money;
        }else
        {
            throw new NotEnoughBalance("There is no enough money in the account");
        }
    }

    @Override
    public void deposite(double money) {
        this.balance= this.balance+money + (0.02*money);
    }

    @Override
    public double getBalance(int accountNo) throws AccountInvalid {
        if(this.accountNo==accountNo){
            return this.balance;
        }else{
            throw new AccountInvalid("Something went wrong");
        }
    }

}
