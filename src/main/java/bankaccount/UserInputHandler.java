package bankaccount;

import java.util.Scanner;

public class UserInputHandler {

    Handler account;
    double result =0;
    public double printResult(Scanner scn)  {
        try {
            String command = scn.next();
            switch (command.toUpperCase()) {
                case "S":
                    intialise("savings");
                    break;
                case "C":
                    intialise("current");
                    break;
                case "W":
                    System.out.println("Enter the amount of money you want to withdraw");
                    Scanner withdraw = new Scanner(System.in);
                    String withdrawAmt = withdraw.next();
                    account.withDraw(Double.parseDouble(withdrawAmt));
                    break;
                case "D":
                    System.out.println("Enter the amount of money you want to deposite");
                    Scanner deposite = new Scanner(System.in);
                    String depositeAmt = deposite.next();
                    account.deposite(Double.parseDouble(depositeAmt));
                    break;
                case "B":
                    System.out.println("Enter Account Number To Check Balance");
                    Scanner accountNO = new Scanner(System.in);
                    String accountNoVal = accountNO.next();
                    result = account.getBalance(Integer.parseInt(accountNoVal));
                    break;

                case "Q":
                    System.out.println("Bye...");
                    System.exit(0);

                default:
                    System.out.println("There is no such command");

            }
        } catch (AccountInvalid acc) {
            System.out.println(acc.getMessage());
            result=0;
        }catch (NotEnoughBalance no){
            System.out.println(no.getMessage());
    }
        return result;
    }

    private void intialise(String accountType) {
        Scanner sc = new Scanner(System.in);
        String initialise;
        String[] splitValue;
        if (accountType.equals("savings")) {
            System.out.println("Initialise the Savings Account Enter AccountNo:Balance ");
            initialise = sc.nextLine();
            splitValue = initialise.split(":");
            account = new SavingsAccount(Integer.parseInt(splitValue[0]), Double.parseDouble(splitValue[1]));
        } else if (accountType.equals("current")) {
            System.out.println("Initialise the Current Account Enter AccountNo:OverDraft:Balance ");
            initialise = sc.nextLine();
            splitValue = initialise.split(":");
            //account = new CurrentAccount(Integer.parseInt(splitValue[0]), Double.parseDouble(splitValue[1]), Double.parseDouble(splitValue[2]));
        }
    }
}
