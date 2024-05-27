package lesson15.AbstractClass;

public class Square extends Shape{
    int a;
    int b;

    public Square(int a, int b) {
        super(2);
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateArea() {
        return a * b;
    }
}
