package lesson23.SortedLength;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedLength {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> input = List.of("yellow apple", "orange", "banana", "strawberry", "kiwi", "grapefruit");

        // Convert the list into a stream, filter, sort, and collect
        List<String> sortedLongStrings = input.stream()
                .filter(s -> s.length() > 10) // Filter out strings with length less than or equal to 10
                .sorted(Comparator.comparingInt(String::length).reversed()) // Sort in descending order by length
                .collect(Collectors.toList()); // Collect into a new list

        // Print the sorted list of long strings
        System.out.println(sortedLongStrings);
    }
}
