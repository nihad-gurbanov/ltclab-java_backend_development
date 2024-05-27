package lesson6;

import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        /*Create a program that makes a grocery list using a String array.
        Prompt the user to enter the grocery items, which will be stored
        in the array. Then, print out the grocery list in a fun
        and interactive way.*/

        System.out.println("Enter list of items to buy 🍇🍈🍉🍊🍌:");
        Scanner scanner = new Scanner(System.in);
        String items = scanner.nextLine();

        String[] groceryList = items.split(" ");

        System.out.println("Grocery List:\n🥜🫘🍞🍆🍉🍊🍌");
        for (String product: groceryList) {
            System.out.println(product);
        }
        System.out.println("🥜🫘🍞🍆🍉🍊🍌");

    }
}
