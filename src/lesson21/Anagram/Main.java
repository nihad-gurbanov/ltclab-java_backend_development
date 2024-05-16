package lesson21.Anagram;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> anagrams = AnagramGrouper.groupAnagrams(words);

        // Print the anagrams and their counts
        for (Map.Entry<String, List<String>> entry : anagrams.entrySet()) {
            String sortedWord = entry.getKey();
            List<String> anagramList = entry.getValue();
            System.out.println("Anagrams of " + sortedWord + ": " + anagramList + ", Count: " + anagramList.size());
        }
    }
}
