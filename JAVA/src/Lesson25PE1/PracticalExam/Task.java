package Lesson25PE1.PracticalExam;

import java.util.Objects;

public class Task implements Comparable<Task> {
    String text;
    PriorityLevel priority;

    public Task(String text, int hour) {
        this.text = text;
        if (hour <= 4) {
            this.priority = PriorityLevel.LOW;
        } else if (hour <= 8) {
            this.priority = PriorityLevel.MEDIUM;
        } else {
            this.priority = PriorityLevel.HIGH;
        }
    }

    @Override
    public String toString() {
        return text + " " + priority + "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(text, task.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority.getValue(), other.priority.getValue());
    }
}
