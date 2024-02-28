package lesson4;

import java.util.Scanner;

public class ScoreGrader1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your score for grading (must be between 0 and 100:");
        int score = scanner.nextInt();
        String grade = "";
        if (score < 0 || score > 100) {
            System.out.println("Score must be between 0 and 100");} else if (score > 90) {
            grade = "A"; } else if (score > 80) {
            grade = "B"; } else if (score > 70) {
            grade = "C"; } else if (score > 60) {
            grade = "D"; } else {
            grade = "F";}

        System.out.println("Your grade is " + grade);
    }
}
