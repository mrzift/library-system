package librarysystem.model;

import jakarta.persistence.*;

@Entity
@Table
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String book;
    private String author;
    private String publisher;
    private int year;

    public Books(){

    }

    public Books(long id, String book, String author, String publisher, int year) {
        this.id = id;
        this.book = book;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
