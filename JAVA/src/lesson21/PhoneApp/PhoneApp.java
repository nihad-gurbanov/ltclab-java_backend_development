package lesson21.PhoneApp;

import java.util.HashMap;
import java.util.Map;

public class PhoneApp {
    Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String number) {
        if (contacts.get(name) == null) {
            contacts.put(name, number);
            System.out.print(name + ": ");
            System.out.println("Contact added!");
        }
        else {
            System.out.println("This contact already exists!");
        }
        System.out.println("___________________________________________");
    }

    public void searchContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.print(name + ": ");
            System.out.println(contacts.get(name));
        } else {
            System.out.println(name + " not found!");
        }
        System.out.println("___________________________________________");
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.print(name + ": ");
            System.out.println(contacts.remove(name));
            System.out.println("Contact deleted!");
        } else {
            System.out.println(name + " not found!");
        }
        System.out.println("___________________________________________");
    }

    public void displayAll() {
        System.out.println("-----All Contacts-----");
        for (Map.Entry<String, String> entry: contacts.entrySet()) {
            System.out.println("| "+ entry.getKey() + " : " + entry.getValue() + " |");
        }
        System.out.println("----------------------");
        System.out.println("___________________________________________");
    }
}
