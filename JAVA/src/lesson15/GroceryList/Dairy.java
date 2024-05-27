package lesson15.GroceryList;

class Dairy extends Product {
    Dairy(String name, double unitPrice, double amount) {
        super(name, unitPrice, amount);
    }

    @Override
    double getCost() {
        return unitPrice * amount;
    }

    @Override
    public String toString() {
        return "Dairy: " + super.toString();
    }
}
