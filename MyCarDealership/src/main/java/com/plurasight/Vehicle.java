package com.plurasight;

public class Vehicle {
    private int vin;
    private int dealerId;
    private int year;
    private String make;
    private String model;
    private String type;
    private String color;
    private int miles;
    private double price;

    public Vehicle(int vin, int dealerId, int year, String make, String model, String type, String color, int miles, double price) {
        this.vin = vin;
        this.dealerId = dealerId;
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.miles = miles;
        this.price = price;
    }
// 10112,1,1993,Ford,Explorer,SUV,Red,525123,995
    @Override
    public String toString() {
        return " VIN: " + vin + ", year: " + year + ", make/model: " + make + "/" + model + ", type: " + type + ", color: " + color
                + ", miles: " + miles + ", price: $" + price;
    }

    public int getVin() {
        return vin;
    }
    public int getDealer() {
        return dealerId;
    }
    public int getYear() {
        return year;
    }public String getMake() {
        return make;
    }public String getModel() {
        return model;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public int getMiles() {
        return miles;
    }
    public double getPrice() {
        return price;
    }

}