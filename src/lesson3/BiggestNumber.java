package lesson3;

import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integers: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int biggestNum;

        if (num1 > num2 && num1 > num3) {
            biggestNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            biggestNum = num2;
        } else {
            biggestNum = num3;
        }
        System.out.println("Biggest number is " + biggestNum);
    }
}