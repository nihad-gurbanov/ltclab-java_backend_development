package lesson5;

public class SumEvens {
    public static void main(String[] args) {
        int sum = 0;

        int value = 0;
        while (value <= 100) {
            sum += value;
            value += 2;
        }
        System.out.println("Sum of numbers from 1 to 100 is: " + sum);

//        for (int i = 2; i <= 100; i += 2) {
//            sum += i;
//        }
//        System.out.println("Sum from 1 to 100 is: " + sum);
    }
}