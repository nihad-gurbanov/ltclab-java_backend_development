package lesson18.NicknameGenerator;

import java.util.Scanner;

public class NicknameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        String[] stringArray = name.split("");
        System.out.println("Enter lastname: ");
        String lastname = scanner.nextLine();
        System.out.println("Enter birth year: ");
        String birthYear = scanner.nextLine();

        StringBuilder nickname = new StringBuilder();
        for (int i = 0; i < stringArray.length; i+=2) {
            nickname.append(stringArray[i]);
        }

        System.out.println("Your username is:");
        nickname.append("-").append(lastname).append(birthYear.substring(2,4));

        System.out.println(nickname);
    }
}
