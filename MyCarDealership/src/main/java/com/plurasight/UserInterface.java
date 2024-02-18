package com.plurasight;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    Scanner scanner = new Scanner(System.in);

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    private void init() {
        DealershipFileManager fileManager = new DealershipFileManager();
        this.dealership = fileManager.getDealership();
    }

    public void display() {
        init();
        // loop/switch
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Quiting...");
                    return;
                default:
                    System.out.println("Try again please!");
            }
        }
    }

    // menu
    private void displayMenu() {
        System.out.println("----- // Menu // -----");
        System.out.println("--------------------------");
        System.out.println("1. Get vehicles by price");
        System.out.println("2. Get vehicles by make and model");
        System.out.println("3. Get vehicles by year");
        System.out.println("4. Get vehicles by color");
        System.out.println("5. Get vehicles by mileage");
        System.out.println("6. Get vehicles by type");
        System.out.println("7. Get all vehicles");
        System.out.println("8. Add a vehicle");
        System.out.println("9. Remove a vehicle");
        System.out.println("0. Quit");
        System.out.print("Please enter your preferred search method: ");
    }

    // display vehicles

    private void displayVehicles(ArrayList<Vehicle> vehicles) {
        System.out.println("----- // Vehicles // -----");
        System.out.println("--------------------------");
// loop through array
        for (int i = 0; i < vehicles.size(); i++) {
            System.out.println("Vehicle " + (i + 1) + ":");
            System.out.println(vehicles.get(i));
        }
    }


    public void processGetByPriceRequest() {
            Scanner scanner = new Scanner(System.in);

//prompt
            System.out.println("Enter the minimum price: ");
            double minPrice = scanner.nextDouble();

            System.out.println("Enter the maximum price: ");
            double maxPrice = scanner.nextDouble();

            ArrayList<Vehicle> vehiclesInRange = dealership.getVehiclesByPrice(minPrice, maxPrice);

            // display the vehicles
            if (vehiclesInRange.isEmpty()) {
                System.out.println("No vehicles found.");
            } else {
                System.out.println("Vehicles within the specified price range: ");
                for (Vehicle vehicle : vehiclesInRange) {
                    System.out.println(vehicle);
                }
            }
        }

    public void processGetByMakeModelRequest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the make of the vehicle: ");
        String make = scanner.nextLine();

        System.out.println("Enter the model of the vehicle: ");
        String model = scanner.nextLine();

        String result = dealership.getVehiclesByMakeModel(make, model);

        System.out.println(result);
    }

    public void processGetByYearRequest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the vehicles year:");
        int year = scanner.nextInt();

        ArrayList<Vehicle> vehiclesForYear = dealership.getVehiclesByYear(year);

        if (vehiclesForYear.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            System.out.println("Vehicles for the specified year: ");
            for (Vehicle vehicle : vehiclesForYear) {
                System.out.println(vehicle);
            }
        }
    }

    public void processGetByColorRequest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color: ");
        String color = scanner.nextLine();
        ArrayList<Vehicle> vehiclesForColor = dealership.getVehiclesByColor(color);

        if (vehiclesForColor.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            System.out.println("Vehicles for the specified color: ");
            for (Vehicle vehicle : vehiclesForColor) {
                System.out.println(vehicle);
            }
        }
    }

    public void processGetByMileageRequest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the maximum mileage: ");
        int maxMileage = scanner.nextInt();

        ArrayList<Vehicle> vehiclesByMileage = dealership.getVehiclesByMileage(maxMileage);

        if (vehiclesByMileage.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            System.out.println("Vehicles within the specified mileage: ");
            for (Vehicle vehicle : vehiclesByMileage) {
                System.out.println(vehicle);
            }
        }
    }

    public void processGetByVehicleTypeRequest() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a vehicle type (SUV, Truck, Hybrid, Sedan, Electric, Hatchback): ");
        String type = scanner.nextLine();
        ArrayList<Vehicle> vehiclesByType = dealership.getVehiclesByType(type);

        if (vehiclesByType.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            System.out.println("Vehicles of the specified type: ");
            for (Vehicle vehicle : vehiclesByType) {
                System.out.println(vehicle);
            }
        }
    }

    public void processGetAllVehiclesRequest() {
        ArrayList<Vehicle> all = dealership.getVehicles();
        displayVehicles(all);
    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicleRequest() {

    }

}
