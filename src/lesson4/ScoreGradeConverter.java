package lesson4;

import java.util.Scanner;

public class ScoreGradeConverter {
    public static void main(String[] args) {
        System.out.println("Enter your score:");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100");
            return;
        }

        int adjustedScore = (score - 1) / 10;
        switch (adjustedScore) {
            case 9:
                System.out.println(score + " is A");
                break;
            case 8:
                System.out.println(score + " is B");
                break;
            case 7:
                System.out.println(score + " is C");
                break;
            case 6:
                System.out.println(score + " is D");
                break;
            case 5, 4, 3, 2, 1, 0:
                System.out.println(score + " is F");
                break;
        }
    }
}
