package lesson3;

import java.util.Scanner;

public class Lesson3Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int intInput = scanner.nextInt();
        if (intInput > 10) {
            System.out.println(-intInput);
        }
        if (intInput % 2 == 0) {
            System.out.println("It's even!");
        }
        else {
            System.out.println("It's odd!");
        }
        System.out.println("Enter a decimal number: ");
        double floatInput = scanner.nextDouble();
        double sumIntDouble = intInput + floatInput;
        System.out.println("sum of first and second number is: " + sumIntDouble);

        int intRand = (int)(Math.random() * 10);
        if (intRand > 6){
            intRand -= 6;
        }
        if (intRand == 0){
            intRand++;
        }

        double sumIntRand = intInput + intRand;
        System.out.println("first int is: " + intInput + ", random integer is: " + intRand);
        System.out.println("sum of first number and generated random number is: " + sumIntRand);

        if (sumIntRand > 20) {
            System.out.println("it's larger than 20");
        } else {
            System.out.println("it's not larger than 20");
        }
    scanner.close();
    }
}