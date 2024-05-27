package lesson3;

import java.util.Scanner;

public class SecurityChecker {
    public static void main(String[] args) {
        /*
        * Task 1: Is dog barking?
        * 1. Create Scanner.
        * 2. Ask user: is dog barking and is it night.
        *    Assign inputs to variables.
        * 3. Define each case and print on the terminal.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is dog barking? type only true or false:");
        boolean isDogBarking = scanner.nextBoolean();
        System.out.println("Is it Night? type only true or false:");
        boolean isNight = scanner.nextBoolean();

        if(isDogBarking && isNight) {
            System.out.println("There is a problem!");
        }
        else{
            System.out.println("Everything is OK!");
        }
    }
}
