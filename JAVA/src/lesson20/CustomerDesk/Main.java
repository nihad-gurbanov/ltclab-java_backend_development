package lesson20.CustomerDesk;

public class Main {
    public static void main(String[] args) {
        Customer alex = new Customer("Alex", true);
        Customer tom = new Customer("Tom", false);
        Customer ben = new Customer("Ben", false);
        Customer kate = new Customer("Kate", true);

        System.out.println("Senders " + Customer.getSenders());
        System.out.println("Receivers " + Customer.getReceivers());
    }
}
