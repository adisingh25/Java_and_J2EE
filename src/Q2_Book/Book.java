package Q2_Book;

public class Book {
    int id;
    String title;
    String author;
    String publisher;
    double price;

    Book() {}
    Book(int id, String title, String author, String publisher, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
