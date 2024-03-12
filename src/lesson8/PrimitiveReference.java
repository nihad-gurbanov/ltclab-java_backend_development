package lesson8;

public class PrimitiveReference {
    public static void main(String[] args) {
        // Primitive
        int myInt = 10;
        double myDouble = 3.14;
        boolean myBoolean = true;
        char myChar = 'A';

        System.out.println("Integer: " + myInt);
        System.out.println("Double: " + myDouble);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Char: " + myChar);

        // Reference
        String str1 = "Hello";
        String str2 = "world";

        String result = str1 + " " + str2;
        System.out.println("Concatenated string: " + result);

        int length = result.length();
        System.out.println("Length of the string: " + length);

        char firstChar = result.charAt(0);
        char lastChar = result.charAt(result.length() - 1);
        System.out.println("First character: " + firstChar);
        System.out.println("Last character: " + lastChar);

        String substring = result.substring(6, 11);
        System.out.println("Substring: " + substring);

        String upperCase = result.toUpperCase();
        String lowerCase = result.toLowerCase();
        System.out.println("Uppercase string: " + upperCase);
        System.out.println("Lowercase string: " + lowerCase);

        boolean containsHello = result.contains("Hello");
        System.out.println("Contains 'Hello': " + containsHello);

        String[] parts = result.split(" ");
        System.out.println("Parts of the string:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
