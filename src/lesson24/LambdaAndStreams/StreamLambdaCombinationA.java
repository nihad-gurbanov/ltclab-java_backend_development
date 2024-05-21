package lesson24.LambdaAndStreams;

import java.util.Arrays;
import java.util.List;

public class StreamLambdaCombinationA {
    public static void main(String[] args) {
        // List of words
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Using stream to find the average length of strings
        double averageLength = words.stream()
                .mapToInt(String::length)
                .average()
                .orElse(0.0);


        // Print the average length
        System.out.println("Average length of strings: " + averageLength);
    }
}

