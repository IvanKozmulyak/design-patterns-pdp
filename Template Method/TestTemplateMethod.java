public class TestTemplateMethod {
    public static void main(String[] args) {

        double value = 10.0;

        LogCalculator fileLogger = new FileLogCalculator("log.txt");
        fileLogger.calculateAndPresentLog(value);

        LogCalculator consoleLogger = new ConsoleLogCalculator();
        consoleLogger.calculateAndPresentLog(value);
    }
}
