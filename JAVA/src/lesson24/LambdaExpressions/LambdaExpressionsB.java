package lesson24.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionsB {
    public static void main(String[] args) {

        List<Double> doubleArray = Arrays.asList(2.3, 4.7, 5.5, 6.2, 9.9);

        List<Integer> roundedSortedList = doubleArray.stream()
                .map(Math::round)
                .map(Long::intValue)
                .sorted()
                .toList();

        // Print the rounded values
        System.out.println("Rounded values: " + roundedSortedList);
    }
}

