package com.pluralsight.HotelApp;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedRooms;

    // constructor 1
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedRooms = 0;
    }

    // constructor 2
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedRooms = bookedRooms;
    }

    // method
    public boolean bookRoom(int numberOfRooms, boolean isSuite) {
        if (isSuite) {
            if (numberOfRooms <= getAvailableSuites()) {
                bookedSuites += numberOfRooms;
                return true;
            }
        } else {
            if (numberOfRooms <= getAvailableRooms()) {
                bookedRooms += numberOfRooms;
                return true;
            }
        }
        return false;
    }

    //  getters
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    // Derived getter for available rooms
    public int getAvailableRooms() {
        return numberOfRooms - bookedRooms;
    }
}
