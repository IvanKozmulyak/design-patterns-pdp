public abstract class LogCalculator {

    public final void calculateAndPresentLog(double value) {
        double logarithm = calculateLog(value);
        presentLog(logarithm);
    }

    public double calculateLog(double value) {
        return Math.log(value);
    }

    public abstract void presentLog(double formattedLog);
}