package lesson11.SlotMachine;

import java.util.Random;
public class SlotMachine {

    public boolean pullLever() {
        String[] symbols = {"🍒", "🍋", "🍊", "🔔", "🍉", "🍇"};
        Random random = new Random();
        String[] selectedSymbols = new String[3];

        for (int i = 0; i < 3; i++) {
            int randomIndex = random.nextInt(symbols.length);
            selectedSymbols[i] = symbols[randomIndex];
        }

        System.out.println("Pull Lever:");
        for (String symbol : selectedSymbols) {
            System.out.print(symbol + " ");
        }

        return selectedSymbols[0].equals(selectedSymbols[1])
                && selectedSymbols[0].equals(selectedSymbols[2]);
    }

    public void playGame(SlotMachine game, int n, int deposit) {
        for (int i = 0; i < n; i++) {
            // Pull the lever
            boolean won = game.pullLever();

            // Display the game result
            if (won) {
                System.out.println("\nYou Won!");
                deposit += 5;
            } else {
                System.out.println("\nYou Lost!");
                deposit -= 5;
            }

            // Check if the game should continue
            if (deposit <= 0) {
                System.out.println("You ran out of money. Game over!");
                break;
            }
        }

        System.out.println("Game is up. Your final balance is: " + deposit);
    }
}
