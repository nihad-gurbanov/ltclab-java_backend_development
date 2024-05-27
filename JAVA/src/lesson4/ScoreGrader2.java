package lesson4;

import java.util.Scanner;

public class ScoreGrader2 {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your score for grading (Score must be between 0 and 100):");
            int score = scanner.nextInt();
            String message = (score > 100 || score < 0) ? "Score must be between 0 and 100" :
                    score > 90 ? "A" :
                            score > 80 ? "B" :
                                    score > 70 ? "C" :
                                            score > 60 ? "D" :
                                                    "F";
            System.out.println(message);

        }
    }
}
