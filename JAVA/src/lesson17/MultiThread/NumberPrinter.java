package lesson17.MultiThread;

public class NumberPrinter {
    public static void main(String[] args) {
        EvenNumberThread evenThread = new EvenNumberThread();
        OddNumberThread oddThread = new OddNumberThread();

        evenThread.start();
        oddThread.start();
    }
}