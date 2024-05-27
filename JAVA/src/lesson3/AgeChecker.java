package lesson3;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        /*
        Task 2: Yaşa görə nəsil.

        - İstifadəçidən yaşını soruş və Scanner-dən istifadə etmək məlumatı qəbul et.
        - İstifadəçinin yaşına uyğun olaraq: uşaq, cavan və yə qoca olduğunu
          tap və mesajı çap et.

        Bütün mümkün halları nəzərə al!
        Qeyd: Cavanı 18 və 35 yaş aralığında götürün.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age please:");
        int age = scanner.nextInt();

        if (age < 1 || age > 150) {
            System.out.println("Age must be minimum 1 and maximum 150");
            return;
        }

        if (age < 18) {
            System.out.println("You are a child or a teenager!");
        } else if (age < 36) {
            System.out.println("You are a young person!");
        } else {
            System.out.println("You are an aged person!");
        }

    }
}
