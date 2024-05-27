package lesson17.OddEvenPrint.V1;

class OddThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500); // To simulate asynchronous behavior
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}