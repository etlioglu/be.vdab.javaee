package be.multimedi.javaee.statistics;

public class StatisticsUtility {

    // mean
    public static double mean(double... values) {

        double sum = 0;
        for (double el: values) {
            sum += el;
        }
        double mean = sum / values.length;

        return mean;

    }

    //min
    public static double min(double... values) {

        double min = values[0];
        for (double el: values) {
            min = (el < min) ? el : min;
        }
        return min;
    }

    //max
    public static double max(double... values) {

        double max = values[0];
        for (double el: values) {
            max = (el > max) ? el : max;
        }
        return max;
    }

}
