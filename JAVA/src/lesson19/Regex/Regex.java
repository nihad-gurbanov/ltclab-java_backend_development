package lesson19.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        String text = "Sally sells seashells by the seashore. " +
                "Susan swims swiftly in the sea. Sam sings songs sitting on a stone.";

        Pattern pattern = Pattern.compile("\\bS\\w*\\b");
        Matcher matcher = pattern.matcher(text);

        int index = 0;
        while (matcher.find()) {
            index += 1;
            System.out.println("Result " + index+ ": " + matcher.group());
        }
    }
}
