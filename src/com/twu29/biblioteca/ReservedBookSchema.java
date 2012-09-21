package com.twu29.biblioteca;

public interface ReservedBookSchema {
    public void setBook(BookSchema reservedBook);
    public BookSchema getBook();
    public void setUser(User user);
    public User getUser();
    public void setDateOfIssue(String dateOfIssue);
    public String getDateOfIssue();
    public void setLastDate(String lastDate);
    public String getLastDate();
    public boolean matches(ReservedBookSchema reservedbook);
}
