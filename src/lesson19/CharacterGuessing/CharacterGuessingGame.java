package lesson19.CharacterGuessing;

import java.util.Scanner;

public class CharacterGuessingGame {
    // Method to ask a question and validate user response
    public boolean askQuestion(String question, Scanner scanner) {
        System.out.println(question);
        String response;
        do {
            response = scanner.nextLine().trim().toLowerCase();
        } while (!response.equals("yes") && !response.equals("no"));
        return response.equals("yes");
    }

    // Method to determine character type based on user responses
    public CharacterType determineCharacterType(boolean outgoing, boolean aloneTime, boolean comfortable) {
        if (outgoing && !aloneTime && comfortable) {
            return CharacterType.AMBIVERTED;
        } else if (outgoing && !aloneTime && !comfortable) {
            return CharacterType.EXTROVERTED;
        } else if (!outgoing && aloneTime && comfortable) {
            return CharacterType.INTROVERTED;
        } else {
            return CharacterType.OMNIVERTED;
        }
    }
}