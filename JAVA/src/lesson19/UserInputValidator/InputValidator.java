package lesson19.UserInputValidator;

public class InputValidator {
    boolean validateNumberInput(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }

    boolean validateTextInput(String input) {
        return input.matches("[a-zA-Z]+");
    }

    boolean validateSpecialCharacterInput(String input) {
        return input.matches("[^a-zA-Z0-9]");
    }

    InputCategory categorizeInput(String input) {
        if (validateNumberInput(input.trim())) {
            return InputCategory.NUMBER;
        } else if (validateTextInput(input.trim())) {
            return InputCategory.TEXT;
        } else if (validateSpecialCharacterInput(input.trim())) {
            return InputCategory.SPECIAL_CHARACTER;
        }
        return InputCategory.UNSPECIFIED_FORMAT;
    }
}
