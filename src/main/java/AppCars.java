import Car.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCars {

    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();

        Scanner scn = new Scanner(System.in);


        while(true){
            System.out.println("To create new car object enter: C");
            System.out.println("To get total number of cars by comapanyName: T");
            System.out.println("To Quit enter: Q");
            userInterface.processInput(scn);
        }
    }
}
