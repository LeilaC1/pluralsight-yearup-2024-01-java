package com.pluralsight.CellPhoneService;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);



        CellPhone phone = new CellPhone();
       CellPhone brothersPhone = new CellPhone();
       // CellPhone brothersPhone;
        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;


        System.out.print("What is the serial number? ");
        serialNumber = userInput.nextInt();
        userInput.nextLine();
        System.out.print("What model is the phone? ");
        model = userInput.nextLine();
        System.out.print("Who is the carrier? ");
        carrier = userInput.nextLine();
        System.out.print("What is the phone number? ");
        phoneNumber = userInput.nextLine();
        System.out.print("Who is the owner of the phone? ");
        owner = userInput.nextLine();


        phone.setSerialNumber(serialNumber);
        phone.setModel(model);
        phone.setCarrier(carrier);
        phone.setPhoneNumber(phoneNumber);
        phone.setOwner(owner);

        // otherphone

       // brothersPhone = new CellPhone(132723, "Iphone 8", "TMobile", "347-874-5434","Widanley"); - error

        brothersPhone.setSerialNumber(132723);
       brothersPhone.setModel("Iphone 8");
        brothersPhone.setCarrier("TMobile");
        brothersPhone.setPhoneNumber("347-874-5434");
        brothersPhone.setOwner("Widanley");

        display(phone);
        display(brothersPhone);

        System.out.println();
        phone.dial(brothersPhone.getPhoneNumber());
        brothersPhone.dial(phone);

    }
    public static void display(CellPhone phone)
    {
        System.out.println();
        System.out.println("Call");
        System.out.println("-----------------");
        System.out.println(phone.getOwner());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getSerialNumber());
    }
}
