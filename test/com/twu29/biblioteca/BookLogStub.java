package com.twu29.biblioteca;

public class BookLogStub implements BookLogSchema {
    private BookStub book ;
    private int totalCopies;
    private int unreservedCopies;

    @Override
    public boolean matches(BookLogSchema bookLog) {
        return true;
    }

    @Override
    public BookSchema getBook() {
        return new BookStub();
    }

    @Override
    public void setBook(BookSchema book) {
    }

    @Override
    public void setTotalCopies(int totalCopies) {
    }

    @Override
    public int getTotalCopies() {
        return 0;
    }

    @Override
    public void setUnreservedCopies(int unreservedCopies) {
    }

    @Override
    public int getUnreservedCopies() {
        return 0;
    }

    @Override
    public int updateUnreservedCopies(int unreserved) {
        return 0;
    }
}
