package lesson15.AbstractClass;

abstract class Shape {
    abstract double calculateArea();
    int shapeSides;

    public Shape(int side) {
        shapeSides = side;
    }
}
