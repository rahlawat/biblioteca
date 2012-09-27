package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    List<Book> bookList;

    public BookCollection() {
        bookList = new ArrayList<Book>();
    }

    public boolean addBook(Book book) {
        this.bookList.add(book);
        return true;
    }

    public boolean searchBook(String userInput) {
        for (Iterator i = bookList.iterator(); i.hasNext(); ) {
            Book book1 = (Book) i.next();
            if (book1.matchTitle(userInput))
                return true;
        }
        return false;
    }

    public boolean printBook(Console console) {
        for (Iterator i = bookList.iterator(); i.hasNext(); ) {
            Book book = (Book) i.next();
            console.println(book.toString());
        }
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}