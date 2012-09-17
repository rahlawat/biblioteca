public interface ReservedBooks {
     Book reservedBook = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
     User user = new User("Renu Ahlawat","New Delhi",28011250,"01/21/2011");
     String dateOfIssue = " ";
     String LastDate = " ";
    public Book setBook(Book reservedBook);
    public Book getBook();
    public User setUser(User user);
    public User getUser();
    public String setDateOfIssue(String dateOfIssue);
    public String getDateOfIssue();
    public String setLastDate(String lastDate);
    public String getLastDate();
    public boolean matches(ReservedBooks reservedbook);
}
