package com.plurasight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

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


    // public List<Vehicle>??
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
    public void addVehicle() {
       // vehicles.add();
    }

    public void removeVehicles() {
        // vehicles.remove();
    }
}

