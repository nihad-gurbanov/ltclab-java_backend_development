package lesson5;

import java.util.Scanner;

public class MultiplicationTableN {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number for Multiplication Table:");
            int number = scanner.nextInt();

            for (int i = 1; i < 10; i++) {
                System.out.println(number + " * " + i + " = " + number * i);
            }
        }
    }
}
