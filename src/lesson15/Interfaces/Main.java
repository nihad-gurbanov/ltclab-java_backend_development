package lesson15.Interfaces;

public class Main {
    public static void main(String[] args) {
        ResizableRectangle rectangle = new ResizableRectangle(3, 5);

        System.out.println(rectangle.toString());
        rectangle.resize(2);
        System.out.println(rectangle.toString());
    }
}
