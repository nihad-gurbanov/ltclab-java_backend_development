package lesson4;

import java.util.Scanner;

public class MonthDaysCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of the month:");
        String month = scanner.nextLine();

        switch (month) {
            case "January", "March", "May", "July", "August", "October", "December":
                System.out.println(month + " has 31 days.");
                break;
            case "April", "June", "September", "November":
                System.out.println(month + " has 30 days.");
                break;
            case "February":
                System.out.println(month + " has 29 days for leap years and 28 days for ordinary years.");
                break;
            default:
                System.out.println("Undefined month, enter correctly!");
        }
    }
}
