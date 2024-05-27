package lesson21.LetterFrequency;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some lines of text followed by a period and a return:");
        String input = scanner.nextLine().toLowerCase(); // Convert input to lowercase
        Map<Character, Integer> letterCounts = new HashMap<>(); // HashMap to store letter frequencies

        // Iterate through each character in the input
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) { // Ignore non-letter characters
                letterCounts.put(ch, letterCounts.getOrDefault(ch, 0) + 1);
            }
        }

        // Display the letter frequencies
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (letterCounts.containsKey(letter)) {
                System.out.println(letter + ": " + letterCounts.get(letter));
            }
        }
    }
}
