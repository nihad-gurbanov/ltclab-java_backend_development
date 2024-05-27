package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class CharsOfName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        String[] charArray = userName.split("");
        System.out.println(Arrays.toString(charArray));
    }
}
