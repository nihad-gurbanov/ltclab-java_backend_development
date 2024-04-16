package lesson14.MathOperationsMentor;

public class AdvancedMathOperations extends MathOperations {
    @Override
    int multiply(int num1, int num2, boolean toPower) {
        if (toPower) {
            return (int) Math.pow(num1, num2);
        }
        return num1 * num2;
    }
}
