package lesson24.Shopping;

public class Test {
    public static void main(String[] args) {
        // Create some sample products
        Product apple = new Product(1, "Apple", 1.0, 10.0);
        Product banana = new Product(2, "Banana", 0.8, 15.0);
        Product orange = new Product(3, "Orange", 1.2, 8.0);

        // Create a supermarket and add products
        Supermarket supermarket = new Supermarket();
        supermarket.addProduct(apple, banana, orange);

        // Create a customer with a budget
        Customer customer = new Customer("John", 20.0);

        // Let the customer do the shopping
        customer.doShoppingIn(supermarket);

        // Display the customer's basket
        System.out.println("Customer " + customer.getName() + "'s Basket:");
        for (Product item : customer.getBasket()) {
            System.out.println(item.getName() + " (Price: $" + item.getPrice() + ")");
        }
    }
}
