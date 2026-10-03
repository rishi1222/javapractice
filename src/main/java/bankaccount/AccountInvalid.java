package bankaccount;

public class AccountInvalid extends Exception {
    public AccountInvalid(String message){
        super(message);
    }
}
