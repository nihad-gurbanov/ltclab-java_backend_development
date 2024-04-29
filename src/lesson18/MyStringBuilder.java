package lesson18;

public class MyStringBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Nothing in all the world is more dangerous than " +
                "sincere ignorance and conscientious stupidity.");

        StringBuilder s2 = new StringBuilder("Martin Luther King Jr.");

        StringBuilder s3 = s1.append("\n").append(s2);

        System.out.println(s3);

        StringBuilder year = new StringBuilder("2024");
        StringBuilder s4 = year.append(" ").append(s3);
        System.out.println(s4);


    }
}
