package com.twu29.biblioteca;

public class BookStub implements BookSchema{
    private String title = "When The Light Fades";
    private String author = "Kathy Rodgers";
    private String ISBN = "1-84223-247-9";
    public BookStub() {
        //super(title, author, ISBN);
    }
    @Override
    public boolean matches(BookSchema book) {
        return true;
    }

    @Override
    public String getTitle() {
        return title;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String setTitle(String title) {
        return title;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String setAuthor(String author) {
        return this.author;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getAuthor() {
        return author;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String setISBN(String ISBN) {
        return this.ISBN;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getISBN() {
        return ISBN;  //To change body of implemented methods use File | Settings | File Templates.
    }

}
