public class ReservedBook implements ReservedBooks {
    private Book reservedBook;
    private User user;
    private String dateOfIssue;
    private String LastDate;

    public ReservedBook(Book book, User user, String dateOfIssue, String LastDate) {
        this.reservedBook = book;
        this.user = user;
        this.dateOfIssue = dateOfIssue;
        this.LastDate = LastDate;
    }

    public Book setBook(Book reservedBook) {
        this.reservedBook = reservedBook;
        return this.reservedBook;  //To change body of created methods use File | Settings | File Templates.
    }

    public Book getBook() {
        return reservedBook;
    }

    public User setUser(User user) {
        this.user = user;
        return this.user;
    }

    public User getUser() {
        return user;
    }

    public String setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
        return this.dateOfIssue;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public String setLastDate(String lastDate) {
        this.LastDate = lastDate;
        return this.LastDate;
    }

    public String getLastDate() {
        return LastDate;
    }

    public boolean matches(ReservedBooks reservedbook) {
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
