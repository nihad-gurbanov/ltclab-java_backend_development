package lesson22.ComparableAndComparator;

import lesson13.Product.Product;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, 10.99);
        Book book2 = new Book("1984", "George Orwell", 1949, 8.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 12.50);
        Book book4 = new Book("Pride and Prejudice", "Jane Austen", 1813, 7.25);
        Book book5 = new Book("The Catcher in the Rye", "J.D. Salinger", 1951, 9.75);

        ArrayList<Book> booksArray = new ArrayList<>();
        booksArray.add(book1);
        booksArray.add(book2);
        booksArray.add(book3);
        booksArray.add(book4);
        booksArray.add(book5);

        System.out.println("Original list ➡️ ");
        printBooks(booksArray);

        System.out.println("Natural ordering by publication year 🔽️ ");
        Collections.sort(booksArray);
        printBooks(booksArray);

        System.out.println("Order by author 🔽 ");
        AuthorComparator authorComparator = new AuthorComparator();
        booksArray.sort(authorComparator);
        printBooks(booksArray);

        System.out.println("Order by price 🔽 ");
        PriceComparator priceComparator = new PriceComparator();
        booksArray.sort(priceComparator);
        printBooks(booksArray);

        System.out.println("Order by title 🔽 ");
        TitleComparator titleComparator = new TitleComparator();
        booksArray.sort(titleComparator);
        printBooks(booksArray);
    }


    public static void printBooks(ArrayList<Book> list) {
        System.out.printf("%-25s %-25s %-10s %-10s%n", "Title", "Author", "Year", "Price");
        for (Book book : list) {
            System.out.printf("%-25s %-25s %-10d $%.2f%n", book.title, book.author, book.publicationYear, book.price);
        }
        System.out.println();
    }
}
