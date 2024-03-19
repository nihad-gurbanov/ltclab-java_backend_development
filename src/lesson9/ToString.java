package lesson9;

public class ToString {
    private String name;
    private int age;

    public ToString(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString() to provide a meaningful representation
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        // Create a Person object
        ToString person = new ToString("Alice", 30);

        // Print the object using toString()
        System.out.println("Person object: " + person);
    }
}

