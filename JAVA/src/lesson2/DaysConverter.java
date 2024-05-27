package lesson2;

import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter days to convert:");
        int days = scanner.nextInt();
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int weeks = remainingDays / 7;

        System.out.println(days + " days is:\n" + years + " years\n" + months
                + " months\n" + weeks + " weeks");
    }
}
