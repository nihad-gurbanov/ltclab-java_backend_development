package lesson16.PasswordValidator;

public class Main {
    public static void main(String[] args) {
        String[] passwords = {"Password123", "abcdfghjkll", "123", "abcdfghjkllA"};

        for (String password : passwords) {
            try {
                PasswordValidator.validatePassword(password);
                System.out.println("Password is valid.");
            } catch (InvalidPasswordException e) {
                System.out.println("Invalid Password: " + e.getMessage());
            }
        }
    }
}
