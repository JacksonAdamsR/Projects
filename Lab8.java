import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;

public class Lab8 {
    public static void main(String[] args) {
        String inputFile = "pay.csv"; // Input file with employee data
        String outputFile = "output.csv"; // Output file for results

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            // Write the headers to the output file
            writer.write("Name,Pay Rate,Hours Worked,Weekly Pay");
            writer.newLine();

            String line;
            while ((line = reader.readLine()) != null) {
                // Skip the headers in the input file
                if (line.startsWith("Name")) continue;

                String[] data = line.split(",");
                String name = data[0];
                double payRate = Double.parseDouble(data[1]);
                double hoursWorked = Double.parseDouble(data[2]);

                // Calculate weekly pay including overtime
                double weeklyPay = calculateWeeklyPay(payRate, hoursWorked);

                // Format the output with currency symbols
                NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
                String formattedPay = currencyFormat.format(weeklyPay);

                // Write the results to the output file
                writer.write(String.format("%s,%.2f,%.2f,%s", name, payRate, hoursWorked, formattedPay));
                writer.newLine();
            }

            System.out.println("Processing completed. Results saved in " + outputFile);

        } catch (IOException | NumberFormatException e) {
            System.err.println("Error processing the file: " + e.getMessage());
        }
    }

    private static double calculateWeeklyPay(double payRate, double hoursWorked) {
        double overtimeRate = 1.5 * payRate;
        double regularHours = Math.min(hoursWorked, 40);
        double overtimeHours = Math.max(0, hoursWorked - 40);

        return (regularHours * payRate) + (overtimeHours * overtimeRate);
    }
}