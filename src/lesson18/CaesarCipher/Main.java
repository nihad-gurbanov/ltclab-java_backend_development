package lesson18.CaesarCipher;

import static lesson18.CaesarCipher.CaesarCipher.decrypt;
import static lesson18.CaesarCipher.CaesarCipher.encrypt;

public class Main {
    public static void main(String[] args) {
        String originalText = "Hello, World!";
        int key = 3;

        // Encrypt the text
        String encryptedText = encrypt(originalText, key);
        System.out.println("Encrypted Text: " + encryptedText);

        // Decrypt the encrypted text
        String decryptedText = decrypt(encryptedText, key);
        System.out.println("Decrypted Text: " + decryptedText);
    }
}
