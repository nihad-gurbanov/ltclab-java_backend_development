package Lesson25PE1.PracticalExam;

import java.util.*;

public class TaskManager {
    List<Task> tasks = new LinkedList<>();

    void addTask (Task task) throws DuplicateTaskException {

        if (tasks.contains(task)) {
            throw new DuplicateTaskException("This task exists!");
        } else {
            tasks.add(task);
            Collections.sort(tasks);
        }
    }

    void removeTask (String text) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (Objects.equals(task.text, text)) {
                iterator.remove();
            }
        }
    }


    @Override
    public String toString() {
        return tasks.toString();
    }
}
