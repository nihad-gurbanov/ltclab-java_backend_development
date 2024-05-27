package lesson12.LibraryBook;

public class LibraryBook {
    private String title;
    private String author;
    private int yearPublished;
    private boolean checkedOut;

    // Constructor
    public LibraryBook(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.checkedOut = false;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Sorry, the book is already checked out.");
        }
    }

    public void returnBook() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("The book is not checked out.");
        }
    }

    public boolean isAvailable() {
        return !checkedOut;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }
}

