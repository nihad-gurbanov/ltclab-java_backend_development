package lesson14.ShapeCalculator;

public class Main {
    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        // Calculate area of a rectangle
        double rectangleArea = calculator.calculateArea(5.0, 4.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        // Calculate area of a circle
        double circleArea = calculator.calculateArea(3.0);
        System.out.println("Area of circle: " + circleArea);

        // Calculate area of a triangle
        double triangleArea = calculator.calculateArea(5, 3);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
