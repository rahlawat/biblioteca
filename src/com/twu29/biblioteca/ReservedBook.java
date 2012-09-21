package com.twu29.biblioteca;


public class ReservedBook implements ReservedBookSchema {
    private BookSchema reservedBook;
    private User user;
    private String dateOfIssue;
    private String LastDate;

    public ReservedBook(BookSchema book, User user, String dateOfIssue, String LastDate) {
        this.reservedBook = book;
        this.user = user;
        this.dateOfIssue = dateOfIssue;
        this.LastDate = LastDate;
    }

    public void setBook(BookSchema reservedBook) {
        this.reservedBook = reservedBook;
    }

    public BookSchema getBook() {
        return reservedBook;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setLastDate(String lastDate) {
        this.LastDate = lastDate;
    }

    public String getLastDate() {
        return LastDate;
    }

    public boolean matches(ReservedBookSchema reservedbook) {
        if(reservedBook != reservedbook.getBook())
            return false;
        if(user != reservedbook.getUser())
            return false;
        if((dateOfIssue != null) && (dateOfIssue != reservedbook.getDateOfIssue()))
            return  false;
        if((LastDate != null) && (LastDate != reservedbook.getLastDate()))
            return false;
        return true;  //To change body of created methods use File | Settings | File Templates.
    }
}
