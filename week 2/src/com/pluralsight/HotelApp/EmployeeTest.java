package com.pluralsight.HotelApp;

import com.pluralsight.HotelApp.Employee;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee(4,"Lala", "Lobby",20, 0);
        // call the punchIn method
        employee.punchIn(7.0);
        // call the punchOut method
        employee.punchOut(12.0);

        // test output
        System.out.println("employee should have worked 5hrs, earned 100, regular hrs 5, no over time");
        System.out.println("hours worked: " + employee.getHoursWorked());
        System.out.println("total pay: " + employee.getTotalPay());
        System.out.println("regular hours: " + employee.getRegularHours());
        System.out.println("overtime hours: " + employee.getOverTimeHours());


    }
}
