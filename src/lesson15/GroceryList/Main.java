package lesson15.GroceryList;

public class Main {
    public static void main(String[] args) {
        GroceryShopping groceryShopping = new GroceryShopping(5);

        groceryShopping.addProduct(new Dairy("Milk", 2.5, 2));
        groceryShopping.addProduct(new FreshProduce("Apples", 1.2, 3));
        groceryShopping.addProduct(new Meat("Chicken", 5.0, 1.5));

        groceryShopping.printReceipt();
    }
}
