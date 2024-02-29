package lesson5;

import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number for calculating Factorial:");
            int number = scanner.nextInt();
            long product = 1;

            for (int i = 1; i <= number; i++) {
                product = product * i;
            }
            System.out.println("Factorial of " + number + " is " + product);
        }
    }
}
