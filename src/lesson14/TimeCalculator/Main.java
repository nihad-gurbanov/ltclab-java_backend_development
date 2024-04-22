package lesson14.TimeCalculator;

public class Main {
    public static void main(String[] args) {
        TimeCalculator calculator = new TimeCalculator();

        System.out.println(calculator.calculateDifference(15, 10, 18, 13)); //
        System.out.println(calculator.calculateDifference(18, 13, 18, 10));

        System.out.println(calculator.calculateDifference(18, 10, 18, 30));
        System.out.println(calculator.calculateDifference(-18, 30, 18, 10));


        System.out.println(calculator.calculateDifference("18:20", "19:30"));



    }
}
