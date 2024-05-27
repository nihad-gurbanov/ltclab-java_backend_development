package lesson13.Override;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println("Area of circle is: " + circle.calculateArea());


        Rectangle rectangle = new Rectangle(5, 8);
        System.out.println("Area of rectangle is: " + rectangle.calculateArea());

    }
}
