package lesson19.UserInputValidator;

public enum InputCategory {
    NUMBER("123"),
    TEXT("abc"),
    SPECIAL_CHARACTER("//"),
    UNSPECIFIED_FORMAT("Mix");

    private final String value;
    InputCategory(String value){
        this.value = value;
    }
}
