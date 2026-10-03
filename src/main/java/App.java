import inpuhandler.UserInputHandler;

import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        UserInputHandler userInputHandler = new UserInputHandler();

        while(true){
            System.out.println("This is a program to return word with maximum number of characters.Type: E to enter a line of Type: Q to quit");
            System.out.println(userInputHandler.printResult(scn));

        }

    }
}
