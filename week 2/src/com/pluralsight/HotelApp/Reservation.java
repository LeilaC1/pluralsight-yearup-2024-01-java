package com.pluralsight.HotelApp;

public class Reservation {
 //   getRoomType(), setRoomType(String roomType), getPrice(), getNumberOfNights(),
    //   setNumberOfNights(int numberOfNights), isWeekend()
   // setIsWeekend(boolean isWeekend), getReservationTotal()
 private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
// prices
        if (roomType.equals("king")) {
            this.pricePerNight = 139.0;
        } else if (roomType.equals("double")) {
            this.pricePerNight = 124.0;
        }
        if (isWeekend) {
            this.pricePerNight *= 1.10;
        }
    }
    // getters and setters

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    // total cost
    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }
}
