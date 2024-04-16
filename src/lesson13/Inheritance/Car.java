package lesson13.Inheritance;

public class Car extends Vehicle{
    int numDoors;

    public Car(String make, String model, int doorCount) {
        super(make, model);
        this.numDoors = doorCount;
    }

    public int getNumDoors() {
        return numDoors;
    }
}
