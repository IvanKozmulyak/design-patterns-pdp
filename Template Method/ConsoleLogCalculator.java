public class ConsoleLogCalculator extends LogCalculator {

    @Override
    public void presentLog(double logValue) {
        System.out.println("Log (base 10): " + logValue);
    }
}