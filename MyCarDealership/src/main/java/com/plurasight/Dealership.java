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
       // vehicles.add(vehicle);
    }

    public void removeVehicles() {
        // vehicles.remove();
    }
}
