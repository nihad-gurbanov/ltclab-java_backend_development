package lesson6;

import java.util.Scanner;

public class LastBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last book you read(separate by comma , ): ");
        String userInput = scanner.nextLine();
        String[] bookDetails = userInput.split(",");

        System.out.println("Title: " + bookDetails[0]);
        System.out.println("Author: " + bookDetails[1]);
        System.out.println("Year" + bookDetails[2]);
        }
}
