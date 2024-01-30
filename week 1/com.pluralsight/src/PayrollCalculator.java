import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // vars
        String name;
        double workHours; // set to double
        double payRate; // set to double

        // prompt logs
        System.out.println("Enter your name: ");
        name = userInput.nextLine();

        System.out.println("Enter your work hours: ");
        workHours = userInput.nextDouble();
        float workHoursFloat = (float) workHours;

        System.out.println("Enter your pay rate: ");
        payRate = userInput.nextDouble();
        float payRateFloat = (float) payRate;

        // calculation
        double grossPay = payRate * workHours;

        // result
        System.out.println("Hi " + name + ", your gross pay is " + grossPay);
    }
}
