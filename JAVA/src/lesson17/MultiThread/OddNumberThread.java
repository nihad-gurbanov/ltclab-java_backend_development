package lesson17.MultiThread;

public class OddNumberThread extends Thread {
    private static final int MAX_NUMBER = 10000;

    public void run() {
        for (int i = 1; i <= MAX_NUMBER; i += 2) {
            System.out.println("Odd numbers " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}