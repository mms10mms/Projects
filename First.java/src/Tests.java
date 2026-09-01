import java.text.DecimalFormat;

//Michael Slaughter

public class Tests {
    public static void main(String[] args) {
        // My Variables
        double score1 = 88.2;
        double score2 = 78.9;
        double score3 = 97.6;

        // Calculate the average
        double average = (score1 + score2 + score3) / 3.0;


        DecimalFormat df = new DecimalFormat("0.00");

        // This part will display the 3 test scores and their average
        System.out.println("Test score 1:   " + score1);
        System.out.println("Test score 2:  " + score2);
        System.out.println("Test score 3:  " + score3);
        System.out.println("The average of 3 test scores is:  " + df.format(average));
    }
}
