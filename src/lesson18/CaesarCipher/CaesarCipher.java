package lesson18.CaesarCipher;

public class CaesarCipher {
    public static String encrypt(String text, int key) {
        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Encrypt uppercase letters
            if (Character.isUpperCase(currentChar)) {
                char encryptedChar = (char) ((currentChar + key - 'A') % 26 + 'A');
                encryptedText.append(encryptedChar);
            }
            // Encrypt lowercase letters
            else if (Character.isLowerCase(currentChar)) {
                char encryptedChar = (char) ((currentChar + key - 'a') % 26 + 'a');
                encryptedText.append(encryptedChar);
            }
            // Leave non-alphabetic characters unchanged
            else {
                encryptedText.append(currentChar);
            }
        }

        return encryptedText.toString();
    }

    // Method to decrypt the encrypted text
    public static String decrypt(String encryptedText, int key) {
        // To decrypt, we use the negative of the key
        return encrypt(encryptedText, -key);
    }
}
