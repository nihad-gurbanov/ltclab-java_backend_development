package lesson10.barbecuerestaurant;

public class Barbecue {
    String name;
    double price;

    public Barbecue (String name, double price) {
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
        return "Barbecue{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
