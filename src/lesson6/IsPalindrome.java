package lesson6;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Palindrome Number Checking App\nEnter number: ");

        int userInput = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character left in the buffer

        String numberAsString = Integer.toString(userInput);
        System.out.println("Digits: " + numberAsString);

        boolean isPalindrome = true;
        int lastIndex = numberAsString.length() - 1;

        for (int firstIndex = 0; firstIndex < lastIndex; firstIndex++) {
            if (numberAsString.charAt(firstIndex) != numberAsString.charAt(lastIndex)) {
                isPalindrome = false;
                System.out.println("Not a Palindrome");
                break;
            }
            lastIndex--;
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        }
    }
}
