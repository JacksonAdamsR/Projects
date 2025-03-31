/**
 * Exam class extends the Assessment class.
 */
public class Exam extends Assessment {
    private int totalQuestions; // Total number of questions on the exam
    private int questionsMissed; // Number of questions missed
    private double pointsEach;   // Points per question

    // Constructor
    public Exam(int totalQuestions, int questionsMissed) {
        this.totalQuestions = totalQuestions;
        this.questionsMissed = questionsMissed;
        calculateScore(); // Automatically calculates and sets the score
    }

    // Method to calculate points per question and score
    private void calculateScore() {
        pointsEach = 100.0 / totalQuestions; // Points for each question
        int numericScore = (int) (100 - (questionsMissed * pointsEach));
        setScore(numericScore); // Set the score using the inherited method
    }

    // Method to get points per question
    public double getPointsEach() {
        return pointsEach;
    }
}