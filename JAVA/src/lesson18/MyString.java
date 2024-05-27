package lesson18;

public class MyString {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World!";

        String s3 = s1.concat(s2);
        System.out.println(s3);


        String s4 = s3.substring(6, 12);
        System.out.println(s4);

        System.out.println(s3.length());
    }
}
