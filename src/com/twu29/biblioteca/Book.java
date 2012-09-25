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

    protected String getTitle() {
        return title;
    }

    protected String getAuthor() {
        return author;
    }

    protected String getISBN() {
        return ISBN;
    }

    public boolean matches(Book book) {
        if(title != book.getTitle())
            return false;
        if(((author != null) && (book.getAuthor() != null)) && (author != book.getAuthor()))
            return false;
        if(((ISBN != null) && (book.getISBN() != null)) && (ISBN != book.getISBN()))
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public void printBook() {
        System.out.println(title+"    "+author+"    "+ISBN);
    }
}
