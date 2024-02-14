package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // prompts - first middle last name
        System.out.println("Enter your first name: ");
        String firstName = userInput.nextLine();
        System.out.println("Enter your middle name: ");
        String middleName = userInput.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = userInput.nextLine();
        System.out.println("Enter your suffix: ");
        String suffix = userInput.nextLine();
// full name
        String fullNameM = firstName + " " + middleName + " " + lastName;
        String fullNameSuf = firstName + " " + middleName+ " " + lastName + " " + suffix;
        String fullName = firstName + " " + lastName;


        if (!middleName.isEmpty()) {
            System.out.println(fullNameM);
        } else if (!suffix.isEmpty()) {
            System.out.println(fullNameSuf);
        } else {
            System.out.println(fullName);
        }
} }
