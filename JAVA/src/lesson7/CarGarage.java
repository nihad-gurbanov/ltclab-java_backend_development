package lesson7;

import java.util.Scanner;

public class CarGarage {
    public static void main(String[] args) {
        boolean start = true;
        Scanner scanner = new Scanner(System.in);

        while (start) {
            String[][] carGarage = new String[6][3];

            carGarage[0][0] = "BMW";
            carGarage[0][1] = "iX";
            carGarage[0][2] = "2022";

            carGarage[1][0] = "Mercedes";
            carGarage[1][1] = "EQS";
            carGarage[1][2] = "2023";

            carGarage[2][0] = "Audi";
            carGarage[2][1] = "e-tron";
            carGarage[2][2] = "2023";

            carGarage[3][0] = "Chevrolet";
            carGarage[3][1] = "EQUINOX";
            carGarage[3][2] = "2024";

            System.out.println("Welcome to Garage App:\nType 'check' for spaces or 'exit' to exit:");
            String status = scanner.nextLine();

            if (status.equals("check")) {
                for (int row = 0; row < carGarage.length; row++) {
                    System.out.println((row + 1) + ". space");
                    for (int col = 0; col < carGarage[row].length; col++) {
                        if (carGarage[row][col] == null) {
                            System.out.print("Is Empty ");
                            break;
                        }
                        System.out.print(carGarage[row][col] + " ");
                    }
                    System.out.println();
                }

                System.out.println("Enter empty space number or 'exit' to exit:");
                int order = scanner.nextInt();

                if (order >= 1 && order <= carGarage.length && carGarage[order - 1][0] == null) {
                    System.out.println("Enter car details like: make model year");
                    scanner.nextLine(); // Consume the newline character
                    String userInput = scanner.nextLine();
                    if (userInput.equals("exit")) {
                        start = false;
                    } else {
                        String[] details = userInput.split(" ");
                        carGarage[order - 1][0] = details[0];
                        carGarage[order - 1][1] = details[1];
                        carGarage[order - 1][2] = details[2];
                        System.out.println("Car parked successfully!");


                    }
                } else {
                    System.out.println("Invalid space number or space is not empty.");
                }
            } else if (status.equals("exit")) {
                start = false;
            }
        }
    }
}
