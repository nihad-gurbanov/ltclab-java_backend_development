package lesson24.Shopping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Customer {
    private String name;
    private double budget;
    private List<Product> basket;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
        this.basket = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    public void doShoppingIn (Supermarket store) {
        store.getProducts().sort(Comparator.comparingDouble(Product::getPrice));

        for (Product product : store.getProducts()) {
            if (product.getPrice() <= budget) {
                double affordableAmount = Math.min(product.getAmount(), budget / product.getPrice());
                basket.add(new Product(product.getId(), product.getName(), product.getPrice(), affordableAmount));
                budget -= product.getPrice() * affordableAmount;
            }
        }
    }
}
