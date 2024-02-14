package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // name needed in full to parse
       // String fullName;

        // vars
        String firstName = " ";
        String middleName = " ";
        String lastName = " ";
        String suffix = " ";


        // prompt
        System.out.println("Enter full name: ");
        String fullName = userInput.nextLine().trim();

        String[] nameParts = fullName.split(" ");


        int hasSuffix = fullName.indexOf(",");
        if(hasSuffix >= 0)
        {
            suffix = fullName.substring(hasSuffix + 2);
            fullName = fullName.substring(0, hasSuffix);
        }

        if (nameParts.length == 2) {
             firstName = nameParts[0];
             lastName = nameParts[1];
            System.out.println("First name: " + firstName);
            System.out.println("Last name: " + lastName);
        } else if (nameParts.length == 3) {
             firstName = nameParts[0];
             middleName = nameParts[1];
             lastName = nameParts[2];
            System.out.println("First name: " + firstName);
            System.out.println("Middle name: " + middleName);
            System.out.println("Last name: " + lastName);
        } else {
            System.out.println("try again");
        }
    }
    }
