package lesson15.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5, 10);
        Circle circle = new Circle(1);

        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
