package com.epam.javacodeconvention.lesson12;

public class BookInfo {

    private final String name;
    private final String author;
    private Integer year;

    public BookInfo(String name, String author, Integer year, String level) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public BookInfo(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public BookInfo(String name, String author, Integer year) {
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
