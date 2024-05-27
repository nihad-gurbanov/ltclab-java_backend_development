package lesson2;

import java.util.Scanner;

public class InchConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ratio = 2.54;
        System.out.println("Enter measure in inch: ");
        double inch = scanner.nextDouble();
        double cm = inch * ratio;

        System.out.println(inch + " inch is " + cm + "cm.");
    }
}
