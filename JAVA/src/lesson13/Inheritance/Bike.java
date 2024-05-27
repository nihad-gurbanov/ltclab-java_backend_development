package lesson13.Inheritance;

public class Bike extends Vehicle {
    int numWheels;

    public Bike(String make, String model, int wheelCount) {
        super(make, model);
        this.numWheels = wheelCount;
    }

    public int getNumWheels() {
        return numWheels;
    }
}
