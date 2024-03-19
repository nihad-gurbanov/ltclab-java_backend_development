package lesson10.shopping;

public class Main {
    public static void main(String[] args) {
        Item bread = new Item("bread", 1.1);
        Item milk = new Item("milk", 1.99);
        Item sugar = new Item("sugar", 1.5);
        Item potato = new Item("potato", 0.85);


        ShoppingList shoppingList = new ShoppingList();

        shoppingList.addItem(bread);
        shoppingList.addItem(milk);
        shoppingList.addItem(sugar);
        shoppingList.addItem(potato);

        System.out.println("Shopping list total cost: " + shoppingList.calculateTotalCost());
        System.out.println(shoppingList);
        System.out.println(bread);

    }
}
