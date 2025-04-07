// Import JOptionPane for user input
import javax.swing.JOptionPane;

public class Exam extends Assessment {
    private int totalQuestions; // Total number of questions on the exam
    private int questionsMissed; // Number of questions missed
    private double pointsEach;   // Points per question

    // Constructor
    public Exam(String totalQuestionsInput, String questionsMissedInput) {
        try {
            // Attempt to parse input strings to integers
            this.totalQuestions = Integer.parseInt(totalQuestionsInput);
            this.questionsMissed = Integer.parseInt(questionsMissedInput);

            // Check for division by zero
            if (this.totalQuestions == 0) {
                throw new ArithmeticException("Total questions cannot be zero!");
            }

            calculateScore(); // Automatically calculates and sets the score
        } catch (NumberFormatException e) {
            // Handle invalid string input
            System.out.println("Invalid input! Please enter valid integers for questions.");
            this.totalQuestions = 1; // Assign default value
            this.questionsMissed = 0; // Assign default value
        } catch (ArithmeticException e) {
            // Handle division by zero error
            System.out.println("Error: " + e.getMessage());
            this.totalQuestions = 1; // Assign default value
        }
    }

    // Method to calculate points per question and score
    private void calculateScore() {
        pointsEach = 100.0 / totalQuestions; // Points per question
        int numericScore = (int) (100 - (questionsMissed * pointsEach));
        setScore(numericScore); // Set the score using inherited method
    }

    // Method to get points per question
    public double getPointsEach() {
        return pointsEach;
    }

    public static void main(String[] args) {
        // Example usage with JOptionPane for input
        String totalQuestionsInput = JOptionPane.showInputDialog("Enter the total number of questions:");
        String questionsMissedInput = JOptionPane.showInputDialog("Enter the number of questions missed:");

        // Create an Exam object with user input
        Exam exam = new Exam(totalQuestionsInput, questionsMissedInput);
        System.out.println("Points per question: " + exam.getPointsEach());
        System.out.println("Score: " + exam.getScore());
    }
}