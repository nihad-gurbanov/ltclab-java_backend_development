package lesson17.OddEvenPrint.V2;

public class OddEvenPrint {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());

        oddThread.start();
        try {
            oddThread.join(); // Wait for the odd thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        evenThread.start();
    }
}
