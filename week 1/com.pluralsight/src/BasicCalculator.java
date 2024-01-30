import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

// vars
        int firstNum;
        int secondNum;
        int finalAnswer;

        // prompt logs
        System.out.println("enter the first number: ");
        // double returns decimals, int has to be used with nextInt instead of next Double and nextLine
        firstNum = userInput.nextInt();
        System.out.println("enter the second number: ");
        secondNum = userInput.nextInt();

        System.out.println("Operations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply ");
        System.out.println("(D)ivide");
        System.out.println("please select an option: ");
        // operations input, set to lowercase bc idk how to add ignorecase inhere
        String calOperation = userInput.next();
// added ignore case like in the demo
        if (calOperation.equalsIgnoreCase("a")) {
            finalAnswer = firstNum + secondNum;
        } else if (calOperation.equalsIgnoreCase("s")) {
            finalAnswer = firstNum - secondNum;
        } else if (calOperation.equalsIgnoreCase("m")) {
            finalAnswer = firstNum * secondNum;
        } else if (calOperation.equalsIgnoreCase("d")) {
            finalAnswer = firstNum / secondNum;
        } else {
            System.out.println("choose an operation");
            return;
        }
//
        System.out.println("final answer: " + finalAnswer);
    }
}