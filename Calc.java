import java.util.Scanner;

public class Calc {
    private double num1;
    private double num2;

    // Constructor
    public Calc(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter for num1
    public double getNum1() {
        return num1;
    }

    // Getter for num2
    public double getNum2() {
        return num2;
    }

    // Method for sum
    public double sum() {
        return num1 + num2;
    }

    // Method for difference
    public double difference() {
        return num1 - num2;
    }

    // Method for product
    public double product() {
        return num1 * num2;
    }

    // Method for quotient
    public double quotient() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return Double.POSITIVE_INFINITY; // Avoid division by zero
        }
    }

    // Override toString method
    @Override
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }

    // Main method for testing purposes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please enter the second number: ");
        double num2 = scanner.nextDouble();

        Calc calc = new Calc(num1, num2);

        System.out.println("Displaying private data fields using toString():");
        System.out.println(calc);

        System.out.println("Calling num1 get method: " + calc.getNum1());
        System.out.println("Calling num2 get method: " + calc.getNum2());

        System.out.println("The sum is: " + calc.sum());
        System.out.println("The difference is: " + calc.difference());
        System.out.println("The product is: " + calc.product());
        System.out.println("The quotient is: " + calc.quotient());

        scanner.close();
