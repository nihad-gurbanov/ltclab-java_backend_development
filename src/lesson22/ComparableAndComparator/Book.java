package lesson22.ComparableAndComparator;

public class Book implements Comparable<Book>{
    public String title;
    public String author;
    Integer publicationYear;
    public Double price;

    public Book(String title, String author, Integer publicationYear, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return this.publicationYear - o.publicationYear;
    }
}
