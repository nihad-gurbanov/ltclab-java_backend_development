package lesson11.CountString;

public class Main {
    public static void main(String[] args) {
        String string = "Lorem Ipsum is simply dummy text of the printing and " +
                "typesetting industry. Lorem Ipsum has been the industry's " +
                "standard dummy text ever since the 1500s, when an unknown " +
                "printer took a galley of type and scrambled it to make a type " +
                "specimen book. It has survived not only five centuries, but " +
                "also the leap into electronic typesetting, remaining " +
                "essentially unchanged.";

        String text = "She is a very diligent lady.";

        System.out.println(CountString.numberOfWords(string));
        System.out.println(CountString.charOccurrences(text, 'd'));
    }
}
