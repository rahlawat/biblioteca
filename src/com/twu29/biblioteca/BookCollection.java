package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollection {
    List<Book> bookList;
    List<Book> reservedList;

    public BookCollection() {
        bookList = new ArrayList<Book>();
        reservedList = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.bookList.add(book);
    }

    public boolean searchBook(String userInput) {
        for (int index = 0;index<bookList.size();index++ ) {
            Book book1 = bookList.get(index);
            if (book1.matchTitle(userInput))
            {
                reserveBook(index);
                return true;
            }
        }
        return false;
    }

    private void reserveBook(int index) {
        reservedList.add(bookList.remove(index));
    }

    public int count(){
        return bookList.size();
    }

    public String bookInformation(int index){
        return (bookList.get(index)).toString();
    }
}