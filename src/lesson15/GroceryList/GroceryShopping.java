package lesson15.GroceryList;

public class GroceryShopping {
    private final Product[] shoppingList;
    private int count;

    GroceryShopping(int size) {
        shoppingList = new Product[size];
        count = 0;
    }

    void addProduct(Product product) {
        if (count < shoppingList.length) {
            shoppingList[count++] = product;
        } else {
            System.out.println("Shopping list is full!");
        }
    }

    double calculateTotalCost() {
        double totalCost = 0;
        for (Product product : shoppingList) {
            if (product != null) {
                totalCost += product.getCost();
            }
        }
        return totalCost;
    }

    void printReceipt() {
        System.out.println("----- Receipt -----");
        for (Product product : shoppingList) {
            if (product != null) {
                System.out.println(product);
            }
        }
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
