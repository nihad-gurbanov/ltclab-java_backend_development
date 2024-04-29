package lesson15.Interfaces.Segregation.BirdAndPlane;

public class Plane implements Transport, Flyable {
    int capacity;
    public String destination;

    public Plane(int capacity, String destination) {
        this.capacity = capacity;
        this.destination = destination;
    }

    @Override
    public void takeOff() {
        System.out.println("Plane taking off");
    }

    @Override
    public void land() {
        System.out.println("Plane landing");
    }

    @Override
    public String getCapacity() {
        return "Plane capacity: " + capacity;
    }

    @Override
    public String getDestination() {
        return "Plane destination: " + destination;
    }

    @Override
    public void setDestination(String newDestination) {
        System.out.println("Updated:");
        destination = newDestination;
    }
}
