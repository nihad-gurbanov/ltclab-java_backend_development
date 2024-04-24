package lesson16.ScoreCalculator;

import java.util.Scanner;

public class ScoreCalculator {
    private final int studentCount;
    private final String[] scores;
    private double averageScore;

    public ScoreCalculator(int studentCount, String scores) {
        this.studentCount = studentCount;
        this.scores = scores.split(" ");
    }

    public double averageScore() throws InputCountException {
        if (studentCount != scores.length) {
            throw new InputCountException("Student and score count doesn't match!");
        }
        double totalScore = 0;
        for (String s : scores) {
            totalScore += Integer.parseInt(s);
        }
        averageScore = totalScore / studentCount;
        return averageScore;
    }
}
