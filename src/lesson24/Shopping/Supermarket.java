package lesson24.Shopping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermarket {
    private List<Product> products;

    public Supermarket() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product... product) {
        Collections.addAll(products, product);
    }

    public void removeProduct(long productId, double amount) {
        products.removeIf(p -> p.getId() == productId && p.getAmount() >= amount);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
