package lesson3;

import java.util.Scanner;

public class MH1 {
    public static void main(String[] args) {
        /*
        * Task 1: Gecə it hürürmü?
        * 1. Scanner yarat.
        * 2. İstifadəçidən sıra ilə it hürürmü və gecədirmi deyə soruş.
        *    Cavabları yadda saxla.
        * 3. Hər bir mümkün halı müəyyən et və müvafiq mesajı çap et.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is dog barking? type only true or false:");
        boolean isDogBarking = scanner.nextBoolean();
        System.out.println("Is it Night? type only true or false:");
        boolean isNight = scanner.nextBoolean();

        if(isDogBarking && isNight){
            System.out.println("There is a problem!");
        } else {
            System.out.println("Everything is OK!");
        };
    }
}
