package org.wcci;

import java.util.Scanner;

public class FortuneTellerApp {

    public static void main(String[] args) {
     //Part 1
        //Ask for first namefdxgchjb
        System.out.println("What is your first name?");
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();

        //Ask for last name
        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        //Ask for age
        System.out.println("How old are you? (as an integer)");
        int age = input.nextInt();

        //Ask for birth month
        System.out.println("What is your birth month? (as an integer)");
        int birthMonth = input.nextInt();

        input.nextLine();
        //Favorite ROYGBIV color
        System.out.println("What is your favorite ROYGBIV color? Type help for color list.");
        String faveColor = input.nextLine();
        if(faveColor.equalsIgnoreCase("help")){
            System.out.println("Use Red, Orange, Yellow, Green, Blue, Indigo or Violet.");
        System.out.println("What is your favorite ROYGBIV color?");
        faveColor = input.nextLine();
        }

        //Number of siblings
        System.out.println("How many siblings do you have?");
        int numberSiblings = input.nextInt();

    //Part 2
        //Determine years until retirement
        int yearsToRetirement = 0;
        if(age % 2 == 0){yearsToRetirement = 24;}
            else {yearsToRetirement = 17;}

        //Vacation home location
        String vacationLocation = "";
        if(numberSiblings == 0){vacationLocation = "Boca Raton";}
            else if(numberSiblings == 1) {vacationLocation = "Nassau";}
            else if(numberSiblings == 2) {vacationLocation = "Ponta Negra";}
            else if(numberSiblings == 3) {vacationLocation = "Portland";}
            else if(numberSiblings > 3) {vacationLocation = "Baton Rouge";}
            else {vacationLocation = "Chernobyl";}

        //Mode of transportation
        String modeTransportation = "";
        switch(faveColor.toUpperCase()){
            case "RED" : modeTransportation ="Maserati"; break;
            case "ORANGE": modeTransportation = "Dodge Viper ACR"; break;
            case "YELLOW": modeTransportation = "Chevy Camaro"; break;
            case "GREEN": modeTransportation = "Nissan GTR"; break;
            case "BLUE": modeTransportation = "Lotus Elise"; break;
            case "INDIGO": modeTransportation = "Kawasaki Ninja"; break;
            case "VIOLET": modeTransportation = "Acura NSX"; break;
            default: modeTransportation = "Beetle, the worst car in the world";}


        //Bank Balance
        double bankBalance = 0.0;
        if(birthMonth >= 1 && birthMonth <=4)
            {bankBalance = 5000000.27;}
        else if(birthMonth>=5 && birthMonth <=8)
            {bankBalance = 250000.25;}
        else if(birthMonth >=9 && birthMonth <=12)
            {bankBalance = 2000000000.69;}
        else {bankBalance = -54000.32;}
        System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetirement + " years \n"
                + "with " + bankBalance + " in the bank, a vacation home in " + vacationLocation + "\nand travel by " + modeTransportation);
        }
}
