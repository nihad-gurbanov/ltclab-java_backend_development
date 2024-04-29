package lesson15.Interfaces.Segregation.BirdAndPlane;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird("Canary");
        Plane plane = new Plane(260, "London");

        System.out.println(bird.getName());
        bird.takeOff();
        bird.land();
        bird.makeSound();



        plane.takeOff();
        plane.land();
        System.out.println(plane.getCapacity());
        System.out.println(plane.getDestination());
        plane.setDestination("Baku");
        System.out.println(plane.getDestination());
    }
}
