package lesson18;

public class MyStringBuffer {
    static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) {
            Thread thread1 = new Thread(new AppendTask("Hello"));
            Thread thread2 = new Thread(new AppendTask(" World"));
            thread1.start();
            thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Final content: " + stringBuffer);
        }

    static class AppendTask implements Runnable {
        private String text;

        public AppendTask(String text) {
            this.text = text;
        }

        @Override
        public void run() {
            synchronized (stringBuffer) {
                stringBuffer.append(text);
            }
        }
    }
}
