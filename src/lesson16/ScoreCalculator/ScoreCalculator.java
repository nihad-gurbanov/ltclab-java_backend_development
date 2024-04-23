package lesson16.ScoreCalculator;

import java.util.Scanner;

public class ScoreCalculator {
    int studentCount;
    double totalScore;
    double averageScore;

    public ScoreCalculator(int studentCount, double totalScore) {
        this.studentCount = studentCount;
        this.totalScore = totalScore;
    }

    public double averageScore() {
        try {
            averageScore = totalScore / studentCount;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        return averageScore;
    }
}
