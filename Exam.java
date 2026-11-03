//Michael Slaughter


public class Exam extends Assessment {
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    // Constructor: calculates individual question value and total score
    public Exam(int questions, int missed) {
        this.numQuestions = questions;
        this.numMissed = missed;

        // Calculate points per question based on a 100-point total scale
        this.pointsEach = 100.0 / questions;

        // Calculate total earned points
        double numericScore = (questions - missed) * this.pointsEach;

        // Save the final grade in the parent Assessment class
        setScore((int) numericScore);
    }

    // Returns point value of a single question
    public double getPointsEach() {
        return this.pointsEach;
    }

    // Returns total questions on the exam
    public int getNumQuestions() {
        return this.numQuestions;
    }

    // Returns number of missed questions
    public int getNumMissed() {
        return this.numMissed;
    }
}


