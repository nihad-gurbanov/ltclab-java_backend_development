package lesson3;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        /*
        Write a Java program that combines the following operations and
        control structures into a single program:

        1. Input: Ask the user to enter an integer.
        2. Relational Operators: Check if the entered integer is greater than 10.
        3. Unary Operators: If the integer is greater than 10, display its
        negation; otherwise, display its original value.
        4. Logical Operators: Check if the integer is even (use the remainder
        operator '%'). If it's even, display a message indicating that it's
        even; if it's odd, display a message indicating that it's odd.
        5. Scanner, Input, and Output: Ask the user to enter a decimal number.
        Then, display the sum of the entered decimal number and the integer.
        6. Math.random: Generate a random number between 1 and 6 and add it to
        the integer.
        7. If-Else Introduction: If the final result is greater than 20,
        display a message saying it's larger than 20; otherwise, display a
        message saying it's not larger than 20
        */

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