package lesson7;

import java.util.Random;

public class MultiDimArray {
    public static void main(String[] args) {
        int outerLength = 3;
        int innerLength = 8;

        int[][] twoDimArray = new int[outerLength][innerLength];

        Random rand = new Random();
        for (int i = 0; i < outerLength; i++) {
            for (int j = 0; j < innerLength; j++) {
                twoDimArray[i][j] = rand.nextInt(100);
            }
        }

        for (int i = 0; i < outerLength; i++) {
            for (int j = 0; j < innerLength; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
