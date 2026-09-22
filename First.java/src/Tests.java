
//Michael Slaughter

import java.util.Scanner;

public class Tests {

    private int scoreCount;
    private double testAverage;


    public Tests() {
        this.scoreCount = 0;
        this.testAverage = 0.0;
    }


    public int getScoreCount() {
        return scoreCount;
    }


    public double getTestAverage() {
        return testAverage;
    }


    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0.0;
        int count = 0;

        // Prompt user and prime the loop
        System.out.print("Enter a test score (-1 to quit): ");
        double score = scanner.nextDouble();

        // Sentinel loop accepting values until -1
        while (score != -1) {
            sum += score;
            count++;

            System.out.print("Enter a test score (-1 to quit): ");
            score = scanner.nextDouble();
        }

        // Calculate and update the instance variables
        this.scoreCount = count;
        this.testAverage = sum / count;
    }

    // Formatted string representation of the object
    @Override
    public String toString() {
        // Explicitly handle the NaN edge case to prevent potential formatting issues
        if (Double.isNaN(testAverage)) {
            return "The average of the " + scoreCount + " scores entered is NaN.";
        }
        // Format to 2 decimal places for valid numbers
        return String.format("The average of the %d scores entered is %.2f.", scoreCount, testAverage);
    }
}

