package lesson22.Comperable;

public class Book implements Comparable<Book>{
    String title;
    String author;
    Double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        return (int) (this.price - o.price);
    }
}
