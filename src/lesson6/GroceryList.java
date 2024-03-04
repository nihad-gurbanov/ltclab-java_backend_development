package lesson6;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        System.out.println("Enter list of items to buy:");
        Scanner scanner = new Scanner(System.in);
        String items = scanner.nextLine();

        String[] groceryList = items.split(" ");

        System.out.println("Grocery List:");
        for (String product: groceryList) {
            System.out.println(product);
        }
    }
}
