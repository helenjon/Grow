package lesson12;

public class Book {

    private String name;
    private String author;
    private Integer year;
    private String level;

    public Book(String name, String author, Integer year, String level){
        this.name = name;
        this.author = author;
        this.year = year;
        this.level= level;
    }

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, Integer year){
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
