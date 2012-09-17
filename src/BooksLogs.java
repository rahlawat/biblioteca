public interface BooksLogs {
     Book book = new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
    int totalCopies = 0;
    int unreservedCopies =0;

    public boolean matches(BooksLogs bookLog) ;
    public Book getBook() ;
    public Book setBook(BookStub book);
    public int setTotalCopies(int totalCopies);
    public int getTotalCopies();
    public int setUnreservedCopies(int unreservedCopies);
    public int getUnreservedCopies();
    public int updateUnreservedCopies(int unreserved);

}
