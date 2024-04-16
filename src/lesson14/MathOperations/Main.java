package lesson14.MathOperations;

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        // addition methods
        System.out.println("Addition:");
        System.out.println("Result: " + math.add(5, 10));
        System.out.println("Result: " + math.add(5, 10, 15));

        // subtraction method
        System.out.println("\nSubtraction:");
        System.out.println("Result: " + math.subtract(10.5, 3.5));

        // multiplication method
        System.out.println("\nMultiplication:");
        System.out.println("Result: " + math.multiply(2.5f, 4.0f));

        // division method
        System.out.println("\nDivision:");

        System.out.println("Result: " + math.divide(10.0, 2.0));
        System.out.println("Result: " + math.divide(5.0, 0.0));
    }
}