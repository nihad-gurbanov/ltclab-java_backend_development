package lesson9.LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling", 1965);
        Author author2 = new Author("George Orwell", 1903);

        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1);
        Book book2 = new Book("1984", author2);
        Book book3 = new Book("To Kill a Mockingbird", new Author("Harper Lee", 1960));
        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);
        System.out.println(book3);
    }
}
