package lesson15.Segregation;

public class Person implements Swim, Walk{
    @Override
    public void swim() {
        System.out.println("Person swimming");
    }

    @Override
    public void walk() {
        System.out.println("Person walking");
    }
}
