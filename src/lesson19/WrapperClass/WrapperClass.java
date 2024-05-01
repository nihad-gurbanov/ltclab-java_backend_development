package lesson19.WrapperClass;

import java.awt.*;
import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");

        int num = scanner.nextInt();

        int doubleNum = Integer.sum(num, num);

        System.out.print("Double of integer number is: ");
        System.out.println(doubleNum);
    }

}
