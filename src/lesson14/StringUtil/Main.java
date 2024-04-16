package lesson14.StringUtil;

public class Main {
    public static void main(String[] args) {
        StringUtil stringUtil = new StringUtil();

        // concatenate method
        System.out.println("Concatenation:");
        System.out.println("Result: " + stringUtil.concatenate("Hello", "World"));

        // convertToUpperCase method
        System.out.println("\nUppercase Conversion:");
        System.out.println("Result: " + stringUtil.convertToUpperCase("hello"));

        // reverseString method
        System.out.println("\nString Reversal:");
        System.out.println("Result: " + stringUtil.reverseString("Java"));
    }
}
