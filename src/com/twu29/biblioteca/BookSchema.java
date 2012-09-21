package com.twu29.biblioteca;

public interface BookSchema {
    public String getTitle();
    public void setTitle(String title);
    public void setAuthor(String author);
    public String getAuthor();
    public void setISBN(String ISBN);
    public String getISBN();
    public boolean matches(BookSchema book);
}
