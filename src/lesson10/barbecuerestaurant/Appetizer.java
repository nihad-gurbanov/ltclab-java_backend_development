package lesson10.barbecuerestaurant;

public class Appetizer {
    String name;
    double price;

    public Appetizer (String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice () {
        return price;
    }

    @Override
    public String toString() {
        return "Appetizer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
