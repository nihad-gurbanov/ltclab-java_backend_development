package lesson2;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two decimal numbers
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform addition, subtraction, multiplication, and division
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;

        // Check if number2 is not zero to avoid division by zero
        if (number2 != 0) {
            double division = number1 / number2;
            System.out.println("Division: " + number1 + " / " + number2 + " = " + division);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        // Display the results
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + addition);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + subtraction);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + multiplication);

        // Close the Scanner object to prevent resource leak
        scanner.close();
    }
}
