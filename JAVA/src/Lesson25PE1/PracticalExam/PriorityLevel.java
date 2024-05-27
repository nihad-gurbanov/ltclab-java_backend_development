package Lesson25PE1.PracticalExam;

public enum PriorityLevel {
    LOW(3),
    MEDIUM(2),
    HIGH(1);

    private final Integer value;

    PriorityLevel(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
