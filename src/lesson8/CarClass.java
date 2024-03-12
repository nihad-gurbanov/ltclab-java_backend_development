package lesson8;

public class CarClass {
    String make;
    String model;
    int year;

    public static void main(String[] args) {
        CarClass car1 = new CarClass();

        car1.make = "Toyota";
        car1.model = "Camry";
        car1.year = 2024;

        System.out.println(car1.make + " " + car1.model + " " + car1.year);
    }
}
