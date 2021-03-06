package com.twu29.biblioteca;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public boolean matchTitle(String bookTitle) {
        return (title.equals(bookTitle));
    }

    @Override
    public String toString() {
        return title+"    "+author+"    "+ISBN ;
    }
}
