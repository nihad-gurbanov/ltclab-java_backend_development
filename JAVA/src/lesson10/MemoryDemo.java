package lesson10;

public class MemoryDemo {
    public static void main(String[] args) {
        MemoryDemo demo = new MemoryDemo();
        demo.stackVsHeap();
    }

    public void stackVsHeap() {
        // Stack: Primitive data types
        int stackInt = 10;
        double stackDouble = 20.5;
        char stackChar = 'A';

        // Heap: Objects
        String heapString = "Hello";
        StringBuilder heapStringBuilder = new StringBuilder("World");

        // Printing values
        System.out.println("Stack Memory:");
        System.out.println("stackInt: " + stackInt);
        System.out.println("stackDouble: " + stackDouble);
        System.out.println("stackChar: " + stackChar);

        System.out.println("\nHeap Memory:");
        System.out.println("heapString: " + heapString);
        System.out.println("heapStringBuilder: " + heapStringBuilder.toString());
    }
}

