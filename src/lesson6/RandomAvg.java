package lesson6;

import java.util.Arrays;
import java.util.Random;

public class RandomAvg {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            int randInt = random.nextInt(100);
            array[i] = randInt;
        }
        for(int item : array) {
            avg += item;
        }
        System.out.println(Arrays.toString(array));
        System.out.println(avg/10);

    }
}
