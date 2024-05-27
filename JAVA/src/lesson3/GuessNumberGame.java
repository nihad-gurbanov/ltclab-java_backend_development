package lesson3;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {

/*
Level : Entertaining

Guess the Number Game

Create a Java program that allows the user to play a "Guess the Number" game.
In this game, the computer will generate a random number between a specified
range, and the user has to guess that number. The program will provide feedback
after each guess, helping the user narrow down their guess.
*/

/*
Requirements:
1 The program should use the Scanner class to take input from the user.
*/
/*
2 The program should use the Math.random() method to generate a random number
within a specified range.
*/
/*
3 The program should provide the user with a limited number of attempts
(e.g., 5 attempts).
4 After each guess, the program should provide feedback to the user in the
form of:
    "Too high" if the guess is greater than the target number.
    "Too low" if the guess is less than the target number.
    "Congratulations! You guessed the number." if the guess is correct.
5 The program should use relational operators (e.g., >, <, ==) to compare the
user's guess with the target number.
6 The program should use logical operators (e.g., &&, ||) to handle conditions
such as whether the user's guess is within the valid range.
7 The program should use unary operators (e.g., ++, -) to keep track of the
number of attempts remaining.

    Example Output:
    Welcome to the Guess the Number Game!
    I'm thinking of a number between 1 and 10.

    Enter your guess: 5
    Too low. My number was : 7
    */
        System.out.println("Welcome to the Guess the Number Game!\n" +
                "I'm thinking of a number between 1 and 10.");
        Scanner scanner = new Scanner(System.in);
        int computersChoice = (int) (Math.random() * 10 + 1);
//        System.out.println("DEBUG: Computer's choice: " + computersChoice);

        System.out.println("Enter your guess:");
        int chances = 2;

        for(int i = 3; i > 0; i--)
        {
            int playersChoice = scanner.nextInt();
            if (playersChoice > computersChoice) {
                System.out.println("Too high, you have " + chances + " more tries");
            } else if (playersChoice < computersChoice) {
                System.out.println("Too low, you have " + chances + " more tries");
            } else {
                System.out.println("You Won!");
                return;
            }
            chances -= 1;
        }
    }
}
