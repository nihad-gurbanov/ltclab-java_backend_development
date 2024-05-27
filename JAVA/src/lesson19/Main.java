package lesson19;

public class Main {
    // ANSI color codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        // Example inputs
        String input1 = "Yes";
        String input2 = "No";

        // Outputting inputs with colors
        System.out.println("Input 1: " + colorizeInput(input1));
        System.out.println("Input 2: " + colorizeInput(input2));
    }

    // Method to colorize input based on its value
    public static String colorizeInput(String input) {
        if (input.equalsIgnoreCase("Yes")) {
            return ANSI_GREEN + input + ANSI_RESET;
        } else if (input.equalsIgnoreCase("No")) {
            return ANSI_RED + input + ANSI_RESET;
        } else {
            return input;
        }
    }
}
