import bankaccount.UserInputHandler;

import java.util.Scanner;

public class AppBank {

    public static void main(String[] args) {

        UserInputHandler bankInput = new UserInputHandler();

        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("To Intialise Enter: S or C ; To Withdraw: W ; To Deposite: D ; To Check Balance: B ; To Quit Enter: Q");
            System.out.println(bankInput.printResult(scn));
        }

    }
}
