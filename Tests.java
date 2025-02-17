import java.util.Scanner;

public class Tests {
    private double sumScores;
    private int countScores;
    private double average;

    // Constructor
    public Tests() {
        this.sumScores = 0.0;
        this.countScores = 0;
        this.average = 0.0;
    }

    // Method to get average, return type void
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double score;
        System.out.println("Enter test scores (enter -1 to quit): ");
        
        score = scanner.nextDouble();
        while (score != -1) {
            sumScores += score;
            countScores++;
            System.out.println("Enter test scores (enter -1 to quit): ");
            score = scanner.nextDouble();
        }
        
        if (countScores > 0) {
            average = sumScores / countScores;
        } else {
            average = Double.NaN;
        }
    }

    @Override
    public String toString() {
        if (countScores == 0) {
            return "The average of the " + countScores + " scores entered is NaN.";
        } else {
            return String.format("The average of the %d scores entered is %.2f.", countScores, average);
        }
    }

    public int getCountScores() {
        return countScores;
    }

    public double getSumScores() {
        return sumScores;
    }
}


