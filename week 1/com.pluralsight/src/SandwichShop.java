import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

// vars
        // reg - 5.45
        // large - base 8.95

        String sandwich;
        int age;
        double discount = 0;
        double priceOfSandwich;
        double totalPrice;

// prompts
        System.out.println("Sandwiches");
        System.out.println("(R)egular - $5.45");
        System.out.println("(L)arge  - $8.95 ");
        System.out.println("Please choose a type of cookie: ");
        sandwich = userInput.nextLine();
        System.out.println();

        System.out.println("How old are you? ");
        age = userInput.nextInt();

        if (sandwich.equalsIgnoreCase("R"))
        {
            priceOfSandwich = 5.45;
        } else {
            priceOfSandwich = 8.95;
        }

        if (age <= 17){
            discount = 0.10;
        } else if (age >= 65){
            discount = 0.20;
        } else {
            discount = 0;
        }

        //calculations
        totalPrice = priceOfSandwich;
        totalPrice -= totalPrice * discount;

        System.out.println("total of sandwich: " + totalPrice);

    }
}
