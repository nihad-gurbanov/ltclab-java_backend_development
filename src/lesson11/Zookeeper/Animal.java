package lesson11.Zookeeper;

public class Animal {
    String name;
    String species;
    int age;
    static int totalVisitors = 0;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
        totalVisitors++;
    }


    public void makeSound() {
        System.out.println(name + " makes a sound..");
    }

    public int getTotalVisitors() {
        return totalVisitors;
    }
}
