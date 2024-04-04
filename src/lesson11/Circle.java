package lesson11;

public class Circle {
    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
            Circle circle1 = new Circle(5);

        System.out.println("Area: " + circle1.area());
    }
}
