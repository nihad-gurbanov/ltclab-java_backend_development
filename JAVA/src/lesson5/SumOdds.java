package lesson5;

public class SumOdds {
    public static void main(String[] args) {
        int sum = 0;

        int value = 1;
        while (value <= 5) {
            sum += value;
            value += 2;
        }
        System.out.println("Sum of odd numbers from 1 to 20 is: " + sum);

//        for (int i = 2; i <= 100; i += 2) {
//            sum += i;
//        }
//        System.out.println("Sum from 1 to 100 is: " + sum);
    }
}