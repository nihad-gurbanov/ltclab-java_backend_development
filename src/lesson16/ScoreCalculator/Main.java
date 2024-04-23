package lesson16.ScoreCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InputCountException, ArithmeticException{
        double totalScore = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student count: ");
        int studentCount = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter scores count: ");
        String  scores = scan.nextLine();
        String[] scoresArr = scores.split(" ");


        for (String s : scoresArr) {
            totalScore += Integer.parseInt(s);
        }

        ScoreCalculator calculator = new ScoreCalculator(studentCount, totalScore);
        System.out.println("Average score is " + calculator.averageScore() + ".");
    }
}
