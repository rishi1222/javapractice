package bankaccount;

public class NotEnoughBalance extends Exception {
    public NotEnoughBalance(String message){
        super(message);
    }
}
