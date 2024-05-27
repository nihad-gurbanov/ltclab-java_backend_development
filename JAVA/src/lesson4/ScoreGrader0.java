package lesson4;

import java.util.Scanner;

public class ScoreGrader0 {
    public static void main(String[] args) {
        while (true) {
        System.out.println("Enter your score:");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100");
            return;
        }
        String output = "";
        int adjustedScore = (score - 1) / 10;
        switch (adjustedScore) {
            case 9:
                output = score + " is A";
                break;
            case 8:
                output = score + " is B";
                break;
            case 7:
                output = score + " is C";
                break;
            case 6:
                output = score + " is D";
                break;
            default:
                output = score + " is F";
                break;
        }
        System.out.println(output);
        }

        /*
        * output = switch (adjustedScore) {
            case 9 -> score + " is A";
            case 8 -> score + " is B";
            case 7 -> score + " is C";
            case 6 -> score + " is D";
            default -> score + " is F";
        };*/
    }
}
