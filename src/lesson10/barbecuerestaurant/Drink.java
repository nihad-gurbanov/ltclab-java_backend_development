package lesson10.barbecuerestaurant;

public class Drink {
    String name;
    double price;

    public Drink (String name, double price) {
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
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
