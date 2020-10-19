package lesson12;

public class Book {

    private final String name;
    private final String author;
    private Integer year;

    public Book(String name, String author, Integer year, String level) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

}
