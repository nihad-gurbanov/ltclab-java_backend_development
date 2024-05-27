package lesson10.barbecuerestaurant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        System.out.println("Barbecue name:");
        String barbecueName = scan.nextLine();
        System.out.println("Barbecue price:");
        double barbecuePrice = scan.nextDouble();
        scan.nextLine(); // to consume empty next line left from nextDouble

        System.out.println("Appetizer name:");
        String appetizerName = scan.nextLine();
        System.out.println("Appetizer price:");
        double appetizerPrice = scan.nextDouble();
        scan.nextLine();

        System.out.println("Drink name:");
        String drinkName = scan.nextLine();
        System.out.println("Drink price:");
        double drinkPrice = scan.nextDouble();
        scan.nextLine();

        Barbecue barbecue = new Barbecue(barbecueName, barbecuePrice);
        Appetizer appetizer = new Appetizer(appetizerName, appetizerPrice);
        Drink drink = new Drink(drinkName, drinkPrice);

        Menu order = new Menu(barbecue, appetizer, drink);

        System.out.println("Total Menu Price: " + order.calculateTotalPrice());
    }
}
