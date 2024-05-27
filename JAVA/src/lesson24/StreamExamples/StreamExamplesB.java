package lesson24.StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamplesB {
    public static void main(String[] args) {
        // List of integers
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 3, 2, 7);

        // Using stream to skip first two elements, remove duplicates, and collect the result
        List<Integer> resultList = integerList.stream()
                .skip(2)
                .distinct()
                .toList();

        // Print the remaining elements
        System.out.println("Remaining elements after skip and distinct: " + resultList);
    }
}
