package lesson14.ShapeCalculator;

class ShapeCalculator {
    // rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // circle
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // triangle
    public double calculateArea(int base, int height) {
        return 0.5 * base * height;
    }
}
