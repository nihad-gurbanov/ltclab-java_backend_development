package lesson14.MathOperationsMentor;

public class Main {
    public static void main(String[] args) {
        MathOperations operation = new MathOperations();

        System.out.println(operation.multiply(15, 26));
        System.out.println(operation.multiply(15.5, 26.0));


        AdvancedMathOperations advancedOperation = new AdvancedMathOperations();

        System.out.println(advancedOperation.multiply(4, 8, true));
        System.out.println(advancedOperation.multiply(4, 8, false));

    }
}
