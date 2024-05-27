package lesson17;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("first");
        MyThread t2 = new MyThread("second");
        MyThread t3 = new MyThread("third");


        t1.start();
        t2.start();
        t3.start();
    }
}
