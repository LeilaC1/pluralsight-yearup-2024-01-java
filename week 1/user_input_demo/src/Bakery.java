import  java.util.Scanner;

public class Bakery

    {
        public static void main(String[] args){
            Scanner userInput = new Scanner(System.in);

            String name;
            String type;
            double prricePerDozen;
            double totalPrice;
            int quantity;
            double discount = 0;

            System.out.println("Cookies");
            System.out.println("(S)ugar - $5.99 / dz");
            System.out.println("(C)hocolate chip - $7.99 / dz");
            System.out.println("Please choose a type of cookie: ");
type = userInput.nextLine();
            System.out.println();

            System.out.println("Hw many dozen do you want?");
quantity = Integer.parseInt(userInput.nextLine());

            System.out.println("What name can I put this order under");
            name = userInput.nextLine();



            System.out.println(type);
            System.out.println(quantity);

            if (type.equalsIgnoreCase("s"))
            {
                prricePerDozen = 5.99;
            } else {
                prricePerDozen = 7.99;
            }

            if(quantity >= 5)
            {
                discount = .1;
            }

            totalPrice = prricePerDozen * quantity;
            totalPrice -= totalPrice * discount;

            System.out.println("Order from " + name);
            System.out.println("Order total: " + totalPrice);

        }

}
