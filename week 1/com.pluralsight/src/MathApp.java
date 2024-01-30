import java.util.Random;

public class MathApp {
        public static void main(String[] args) {
// Question 1 : create 2 vars for bob and gary salary, crate new var for highest salary,
// greatest salary print"the highest is"
 int bobSalary = 10000;
 int garySalary = 20000;
 int highestSalary = Math.max(bobSalary, garySalary);
 System.out.println("The highest salary is " + highestSalary);
 System.out.println("--------------------");
 // Question 2 : find+display smallest value
            int carPrice = 200;
            int truckPrice = 400;
            int smallestValue = Math.min(carPrice, truckPrice);
            System.out.println("The smallest value is " + smallestValue);
            System.out.println("--------------------");
// Question 3: area of circle
double circleRadius = 7.25;
double circleArea = Math.round( Math.PI * Math.pow(circleRadius, 2));
System.out.println("area of the circle is " + circleArea);
            System.out.println("--------------------");
// Question 4: square root of var after it is set to 5.0
            double variableNumber = 5.0;
            double squareRootNumber =Math.round( Math.sqrt(variableNumber));
            System.out.println("square root of the variable is " + squareRootNumber);
            System.out.println("--------------------");

// Question 5: distance between points (5,10) and (85,50)// d = (x2 - x1)^2 + (y2-y1)^2
            int x2 = 85;
            int x1 = 5;
            int y2 = 50;
            int y1 = 10;

            double distanceEntreLesDeux =Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
           System.out.println("the distance is " + Math.round(distanceEntreLesDeux));

            System.out.println("--------------------");

// Question 6: absolute(positive) value of a variable after it is set to -3.8

double negativeVariable = -3.8;
double positiveAbsolute = Math.abs(negativeVariable);
System.out.println("the absoulte value is " + positiveAbsolute);




            System.out.println("--------------------");

// Question 7: display random number between 0 and 1
// using math.-
double unechiffre = Math.random();
            System.out.println("number between 1 and 2 " + unechiffre);

            System.out.println("--------------------");
            System.out.println("other way: ");

            // using "Random class"

            Random randomno = new Random();
            double autrechiffre = randomno.nextDouble();

            System.out.println("number between 1 and 2 " + autrechiffre);


            System.out.println("--------------------");


        }
}
