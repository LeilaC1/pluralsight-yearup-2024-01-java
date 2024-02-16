package com.plurasight;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        DealershipFileManager fileManager = new DealershipFileManager();
        Dealership dealership = fileManager.getDealership();

        UserInterface userInterface = new UserInterface(dealership);
        userInterface.display();
    }
}



        // requirements
// prompt for search by and display (price, make/model, year range, color, mileage, type, all)
        // list all
        //add vehicles
        // remove vehicles
        // quit


