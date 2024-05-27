package lesson7;

import java.util.Scanner;

public class MatrixFilling {
    public static void main(String[] args) {
        String[][] array = new String[3][3];

        while (true) {

            System.out.println("Enter your string:");
            Scanner scanner = new Scanner(System.in);

            String userInput = scanner.nextLine();

            System.out.println(
                    "Enter coordinates, both must be between 0 and 3 ex 1 2");
            String[] coordinates = scanner.nextLine().split(" ");
            if (array[Integer.parseInt(coordinates[0])][Integer.parseInt(coordinates[1])] == null) {
                array[Integer.parseInt(coordinates[0])][Integer.parseInt(coordinates[1])] = userInput;
            } else {
                System.out.println("You can add to only empty cells!");
            }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
