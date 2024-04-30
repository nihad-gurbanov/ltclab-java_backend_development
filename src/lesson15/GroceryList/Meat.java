package lesson15.GroceryList;

public class Meat extends Product {
    Meat(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }

    @Override
    double getCost() {
        return unitPrice * amount;
    }

    @Override
    public String toString() {
        return "Meat: " + super.toString();
    }
}
