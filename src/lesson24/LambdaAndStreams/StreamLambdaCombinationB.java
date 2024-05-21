package lesson24.LambdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class StreamLambdaCombinationB {
    public static void main(String[] args) {
        // List of integers
        List<Integer> integers = Arrays.asList(2, 3, 4, 5);

        // Using stream to find the product of all numbers
        int product = integers.stream()
                .reduce(1, (a, b) -> a * b);

        // Print the product
        System.out.println("Product of all numbers: " + product);
    }
}

