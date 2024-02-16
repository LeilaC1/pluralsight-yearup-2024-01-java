package com.plurasight;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DealershipFileManager {
    private static final String FILE_PATH = "data/inventory.csv";
    private Dealership dealership;

    public Dealership getDealership() {
        Dealership dealership = null;
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        File filename = new File(FILE_PATH);

        try (Scanner scanner = new Scanner(filename)) {
            if (scanner.hasNextLine()) {
                String dealerInformation = scanner.nextLine();
                String[] dealerData = dealerInformation.split(",");

                // 0 - id, 1 - name, 2 - address, 3 - city, 4 - state, 5 - zipcode, 6 - phone number

                String name = dealerData[1];
                String address = dealerData[2];
                String number = dealerData[6];

                dealership = new Dealership(name, address, number);
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] columns = line.split(",");

                // vin,dealer,id,year,make,model,type, color,miles,price
                int vin = Integer.parseInt(columns[0]);
                int dealerID = Integer.parseInt(columns[1]);
                int year = Integer.parseInt(columns[2]);
                String make = columns[3];
                String model = columns[4];
                String type = columns[5];
                String color = columns[6];
                int miles = Integer.parseInt(columns[7]);
                double price = Double.parseDouble(columns[8]);


                Vehicle vehicle = new Vehicle(vin, dealerID, year,  make,  model, type,  color,  miles,  price);
                vehicles.add(vehicle);
            }

            dealership.setVehicles(vehicles);

        } catch (IOException ex) {
        }

        return dealership;
    }

    public void saveDealership() {

    }
}