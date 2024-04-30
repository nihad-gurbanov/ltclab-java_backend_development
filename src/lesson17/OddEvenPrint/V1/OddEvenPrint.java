package lesson17.OddEvenPrint.V1;

public class OddEvenPrint {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddThread());
        Thread evenThread = new Thread(new EvenThread());

        oddThread.start();
        evenThread.start();
    }
}
