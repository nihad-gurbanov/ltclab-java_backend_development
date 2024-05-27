package lesson12.LibraryBook;

public class LibraryTest {
    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Java Programming", "John Doe", 2022);

        System.out.println("Book Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Year Published: " + book.getYearPublished());

        book.checkOut();

        System.out.println("Is the book available? " + book.isAvailable());

        book.returnBook();

        System.out.println("Is the book available now? " + book.isAvailable());
    }
}
