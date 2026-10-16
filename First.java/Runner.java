//Michael Slaughter

import java.util.Scanner;
import java.util.InputMismatchException;

public class Runner {
    public static void main(String[] args){
        // instantiate a Calc object
        Calc myCalculator = new Calc();
        Scanner scan = new Scanner(System.in);

        double n1 = 0;
        double n2 = 0;

        // Loop validation for the first number
        while (true) {
            System.out.println("Please enter the first number: ");
            try {
                n1 = scan.nextDouble();
                break; // Exit loop if input is a valid double
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a valid numeric value.");
                scan.next(); // Clear the bad input from the scanner's memory
            }
        }

        // Loop validation for the second number
        while (true) {
            System.out.println("Please enter the second number: ");
            try {
                n2 = scan.nextDouble();
                break; // Exit loop if input is a valid double
            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a valid numeric value.");
                scan.next(); // Clear the bad input from the scanner's memory
            }
        }

        // pass the numbers to the Calc object
        myCalculator.setNum1(n1);
        myCalculator.setNum2(n2);

        // output from Calc instance
        System.out.println(myCalculator);

        // examining the instance private data fields by calling get methods
        System.out.println("Calling num1 get method: " + myCalculator.getNum1());
        System.out.println("Calling num2 get method: " + myCalculator.getNum2());

        // calling Calc methods directly
        double sum = myCalculator.add();
        System.out.println("The sum is: " + sum);

        System.out.println("The difference is: " + myCalculator.subtract());
        System.out.println("The product is: " + myCalculator.multiply());
        System.out.println("The quotient is: " + myCalculator.divide());

        scan.close(); // Clean up scanner resource
    }
}
