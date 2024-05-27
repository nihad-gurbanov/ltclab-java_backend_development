package lesson25.Alphabet;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Alphabet {
    static List<Character> generateLowerCases() {
        LinkedList<Character> list = new LinkedList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            list.add(c);
        }
        return list;
    }

    static List<Character> generateUpperCases() {
        LinkedList<Character> list = new LinkedList<>();
        for (char c = 'A'; c <= 'Z'; c++) {
            list.add(c);
        }
        return list;
    }

    static List<String> mergeLists(List<Character> lower, List<Character> upper) {
        List<String> list = new LinkedList<>();

        for (int i = 0; i < 26; i++) {
            String merged = lower.get(i).toString() + upper.get(i).toString();
            list.add(merged);
        }
        return list;
    }
    public static void main(String[] args) {
        List<Character> lowerCaseLetters = generateLowerCases();
        List<Character> upperCaseLetters = generateUpperCases();

        List<String> mergedLetters = mergeLists(lowerCaseLetters, upperCaseLetters);

        System.out.println("Merged List of English Letters:");
        for (String letter : mergedLetters) {
            System.out.print(letter + ", ");
        }
    }

}
