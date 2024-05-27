package lesson14.MathOperations;

public class MathOperations {
    // two integers
    public int add(int a, int b) {
        return a + b;
    }

    // three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // two doubles
    public double subtract(double a, double b) {
        return a - b;
    }

    // two floats
    public float multiply(float a, float b) {
        return a * b;
    }

    // two doubles
    public double divide(double numerator, double denominator) {
        if (denominator == 0) {
            System.out.println("Error");
            return 0;
        }
        return numerator / denominator;
    }
}
