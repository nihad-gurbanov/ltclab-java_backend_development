package lesson11.Zookeeper;

public class Feeder {
    public void prepareMeal(String food, Animal animal) {
        System.out.println("Preparing meal with: " + food + " for " + animal.name);
        System.out.println("Meal is ready!");
    }


}
