package lesson16.RegistrationSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Registration {
    private static final String FILE_NAME = "participants.txt";

    public static void main(String[] args) {
        try {
            registerParticipant();
            displayParticipants();
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    public static void registerParticipant() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter participant details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Participant participant = new Participant(name, age, email);

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {
            writer.write(participant.toString());
        }
    }

    public static void displayParticipants() throws IOException {
        System.out.println("\nParticipants:");
        try {
            File file = new File(FILE_NAME);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("File not found: " + e.getMessage());
        }
    }
}