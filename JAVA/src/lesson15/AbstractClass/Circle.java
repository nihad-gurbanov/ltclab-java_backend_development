package lesson15.AbstractClass;

public class Circle extends Shape{
    int radius;

    public Circle(int radius) {
        super(0);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * radius * radius;
    }
}
