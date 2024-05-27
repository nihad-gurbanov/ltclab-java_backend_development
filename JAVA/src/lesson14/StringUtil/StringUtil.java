package lesson14.StringUtil;

public class StringUtil {
    // concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // convert a string to uppercase
    public String convertToUpperCase(String str) {
        return str.toUpperCase();
    }

    // reverse a string
    public String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
