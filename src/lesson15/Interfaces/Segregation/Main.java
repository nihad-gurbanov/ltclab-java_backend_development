package lesson15.Interfaces.Segregation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Duck duck = new Duck();

        person.swim();
        person.walk();

        duck.fly();
        duck.walk();
        duck.swim();
    }
}
