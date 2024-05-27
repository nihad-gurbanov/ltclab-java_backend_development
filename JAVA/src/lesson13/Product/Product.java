package lesson13.Product;

public class Product {
    protected String brand;
    protected String model;

    public Product(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    final String getInfo() {
        return brand + " " + model;
    }
}
