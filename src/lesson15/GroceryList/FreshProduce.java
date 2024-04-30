package lesson15.GroceryList;

public class FreshProduce extends Product {
    FreshProduce(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }

    @Override
    double getCost() {
        return unitPrice * amount;
    }

    @Override
    public String toString() {
        return "Fresh Produce: " + super.toString();
    }
}