package lesson16.ScoreCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputCountException {
        double totalScore = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student count: ");
        int studentCount = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter scores: ");
        String  scores = scan.nextLine();

        ScoreCalculator calculator = new ScoreCalculator(studentCount, scores);
        try {
            System.out.println("Average score is " + calculator.averageScore() + ".");
        } catch (InputCountException e) {
            System.out.println(e.getMessage());
        }
//
    }
}
