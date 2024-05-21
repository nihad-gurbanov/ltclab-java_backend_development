package lesson24.StreamExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamplesA {
    public static void main(String[] args) {
        // List of strings
        List<String> stringList = Arrays.asList("apple", "cat", "banana", "dog", "elephant");

        // Using stream to filter out strings with length less than 5
        List<String> filteredList = stringList.stream()
                .filter(s -> s.length() >= 5)
                .toList();

        // Print the filtered list
        System.out.println("Filtered list: " + filteredList);
    }
}
