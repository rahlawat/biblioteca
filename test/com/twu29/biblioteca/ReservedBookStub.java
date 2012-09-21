package com.twu29.biblioteca;

public class ReservedBookStub implements ReservedBookSchema {
    @Override
    public void setBook(BookSchema reservedBook) {
    }

    @Override
    public Book getBook() {
        return  new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
    }

    @Override
    public void setUser(User user) {
    }

    @Override
    public User getUser() {
        return  new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
    }

    @Override
    public void setDateOfIssue(String dateOfIssue) {
    }

    @Override
    public String getDateOfIssue() {
        return null;
    }

    @Override
    public void setLastDate(String lastDate) {
    }

    @Override
    public String getLastDate() {
        return null;
    }

    @Override
    public boolean matches(ReservedBookSchema reservedbook) {
        return true;
    }
}
