package lesson22.Comperable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 10.99);
        Book book2 = new Book("1984", "George Orwell", 8.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.50);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 7.25);
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", 9.75);

        ArrayList<Book> booksArray = new ArrayList<>();
        booksArray.add(book1);
        booksArray.add(book2);
        booksArray.add(book3);
        booksArray.add(book4);
        booksArray.add(book5);

        Collections.sort(booksArray);


        System.out.printf("%-25s %-25s %s%n", "Title", "Author", "Price ASC");
        for (Book book : booksArray) {
            System.out.printf("%-25s %-25s $%.2f%n", book.title, book.author, book.price);
        }
    }
}
