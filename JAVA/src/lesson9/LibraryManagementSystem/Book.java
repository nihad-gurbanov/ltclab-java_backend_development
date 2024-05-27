package lesson9.LibraryManagementSystem;

public class Book {
    String title;
    Author author;
    int publicationYear;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
