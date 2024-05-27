package lesson23.SortPerson;

class Person {
    private final double weight;
    private final String name;

    public Person(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Constructor, getters, and setters

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
