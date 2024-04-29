package lesson15.Interfaces.Segregation.BirdAndPlane;

public class Bird implements Animal, Flyable {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird singing");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird taking off");
    }

    @Override
    public void land() {
        System.out.println("Bird landing");
    }
}
