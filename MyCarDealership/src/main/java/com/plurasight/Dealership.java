package com.plurasight;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private static final String FILE_PATH = "data/inventory.csv";

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


    // getter and setter for vehicles
    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    // other methods
    // public Arraylist<Vehicle>??
    public ArrayList<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {
        ArrayList<Vehicle> vehiclesInRange = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            double price = vehicle.getPrice();
            if (price >= minPrice && price <= maxPrice) {
                vehiclesInRange.add(vehicle);
            }
        }

        return vehiclesInRange;
    }

    public String getVehiclesByMakeModel(String make, String model) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)) {
                matchingVehicles.add(vehicle);
            }
        }

        StringBuilder matchingVehicle = new StringBuilder();
        for (Vehicle vehicle : matchingVehicles) {
            matchingVehicle.append(vehicle.toString()).append(" ");
        }

        return matchingVehicle.toString();
    }

    public ArrayList<Vehicle> getVehiclesByYear(int year) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear() == year) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByColor(String color) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getColor().equalsIgnoreCase(color)) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehiclesByMileage(int maxMileage) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        // Iterate through the vehicles to find matches
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMiles() <= maxMileage) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }


    public ArrayList<Vehicle> getVehiclesByType(String type) {
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equalsIgnoreCase(type)) {
                matchingVehicles.add(vehicle);
            }
        }

        return matchingVehicles;
    }


    public String getAllVehicles() {
        return null;

    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicles() {
      //   vehicles.remove();
    }
}
