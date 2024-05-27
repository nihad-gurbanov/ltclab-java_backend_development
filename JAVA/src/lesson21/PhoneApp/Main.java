package lesson21.PhoneApp;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------Phone app has started.----------\n" +
                "___________________________________________" +
                "\n-add > 'name number'  |  -delete > name" +
                "\n-search > 'name'  |  -displayAll  |  -exit" +
                "\n___________________________________________");
        PhoneApp app = new PhoneApp();

        while (isRunning) {
            String command = scanner.nextLine().trim();

            if (command.toLowerCase(Locale.ROOT).equals("add")) {
                String contact = scanner.nextLine();
                app.addContact(contact.split(" ")[0], contact.split(" ")[1]);
            } else if (command.toLowerCase(Locale.ROOT).equals("search")) {
                String contact = scanner.nextLine();
                app.searchContact(contact);
            } else if (command.toLowerCase(Locale.ROOT).equals("delete")) {
                String contact = scanner.nextLine();
                app.deleteContact(contact);
            } else if (command.toLowerCase(Locale.ROOT).equals("display all")) {
                app.displayAll();
            } else if (command.toLowerCase(Locale.ROOT).equals("exit")) {
                isRunning = false;
            } else {
                System.out.println("Command not found, try 'add', 'delete'\n'search' or 'displayAll'");
            }
        }
    }
}
