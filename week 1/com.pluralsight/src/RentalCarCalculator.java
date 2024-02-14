import java.util.Scanner;

public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

// vars

        double underageSurcharge;
        double addOnsCost = 0;





// prompts
        System.out.print("Enter pickup date: ");
        String pickupDate = userInput.nextLine();

        System.out.print("Enter number of days for the rental: ");
        int rentalDays = userInput.nextInt();

        System.out.print("Do you want an electronic toll tag? ((Y)es/(n)o): ");
        char tollTagInput = userInput.next().charAt(0);
        System.out.print("Do you want a GPS? ((Y)es/(n)o): ");
        char gpsInput = userInput.next().charAt(0);

        System.out.print("Do you want roadside assistance? ((Y)es/(n)o): ");
        char roadsideAssistanceInput = userInput.next().charAt(0);

        System.out.print("Enter your current age: ");
        int age = userInput.nextInt();

// calculate

         // basic car rental - 29.99 a day
        double basicRentalCost = 29.99 * rentalDays;

        // option cost
        if (tollTagInput == 'Y' || tollTagInput == 'y') {
            addOnsCost += 3.95 * rentalDays;
        }

        if (gpsInput == 'Y' || gpsInput == 'y') {
            addOnsCost += 2.95 * rentalDays;
        }

        if (roadsideAssistanceInput == 'Y' || roadsideAssistanceInput == 'y') {
            addOnsCost += 3.95 * rentalDays;
        }
        // underage driver surcharge - 30% under 25
        if (age < 25) {
            underageSurcharge = 0.3 * basicRentalCost;
        } else {
            underageSurcharge = 0;
        }
        // total cost
        double totalCost = basicRentalCost + addOnsCost + underageSurcharge;

        // display
        System.out.println("estimation for your rental:");
        System.out.println("basic car rental cost: $" + basicRentalCost);
        System.out.println("options cost: $" + (float)addOnsCost);
        System.out.println("underage driver surcharge: $" + underageSurcharge);
        System.out.println("Total cost: $" + totalCost);

    }
}
