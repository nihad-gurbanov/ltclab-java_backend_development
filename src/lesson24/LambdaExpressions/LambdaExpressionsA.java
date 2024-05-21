package lesson24.LambdaExpressions;


public class LambdaExpressionsA {
    public static void main(String[] args) {
        CheckPositive isPositive = x -> x>0;

        int[] testNumbers = {10, -5, 0, 15, -20};
        for (int number: testNumbers) {
            System.out.println(isPositive.test(number));
        }
    }
}

@FunctionalInterface
interface CheckPositive {
    boolean test(int x);
}