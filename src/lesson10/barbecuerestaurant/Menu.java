package lesson10.barbecuerestaurant;

public class Menu {
    Barbecue barbecue;
    Appetizer appetizer;
    Drink drink;

    public Menu (Barbecue barbecue, Appetizer appetizer, Drink drink) {
        this.barbecue = barbecue;
        this.appetizer = appetizer;
        this.drink = drink;
    }

    double calculateTotalPrice() {
        double sum;
        sum = barbecue.price + appetizer.price + drink.price;

        return sum;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "barbecue=" + barbecue +
                ", appetizer=" + appetizer +
                ", drink=" + drink +
                '}';
    }
}
