package lesson10;

public class GarbageCollectionDemo {
    public static void main(String[] args) {
        // Create an object
        Object obj = new Object();

        // Make the object unreachable
        obj = null;

        // Call runGarbageCollector method to trigger garbage collection
        runGarbageCollector();
    }

    public static void runGarbageCollector() {
        // Request garbage collection
        System.gc();

        // Pause for a moment to allow garbage collection to complete
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Garbage collection completed.");
    }
}

