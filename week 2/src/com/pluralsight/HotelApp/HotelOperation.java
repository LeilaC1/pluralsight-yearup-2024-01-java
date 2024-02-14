package com.pluralsight.HotelApp;

public class HotelOperation
    {
        public static void main(String[] args)
        {
            /************************
             EXERCISE 1
             *************************/

            /* ROOM TESTS */
            // create a room that is clean and unoccupied
            Room testRoom = new Room(1, 140, false, false);            testRoom.isDirty();

            // verify that it IS available

            System.out.println("testing - clean (room available): ");
            System.out.println("is room available: " + testRoom.isAvailable());


            // create a room that is dirty and occupied
            //     public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty)
            Room testRoom2 = new Room(1, 140, true, true);            testRoom.isDirty();

            // verify that it IS NOT available
            System.out.println("testing -  dirty room (not available): ");
            System.out.println("is room available: " + testRoom2.isAvailable());


            System.out.println("---------------------------------------------------");

            /* RESERVATION TESTS */
            // create a reservation for a King room for 2 weekday nights
            //     public Reservation(String roomType, int numberOfNights, boolean isWeekend)
            Reservation reservationRoom = new Reservation("king", 2,false);
            double pricePerNight;
            double getReservationTotal;
            // verify that the price per night is $139
            double testPrice = 139.0;
            if (reservationRoom.getPrice() == testPrice) {
                System.out.println("passed the test");
            } else {
                System.out.println("did NOT passed the test");
            }
            // verify that the total reservation cost is $278
            double testPrice2 = 278.0;

            if (reservationRoom.getReservationTotal() == testPrice2) {
                System.out.println("passed the second test");
            } else {
                System.out.println("did NOT passed the second test");
            }



            // create a reservation for a double room for 2 weekend nights
            //     public Reservation(String roomType, int numberOfNights, boolean isWeekend)
            Reservation reservationRoom2 = new Reservation("double", 2, true);

            // verify that the price per night is $136.40
            double testPrice3 = 136.40;
            if (reservationRoom.getPrice() == testPrice3) {
                System.out.println("passed the third test");
            } else {
                System.out.println("did NOT passed the third test");
            }
            // verify that the total reservation cost is $272.80
            double testPrice4 = 272.80;

            if (reservationRoom.getReservationTotal() == testPrice4) {
                System.out.println("passed the last test");
            } else {
                System.out.println("did NOT passed the last test");
            }

System.out.println("---------------------------------------------------");

            /* EMPLOYEE TESTS */
            // create an employee that worked 30 hour and has a rate of $20
            //        public Employee(int employeeId, String name, String department, double payRate, double hoursWorked)
            Employee employee1 = new Employee(1, "Kate", "Housekeeping", 20.0, 30);


            // verify that the total pay is $600, regular hours is 30
            // and overtime hours is 0

            double employeeTestPay = 600.0;
            if (employee1.getTotalPay() == employeeTestPay) {
                System.out.println("passed the employee test");
            } else {
                System.out.println("did NOT passed the employee test");
            }

            // create an employee that worked 60 hour and has a rate of $20
            Employee tiredEmployee = new Employee(2, "Lay", "Kitchen", 20.0, 60);

            // verify that the total pay is $1400, regular hours is 40
            double employeeTestPay2 = 1400.0;
            if (tiredEmployee.getTotalPay() == employeeTestPay2) {
                System.out.println("passed the employee2 test");
            } else {
                System.out.println("did NOT passed the employee2 test");
            }
            // and overtime hours is 20
            int tiredEmployeeOvertime = 20;
            if (tiredEmployee.getOverTimeHours() == tiredEmployeeOvertime) {
                System.out.println("passed the employee2 overtime test");
            } else {
                System.out.println("passed the employee2 overtime test");
            }
            System.out.println("--------------------------");


            /************************
             EXERCISE 2
             *************************/
            System.out.println(" EXERCISE 2 ");
            System.out.println("--------------------------");

            /* ROOM TESTS */
            // create a room that is clean and unoccupied
            Room testRoom3 = new Room(2, 200.0, false, false);
            // call the check in method
            testRoom3.checkIn();
            // verify that the room
            System.out.println("room should be dirty, checked in, not available,");

            //  - IS dirty
            System.out.println("is dirty: " + testRoom3.isDirty());

            //  - IS checked in
            System.out.println("is occupied:  " + testRoom3.isOccupied());

            //  - IS NOT available
            System.out.println("is available: " + testRoom3.isAvailable());

            System.out.println("--------------------------");


            // call the checkout method
            testRoom3.checkOut();
            // verify that the room
            System.out.println("room should be dirty, not checked in, not available,");

            //  - IS dirty
            System.out.println("is dirty: " + testRoom3.isDirty());

            //  - IS NOT checked in
            System.out.println("is occupied:  " + testRoom3.isOccupied());

            //  - IS NOT available
            System.out.println("is available: " + testRoom3.isAvailable());

            System.out.println("--------------------------");


            // call the clean room method
            testRoom3.cleanRoom();
            // verify that the room
            System.out.println("room should be clean, not checked in, available,");

            //  - IS clean
            System.out.println("is dirty: " + testRoom3.isDirty());

            //  - IS NOT checked in
            System.out.println("is occupied:  " + testRoom3.isOccupied());

            //  - IS available
            System.out.println("is available: " + testRoom3.isAvailable());



            System.out.println("--------------------------");


            /* EMPLOYEE TESTS */
            // create an employee that worked 0 hour and has a rate of $20
            Employee newEmployee = new Employee(3,"Nini", "Front Desk",20, 0);
            // call the punchIn method (10.0)
            newEmployee.punchIn(10.0);
            // call the punchOut method (12.0)
            newEmployee.punchOut(12.0);
            // verify the following
            System.out.println("employee should have worked 2hrs, earned 40, regular hrs 2, no over time");

            // - hours worked = 2
            System.out.println("hours worked: " + newEmployee.getHoursWorked());

            // - total pay = $40
            System.out.println("total pay: " + newEmployee.getTotalPay());

            // - regular hours = 2
            System.out.println("regular hours: " + newEmployee.getRegularHours());

            // - overtime hours = 0
            System.out.println("overtime hours: " + newEmployee.getOverTimeHours());


            System.out.println("--------------------------");


        }
    }

