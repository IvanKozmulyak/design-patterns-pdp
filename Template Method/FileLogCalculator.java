import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogCalculator extends LogCalculator {

    private final String filePath;

    public FileLogCalculator(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void presentLog(double log) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(String.valueOf(log));
            System.out.println("Result saved to file: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}