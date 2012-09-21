package com.twu29.biblioteca;

public interface BookLogSchema {
    public boolean matches(BookLogSchema bookLog) ;
    public BookSchema getBook() ;
    public void setBook(BookSchema book);
    public void setTotalCopies(int totalCopies);
    public int getTotalCopies();
    public void setUnreservedCopies(int unreservedCopies);
    public int getUnreservedCopies();
    public int updateUnreservedCopies(int unreserved);

}
