package lesson19.UserInputValidator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_RESET = "\u001B[0m";

        InputValidator iv = new InputValidator();

        System.out.println("Enter your input for validation and categorization:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        InputValidator validator = new InputValidator();

        System.out.println("Input validated and categorized. It belongs to "
                + ANSI_GREEN + validator.categorizeInput(input) + ANSI_RESET + " category");

    }
}
