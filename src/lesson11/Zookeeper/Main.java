package lesson11.Zookeeper;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Lev", "Lion", 7);
        System.out.println(lion.name);
        Feeder feeder = new Feeder();

        Trainer john = new Trainer();
        feeder.prepareMeal("meat", lion);
        john.teachTrick("Jumping through circle", lion);
        lion.makeSound();

        Animal elephant = new Animal("Dizzy", "Elephant", 10);
        System.out.println(lion.name);
        Feeder feeder1 = new Feeder();

        System.out.println();

        Trainer ted = new Trainer();
        feeder.prepareMeal("meat", elephant);
        ted.teachTrick("Jumping through circle", lion);
        lion.makeSound();
        System.out.println("Trained animal count: " + Animal.totalVisitors);

    }
}
