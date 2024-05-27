package lesson15.Segregation;

public class Duck implements Fly, Swim, Walk {
    @Override
    public void swim() {
        System.out.println("Duck swimming");
    }

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void walk() {
        System.out.println("Duck walking");
    }

}
