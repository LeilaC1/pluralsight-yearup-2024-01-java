package com.plurasight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private static final String FILE_PATH = "data/vehicles.csv";

    private String name;
    private String address;
    private String number;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.vehicles = new ArrayList<>();
    }

    public static Dealership getDealership() {
        // try using sql database later

        Dealership dealership = new Dealership("Name", "Address", "Number");
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        File filename = new File(FILE_PATH);


        try (Scanner scanner = new Scanner(filename)) {

            while (scanner.hasNext()) {
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
            // java.io
        } catch (IOException ex) {
        }

        dealership.setVehicles(vehicles);


        return dealership;
    }


    // getter and setter for vehicles
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // other methods
    // public Arraylist<Vehicle>??
    public double getVehiclesByPrice() {
        return 0;
    }

    public String getVehiclesByMakeModel() {
        return null;

    }

    public int getVehiclesByYear() {
        return 0;

    }

    public String getVehiclesByColor() {
        return null;

    }

    public int getVehiclesByMileage() {
        return 0;

    }

    public String getVehiclesByType() {
        return null;

    }

    public String getAllVehicles() {
        return null;

    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicles() {
        // vehicles.remove();
    }
}

