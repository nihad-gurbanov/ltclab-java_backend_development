package lesson4;

import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter measure unit (only C or F):");
        char unit = scanner.nextLine().charAt(0);

        if (unit != 'C' && unit != 'c' && unit != 'F' && unit != 'f') {
            System.out.println("Enter correct unit please!");
            return;
        }

        System.out.println("Enter degree:");
        double degree = scanner.nextDouble();

        switch (unit){
            case 'C', 'c':
                double toFar = degree * 9 / 5 + 32;
                System.out.println(degree + " Celsius is " + toFar + " Fahrenheit");
                break;
            case 'F', 'f':
                double toCel = (degree - 32) * 5 / 9;
                System.out.println(degree + " Fahrenheit is " + toCel + " Celsius");
                break;
            default:
                System.out.println("Enter correct inputs please!");
        }
    }
}
