package lesson5;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        boolean playGame = true;
        int computersChoice = (int) (Math.random() * 10);
//        System.out.println("DEBUG: computers choice is " + computersChoice);
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Welcome to Guess The Number Game!\nGuess a number:");
            String playersGuess = scanner.nextLine();
            // 4. Break statement
            if (playersGuess.equals("exit")) {
                System.out.println("Game terminated");
                break;
            }
            int guess = Integer.parseInt(playersGuess);
            if (guess == computersChoice) {
                System.out.println("Congrats!");
                playGame = false;
            } else if (guess < computersChoice) {
                System.out.println("Too low");
            } else {
                System.out.println("Too high");
            }
        } while (playGame);
    }
}
