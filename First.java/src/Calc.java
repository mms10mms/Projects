
//Michael Slaughter


public class Calc {
    // Fields
    private double num1;
    private double num2;

    // Constructor
    public Calc() {
        this.num1 = 0.0;
        this.num2 = 0.0;
    }

    // Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Getters
    public double getNum1() {
        return this.num1;
    }

    public double getNum2() {
        return this.num2;
    }

    // Math methods
    public double add() {
        return this.num1 + this.num2;
    }

    public double subtract() {
        return this.num1 - this.num2;
    }

    public double multiply() {
        return this.num1 * this.num2;
    }

    public double divide() {
        return this.num1 / this.num2;
    }

    // Print method
    @Override
    public String toString() {
        return "Displaying private data fields using toString():\n" +
                "Num1: " + this.num1 + "\n" +
                "Num2: " + this.num2;
    }
}
