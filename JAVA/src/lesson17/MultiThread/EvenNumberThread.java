package lesson17.MultiThread;

public class EvenNumberThread extends Thread {
    private static final int MAX_NUMBER = 10000;

    public void run() {
        for (int i = 2; i <= MAX_NUMBER; i += 2) {
            System.out.println("Even Numbers " + Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}