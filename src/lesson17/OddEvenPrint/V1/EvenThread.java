package lesson17.OddEvenPrint.V1;

class EvenThread implements Runnable {
    @Override
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500); // To simulate asynchronous behavior
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
