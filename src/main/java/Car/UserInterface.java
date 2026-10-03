package Car;

import java.util.Scanner;

public class UserInterface implements Handler {


    public void processInput(Scanner scn) {
        String command = scn.next();
        try {
            switch (command.toUpperCase()) {
                case "C":
                    System.out.println("Enter car data in format Company Name:Model:Manufacturing Date (dd/mm/yyyy)");
                    Scanner cars = new Scanner(System.in);
                    String newCar = cars.nextLine();
                    String[] dataSet = newCar.split(":");
                    Cars car = new Cars(dataSet[0], dataSet[1], dataSet[2]);
                    System.out.println(car.toString());
                    break;
                case "T":
                    System.out.println("Enter companyName to get Total Cars By Company Name");
                    Scanner sct = new Scanner(System.in);
                    String companyName = sct.next();
                    long total = Cars.getTotalCarsByCompanyName(companyName);
                    System.out.println("The total number of cars manufactured by " + companyName + ": " + total);
//                    System.out.println("Bye....");
//                    System.exit(0);
                    break;
                case "Q":
                    System.out.println("Bye....");
                    System.exit(0);
                default:
                    System.out.println("No such command exits");

            }
        } catch (Exception ex) {
        }


    }
}
