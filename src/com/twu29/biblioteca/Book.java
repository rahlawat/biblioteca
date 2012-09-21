package com.twu29.biblioteca;

public class Book implements BookSchema {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }


    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean matches(BookSchema book) {
        if(title != book.getTitle())
            return false;
        if((author != null) && (author != book.getAuthor()))
            return false;
        if((ISBN != null) && (ISBN != book.getISBN()))
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
