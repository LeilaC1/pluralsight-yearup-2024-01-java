package com.plurasight;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager {
    private static final String FILE_PATH = "data/vehicles.csv";

    public Dealership getDealership() {
        Dealership dealership = null;
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        File filename = new File(FILE_PATH);

        try (Scanner scanner = new Scanner(filename)) {
            String name = scanner.nextLine();
            String address = scanner.nextLine();
            String number = scanner.nextLine();

            dealership = new Dealership(name, address, number);


            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] columns = line.split(",");


                // vin,dealer,id,year,make,model,type, color,miles,price
                int vin = Integer.parseInt(columns[0]);
                int dealer = Integer.parseInt(columns[1]);
                String make = columns[2];
                String model = columns[3];
                int year = Integer.parseInt(columns[4]);
                double price = Double.parseDouble(columns[5]);
                String color = columns[6];
                int mileage = Integer.parseInt(columns[7]);
                String type = columns[8];

                Vehicle vehicle = new Vehicle(vin, dealer, make, model, year, price, color, mileage, type);
                vehicles.add(vehicle);
            }

            dealership.setVehicles(vehicles);


            // java.io
        } catch (IOException ex) {
        }


        return dealership;
    }
    public void saveDealership(){

    }
}