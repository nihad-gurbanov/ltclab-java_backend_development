package lesson11.CountString;


public class CountString {
    public static int numberOfWords (String text) {
       int count;
        String[] stringArray = text.split("\\s+"); // single or sequential spaces
        count = stringArray.length;
       return count;
    }

    static int charOccurrences (String text, char target) {
        int count = 0;
        char[] charArray = text.toCharArray();
        for (char item: charArray) {
            if (item == target) {
                count++;
            }
        }
        return count;
    }
}
