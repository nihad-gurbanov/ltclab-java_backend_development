package lesson16.PasswordValidator;

public class PasswordValidator {
    public static void validatePassword(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters long.");
        }

        if (!password.matches(".*[A-Z].*")) {
            throw new InvalidPasswordException("Password must contain at least one uppercase letter.");
        }

        if (!password.matches(".*[a-z].*")) {
            throw new InvalidPasswordException("Password must contain at least one lowercase letter.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new InvalidPasswordException("Password must contain at least one digit.");
        }
    }
}
