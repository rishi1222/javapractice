package inpuhandler;

import java.io.IOException;
import java.util.Scanner;

public class UserInputHandler implements Handler {

    WordLengthHandler wordLengthHandler = new WordLengthHandler();

    public String printResult(Scanner scn) throws IOException {
        String result = "";
try {

    String command = scn.next();

    switch (command.toUpperCase()) {
        case "E":
            System.out.println("Enter a new paragraph");
            Scanner scnline = new Scanner(System.in);
            String readPara = scnline.nextLine();
            String[] splitIntoWords = readPara.split("\\.");
            result = wordLengthHandler.returnLongestWord(splitIntoWords);
            break;
        case "Q":
            System.out.println("Bye....");
            System.exit(0);
        default:
            result = "There is no such command.";
    }
}catch(Exception ex){}
 return result;

    }
}
