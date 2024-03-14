package lesson8;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2024;

        System.out.println(car1.make + " " + car1.model + " " + car1.year);
    }
}
