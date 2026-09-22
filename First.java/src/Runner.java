//Michael Slaughter

public class Runner {
    public static void main(String[] args) {
        // Instantiate the blueprint object
        Tests examTracker = new Tests();

        // Gather user input and calculate statistics
        examTracker.getAverage();

        // Print final results using toString()
        System.out.println(examTracker.toString());
    }
}
