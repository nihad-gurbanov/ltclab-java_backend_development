package lesson20.Queue;

import java.util.Queue;
import java.util.LinkedList;


public class MyQueue {
    public static void main(String[] args) {
        Queue<String> taskQueue = new LinkedList<>();

        taskQueue.add("Finish Python Projects");
        taskQueue.add("Watch Java Tutorials");
        taskQueue.add("Do some research");

        while (!taskQueue.isEmpty()) {
            String element = taskQueue.poll();
            System.out.println(element);
        }
    }
}
