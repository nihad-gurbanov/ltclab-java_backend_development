package lesson11;

import java.util.Scanner;

public class FullNameConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their first name
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        // Prompt the user to enter their last name
        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        // Concatenate the first name and last name to create the full name
        String fullName = firstName.concat(" ").concat(lastName);

        // Display the full name to the user
        System.out.println("Your full name is: ".concat(fullName));

        scanner.close();
    }
}

