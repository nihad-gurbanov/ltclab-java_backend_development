package lesson11;

import javax.management.remote.JMXAddressable;

public class Car {
    public String make;
    public String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;

    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Tesla", "S3");

        System.out.println("First car: " + car1.make + " " + car1.model + "\n" +
                "Second car: " + car2.make + " " + car2.model + "\n");
    }
}
