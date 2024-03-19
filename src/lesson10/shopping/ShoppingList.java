package lesson10.shopping;

import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    int i = 0;
    double sum = 0;

    List<Item> items = new ArrayList<>();

    double calculateTotalCost () {
        for(Item item : items) {
            if (item != null && item.price != 0) {
                sum += item.price;
            }
        }
        return (double) Math.round(sum * 1000) / 1000;
    }
    void addItem(Item newItem) {
        items.add(newItem);
        i += 1;
    }

    @Override
    public String toString() {
        return "ShoppingList{" +
                "items=" + items +
                '}';
    }
}
