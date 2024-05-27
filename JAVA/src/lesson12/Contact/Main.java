package lesson12.Contact;

public class Main {
    public static void main(String[] args) {
        Contact person1 = new Contact("John", "+1000000000");
        Contact person2 = new Contact("John", "+1000000000");
        Contact person3 = new Contact("Tom", "+1000000001");

        System.out.println("Are person 1 and 2 the same? " + person1.equals(person2));
        System.out.println("Are person 2 and 3 the same? " + person2.equals(person3));
        System.out.println("Are person 1 and 3 the same? " + person1.equals(person3));

    }
}
