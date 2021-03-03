package be.multimedi.javaee.statistics;

public class StatisticsApp {

    public static void main(String[] args) {

        double[] someTestDataAsArray = {1.1, 2.2, 3.3};

        System.out.println("Testing mean");
        System.out.println("With arguments given in an array: " + StatisticsUtility.mean(someTestDataAsArray));
        System.out.println("With arguments given separately: " + StatisticsUtility.mean(1.1, 2.2, 3.3));

        System.out.println("Testing min");
        System.out.println("With arguments given in an array: " + StatisticsUtility.min(someTestDataAsArray));
        System.out.println("With arguments given separately: " + StatisticsUtility.min(1.1, 2.2, 3.3));

        System.out.println("Testing max");
        System.out.println("With arguments given in an array: " + StatisticsUtility.max(someTestDataAsArray));
        System.out.println("With arguments given separately: " + StatisticsUtility.max(1.1, 2.2, 3.3));

    }


}
