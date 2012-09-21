package com.twu29.biblioteca;

public class BookLog implements BookLogSchema {

    private BookSchema book;
    private int totalCopies;
    private int unreservedCopies;

    public BookLog(BookSchema book, int totalCopies, int unreservedCopies) {
        this.book = book;
        this.totalCopies =totalCopies;
        this.unreservedCopies = unreservedCopies;
        //To change body of created methods use File | Settings | File Templates.
    }


    public boolean matches(BookLogSchema bookLog) {
        if((book.matches(bookLog.getBook()) == false))
            return  false;
        if((totalCopies != 0) && (totalCopies != bookLog.getTotalCopies()))
            return false;
        if((unreservedCopies != 0) && (unreservedCopies != bookLog.getUnreservedCopies()))
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }

    public BookSchema getBook() {
        return book;
    }

    public void setBook(BookSchema book) {
        this.book = book;
    }

    public void setTotalCopies(int totalCopies) {
        this.totalCopies = totalCopies;
    }

    public int getTotalCopies() {
        return totalCopies;
    }

    public void setUnreservedCopies(int unreservedCopies) {
        this.unreservedCopies = unreservedCopies;
    }

    public int getUnreservedCopies() {
        return unreservedCopies;
    }

    public int updateUnreservedCopies(int unreserved) {
        unreservedCopies = unreservedCopies + unreserved;
        return unreservedCopies;  //To change body of created methods use File | Settings | File Templates.
    }
}
