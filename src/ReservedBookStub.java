public class ReservedBookStub implements ReservedBooks {
    @Override
    public Book setBook(Book reservedBook) {
        return  new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
    }

    @Override
    public Book getBook() {
        return  new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
    }

    @Override
    public User setUser(User user) {
        return  new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
    }

    @Override
    public User getUser() {
        return  new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
    }

    @Override
    public String setDateOfIssue(String dateOfIssue) {
        return null;
    }

    @Override
    public String getDateOfIssue() {
        return null;
    }

    @Override
    public String setLastDate(String lastDate) {
        return null;
    }

    @Override
    public String getLastDate() {
        return null;
    }

    @Override
    public boolean matches(ReservedBooks reservedbook) {
        return true;
    }
}
