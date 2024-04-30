package lesson15.GroceryList;

abstract class Product {
    String name;
    double unitPrice;
    double amount;

    Product(String name, double unitPrice, double amount) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    abstract double getCost();

    @Override
    public String toString() {
        return name + " - $" + unitPrice + " per unit, " + amount + " units";
    }
}
