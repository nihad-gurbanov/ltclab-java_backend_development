package lesson19.ParseMethods;

import java.util.Scanner;

public class ParseAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        String age = scanner.nextLine().trim();

        int intAge = Integer.parseInt(age);
        System.out.println(intAge);

        if (intAge > 18) {
            System.out.println("You passed 18th " + (intAge - 18) + " years ago.");
        } else if (intAge < 18) {
            System.out.println("You have " + (18 - intAge) + " years to 18th.");
        } else {
            System.out.println("You are in 18th.");
        }


    }
}
