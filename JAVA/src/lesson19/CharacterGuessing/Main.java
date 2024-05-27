package lesson19.CharacterGuessing;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Character Type Guessing Game!");
        System.out.println("Answer the following questions to find out your character type.");

        CharacterGuessingGame game = new CharacterGuessingGame();

        // Ask questions and gather user responses
        boolean outgoing = game.askQuestion(
                "Are you outgoing and sociable? " + ANSI_GREEN + "(yes/no)" + ANSI_RESET, scanner);
        boolean aloneTime = game.askQuestion(
                "Do you enjoy spending time alone? " + ANSI_GREEN + "(yes/no)" + ANSI_RESET, scanner);
        boolean comfortable = game.askQuestion(
                "Are you comfortable in both social and solitary situations? "
                        + ANSI_GREEN + "(yes/no)" + ANSI_RESET, scanner);

        // Determine character type based on responses
        CharacterType characterType = game.determineCharacterType(outgoing, aloneTime, comfortable);

        // Display result
        System.out.println("\nYour character type is: " + characterType);
    }
}
