package lesson8;

public class ShapeClass {
    String color;
    double width;
    double length;

    public double calculateArea() {
        return width * length;
    }
    public void printShape() {
        String info = color + (width == length ? " square is " : " rectangle is ")
                + calculateArea() + " sq.meters";
        System.out.println(info);
    }
    public static void main(String[] args) {
        ShapeClass rectangle = new ShapeClass();
        rectangle.length = 10;
        rectangle.width = 15;
        rectangle.color = "Orange";
        rectangle.printShape();

        ShapeClass square = new ShapeClass();
        square.length = 15;
        square.width = 15;
        square.color = "Red";
        square.printShape();
    }
}
