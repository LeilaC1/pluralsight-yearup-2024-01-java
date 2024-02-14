package com.pluralsight.HotelApp;

import com.pluralsight.HotelApp.Room;

public class RoomTest {
    public static void main(String[] args){
        // room should be occupied and dirty
Room room = new Room(1,50, false, false);
// room status
        System.out.println("Room Status");
        System.out.println("is dirty: " + room.isDirty());
        System.out.println("is occupied:  " + room.isOccupied());
        System.out.println("is available: " + room.isAvailable());
        System.out.println("--------------------------");


// check in
room.checkIn();
// room status
        System.out.println("Room Status after checking in");
        System.out.println("is dirty: " + room.isDirty());
        System.out.println("is occupied:  " + room.isOccupied());
        System.out.println("is available: " + room.isAvailable());
        System.out.println("--------------------------");
// check out
        room.checkOut();
        // room status
        System.out.println("Room Status after checking out");
        System.out.println("is dirty: " + room.isDirty());
        System.out.println("is occupied:  " + room.isOccupied());
        System.out.println("is available: " + room.isAvailable());
        System.out.println("--------------------------");
// clean room
        room.cleanRoom();
        // room status
        System.out.println("Room Status after cleaning room");
        System.out.println("is dirty: " + room.isDirty());
        System.out.println("is occupied:  " + room.isOccupied());
        System.out.println("is available: " + room.isAvailable());
        System.out.println("--------------------------");

    }

}
