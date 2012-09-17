public class BookLogStub implements BooksLogs {
    private Book book ;
    private int totalCopies;
    private int unreservedCopies;

    @Override
    public boolean matches(BooksLogs bookLog) {
        return true;
    }

    @Override
    public Book getBook() {
        return new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
    }

    @Override
    public Book setBook(BookStub book) {
        return new Book("When The Light Fades","Kathy Rodgers","1-84223-247-9");
    }

    @Override
    public int setTotalCopies(int totalCopies) {
        return 0;
    }

    @Override
    public int getTotalCopies() {
        return 0;
    }

    @Override
    public int setUnreservedCopies(int unreservedCopies) {
        return 0;
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
